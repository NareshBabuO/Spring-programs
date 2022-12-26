package com.xworkz.spring.server.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.spring.server.dto.BikeDTO;
import com.xworkz.spring.server.service.BikeService;

@Component
@Controller
@RequestMapping("/send")
public class BikeController {

	@Autowired
	public BikeService service;

	public BikeController() {
		System.out.println("BikeController using Default Constr...");
	}

	@PostMapping
	public String onSend(BikeDTO dto, Model model) {
		System.out.println("executing the on send method");
		boolean validateAndSave = service.ValidateAndSave(dto);
		if (validateAndSave) {
			System.out.println(dto);
			model.addAttribute("message", "Bike Details Saved Successfully");
		} else {
			model.addAttribute("error", "you have entered the invalid data,please check the data");
			model.addAttribute("dto", dto);
		}
		return "index.jsp";

	}

	@GetMapping
	public String findByBrand(@RequestParam String brand, Model model) {
		System.out.println("Brand selected from UI" + brand);
		Optional<List<BikeDTO>> optionalList = this.service.findByBrand(brand);
		if (optionalList.isPresent() && optionalList.get().size() > 0) {
			System.out.println("Data is present ");
			List<BikeDTO> list = optionalList.get();
			System.out.println("Total List is found" + list.size());
			model.addAttribute("list", list);
			return "SearchResult";
		} else {
			System.out.println("Data is not present for " + brand);
			model.addAttribute("message", "No Results found");
			return "Search";
		}

	}

}
