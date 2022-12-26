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

import com.xworkz.spring.server.dto.TempleDTO;
import com.xworkz.spring.server.service.TempleService;

@Component
@Controller
@RequestMapping("/send")
public class TempleController {

	@Autowired
	public TempleService service;

	public TempleController() {
		System.out.println("TempleController using Default Constr....");
	}

	@PostMapping
	public String onSend(TempleDTO dto, Model model) {
		System.out.println("executing onSend");
		boolean validateAndSave = service.ValidateAndSave(dto);
		if (validateAndSave) {
			System.out.println("DTO data Fetch" + dto);
			model.addAttribute("message", "Temple info save Successfully");
		} else {
			model.addAttribute("error", "Temple info not saved");
			model.addAttribute("dto", dto);

		}
		return "index.jsp";
	}

	@GetMapping
	public String findByGod(@RequestParam String god, Model model) {
		System.out.println("God selected from UI" + god);
		Optional<List<TempleDTO>> optionalList = this.service.findByGod(god);
		if (optionalList.isPresent() && optionalList.get().size() > 0) {
			System.out.println("Data is present ");
			List<TempleDTO> list = optionalList.get();
			System.out.println("Total List is found" + list.size());
			model.addAttribute("list", list);

			return "SearchResult.jsp";
		} else {
			System.out.println("Data is not present for " + god);
			model.addAttribute("message", "No Results found");
			return "Search.jsp";
		}
	}

}
