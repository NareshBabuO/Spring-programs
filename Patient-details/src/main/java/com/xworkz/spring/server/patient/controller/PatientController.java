package com.xworkz.spring.server.patient.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.spring.server.patient.entity.PatientEntity;
import com.xworkz.spring.server.patient.service.PatientService;

@Component
@Controller
@RequestMapping("/save")
public class PatientController {
	@Autowired
	private PatientService service;

	public PatientController() {
		System.out.println("PatientController using default Constr..");
	}

	@PostMapping
	public String onSend(PatientEntity entity, Model model, @RequestParam String file) {
		System.out.println("Executing onSend");

		boolean findByEmail = service.findByEmail(entity.getEmail());
		boolean findByMobileNo = service.findByMobileNo(entity.getMobileNo());

		if (!findByEmail) {
			model.addAttribute("error", "Email already exists" + entity.getEmail());
			return "index";
		} else if (!findByMobileNo) {
			model.addAttribute("error1", "Mobile Number already Exists" + entity.getMobileNo());
			return "index";
		} else {
			boolean validateAndSave = service.validateAndSave(entity);
			if (validateAndSave) {
				System.out.println("Data Fetched:" + entity);
				model.addAttribute("message", "Patient info saved Successfully");
				model.addAttribute("entity", entity);
				if (entity.getFileName() != null) {
					byte[] bytes;
					System.out.println("File Original name :" + entity.getFileName().getOriginalFilename());
					System.out.println("File Original Size :" + entity.getFileName().getSize());
					System.out.println("File original type :" + entity.getFileName().getContentType());

					try {
						bytes = entity.getFileName().getBytes();
						Path path = Paths.get("D://projectimages/" + entity.getFileName().getOriginalFilename());
						// Files.write(path, bytes);
						Files.write(path, bytes);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				return "SaveSuccuess";
			} else {
				model.addAttribute("error", "Patient info Not Saved");
				System.out.println("Data is not saved");
				return "index";
			}
		}

	}

	@GetMapping
	public String findByName(@RequestParam String name, @RequestParam int greaterThanAge,
			@RequestParam int lesserThanAge, Model model) {
		System.out.println("Name selected from UI :" + name);
		Optional<List<PatientEntity>> optionalList = this.service.findByName(name, greaterThanAge, lesserThanAge);
		if (optionalList.isPresent() && optionalList.get().size() > 0) {
			System.out.println("Data is Present");
			List<PatientEntity> list = optionalList.get();
			System.out.println(list);
			model.addAttribute("list", list);
		} else {
			System.out.println("Data is Not Present" + name);
			model.addAttribute("message", "No Results found");
		}
		return "Search";
	}

	@GetMapping(value = "/files/{file_name}")
	public void getFile(@PathVariable("file_name") String fileName, HttpServletResponse response) throws IOException {

		System.out.println("File name is :" + fileName);

		Path path = Paths.get("D://projectimages/" + fileName);

		byte[] fileBytes = Files.readAllBytes(path);
		response.reset();
		response.setContentType("image/jpg");
		try {
			response.getOutputStream().write(fileBytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
