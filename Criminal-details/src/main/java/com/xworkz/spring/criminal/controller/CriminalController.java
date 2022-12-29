package com.xworkz.spring.criminal.controller;

import java.io.File;
import java.io.IOException;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.spring.criminal.entity.CriminalEntity;
import com.xworkz.spring.criminal.service.CriminalService;

@Component
@RequestMapping("/criminal")
public class CriminalController {

	@Autowired
	private CriminalService service;

	public CriminalController() {
		System.out.println("CriminalController in Criminal Entity");
	}

	@PostMapping
	public String onSend(CriminalEntity entity, Model model, @RequestParam("file") MultipartFile file) {
		System.out.println("On send method is running in Criminal");

		try {
			byte[] bytes = file.getBytes();
			String files = System.currentTimeMillis() + "_" + file.getOriginalFilename();
			Path path = Paths.get("D:\\CriminalPhotos\\" + files);
			System.out.println(path);
			Files.write(path, bytes);
			entity.setFileName(files);
			long size = file.getSize();
			entity.setFileSize(size);
			String name = file.getName();
			entity.setName(name);
			String contentType = file.getContentType();
			entity.setContentType(contentType);

		} catch (IOException e) {
			e.printStackTrace();
		}

		boolean validateAndSave = service.ValidateAndSave(entity);
		if (validateAndSave) {
			System.out.println("Data is valid and saved successfully");
			model.addAttribute("entity", entity);
			return "SaveSuccuess";
		} else {
			System.out.println("Data is not valid please enter the valid data");
			return "index";
		}

	}

	@GetMapping
	public String onSearch(@RequestParam String name, @RequestParam String jailName, Model model) {
		System.out.println("Executing OnSearch Method in Criminal");
		Optional<List<CriminalEntity>> findByNameAndJailName = service.findByNameAndJailName(name, jailName);
		if (findByNameAndJailName.isPresent() && findByNameAndJailName.get().size() > 0) {
			System.out.println("data is present");
			List<CriminalEntity> list = findByNameAndJailName.get();
			model.addAttribute("list", list);
			model.addAttribute("message", "Data is Found");
			return "Search";
		} else {
			System.out.println("Data is Not Present Kindly Check it");
			model.addAttribute("message", "Data is Not Found");
			return "Search";

		}

	}
	
	@GetMapping(value = "/files/{file_name}")
	public void getFile(@PathVariable("file_name") String fileName,HttpServletResponse response) throws IOException {
		System.out.println("File name is "+fileName);

		Path path = Paths
				.get("D:\\CriminalPhotos\\" +fileName);
	    byte[] file = Files.readAllBytes(path);
	    File file2 = new File("D:\\CriminalPhotos\\"+fileName);
	    response.reset();
	    String mimeType = URLConnection.guessContentTypeFromName(file2.getName());
	    response.setContentType(mimeType); 
	    
	    try {
//	        response.getOutputStream().write(file);
	    	response.getOutputStream().write(Files.readAllBytes(file2.toPath()));
	        String contentType = response.getContentType();
	        
	        
	    } catch (IOException e) {

	    	e.printStackTrace();
	    }
	}

}