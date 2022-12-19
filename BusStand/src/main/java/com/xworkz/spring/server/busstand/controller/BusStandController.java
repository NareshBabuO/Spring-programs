package com.xworkz.spring.server.busstand.controller;

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

import com.xworkz.spring.server.busstand.dto.BusStandDTO;
import com.xworkz.spring.server.busstand.service.BusStandService;

@Component
@Controller
@RequestMapping("/send")
public class BusStandController {

	@Autowired
	public BusStandService service;

	public BusStandController() {
		System.out.println(getClass().getName());
	}

	@PostMapping
	public String onSend(BusStandDTO dto, Model model) {
		System.out.println("executing the on send method");
		boolean validateAndSave = service.ValidateAndSave(dto);
		if (validateAndSave) {
			System.out.println(dto);
			model.addAttribute("message", "Bike Details Saved Successfully");
		} else {
			model.addAttribute("error", "you have entered the invalid data,please check the data");
			model.addAttribute("dto", dto);
		}
		return "index";
	}

	@GetMapping
	public String findByLocation(@RequestParam String location, Model model) {
		System.out.println("Location selected from UI" + location);
		Optional<List<BusStandDTO>> findByLocation = this.service.findByLocation(location);
		if (findByLocation.isPresent() && findByLocation.get().size() > 0) {
			System.out.println("Data is present ");
			List<BusStandDTO> list = findByLocation.get();
			System.out.println("Total List is found" + list.size());
			model.addAttribute("list", list);
			return "SearchResult";
		} else {
			{
				System.out.println("Data is not present for " + location);
				model.addAttribute("message", "No Results found");
				return "Search";
			}
		}
	}
}
