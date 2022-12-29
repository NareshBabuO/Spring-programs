package com.xworkz.spring.mall.repo;

import java.util.List;
import java.util.Optional;

import com.xworkz.spring.mall.dto.AdminDTO;

public interface AdminRepo {

	boolean save(AdminDTO dto);

	// Optional<List<AdminDTO>> findByNameAndJailName(String name, String jailName);

}
