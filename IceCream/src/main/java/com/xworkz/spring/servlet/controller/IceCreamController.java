package com.xworkz.spring.servlet.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.spring.servlet.dto.IceCreamDTO;

@Controller
@RequestMapping("/send")
public class IceCreamController {

	public IceCreamController() {
		System.out.println("This is IceCreamController  Created using Default Constrctor....");
	}

	@PostMapping
	public String onSend(IceCreamDTO dto, HttpServletRequest request) {
		System.out.println("Executing OnSend");
		System.out.println("DTO data Fetch");
		if (dto.getPrice() > 0 && dto.getQuantity() > 0) {
			request.setAttribute("message", "Ice Cream info save Successfully");
		} else {
			request.setAttribute("error", "Ice Cream info not saved");
			request.setAttribute("dto", dto);
		}

		return "index.jsp";

	}

}
