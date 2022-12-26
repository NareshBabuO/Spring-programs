package com.xworkz.spring.server.oyo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.spring.server.oyo.entity.OyoRoomEntity;
import com.xworkz.spring.server.oyo.service.OyoRoomService;

@Component
@RequestMapping("/send")
public class OyoRoomController {

	@Autowired
	public OyoRoomService service;

	public OyoRoomController() {
		System.out.println("OyoRoomController in oyo room");
	}

	@PostMapping
	public String onSend(OyoRoomEntity entity, Model model) {
		System.out.println("executing onSend");
		boolean validateAndSave = service.ValidateAndSave(entity);
		if (validateAndSave) {
			System.out.println("entity data Fetch" + entity);
			model.addAttribute("message", "Oyo room info save Successfully");
		} else {
			model.addAttribute("error", "oyo room info not saved");
			model.addAttribute("entity", entity);
		}
		return "index.jsp";
	}
}