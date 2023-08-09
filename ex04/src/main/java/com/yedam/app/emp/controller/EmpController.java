package com.yedam.app.emp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.app.emp.mapper.EmpMapper;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/emp")
@Slf4j
public class EmpController {

	@Autowired //@Setter(onMethod_ = @Autowired) 같음, 세터에 붙이는게 성능은 더좋다고함
	EmpMapper Mapper;
	
	@GetMapping("/list")
	public ResponseEntity< List<Map<String, Object>>> getList () {
		return ResponseEntity.status(HttpStatus.OK).body(Mapper.getList());
	}
	
}
