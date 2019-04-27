package com.cc.open.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cc.open.service.IAcademyService;
import com.cc.open.vo.AcademyVO;
import com.cc.open.vo.ResponVO;

@RestController
@RequestMapping(value = "/academy")
public class AcademyController {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private IAcademyService academyService;
	
	@RequestMapping(value = "/find", method = RequestMethod.GET, produces = "application/json")
	public ResponVO<List<AcademyVO>> findAllAcademy(){
		return academyService.findAllAcademy();
	}

}
