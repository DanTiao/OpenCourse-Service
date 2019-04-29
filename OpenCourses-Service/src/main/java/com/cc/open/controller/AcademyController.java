package com.cc.open.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cc.open.common.ConstantCommon;
import com.cc.open.dao.AcademyMapper;
import com.cc.open.service.IAcademyService;
import com.cc.open.vo.AcademyVO;
import com.cc.open.vo.ResponVO;
import com.cc.open.vo.UserVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping(value = "/academy")
public class AcademyController {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private IAcademyService academyService;
	
	@Autowired
	private AcademyMapper academyDao;
	
	@RequestMapping(value = "/find", method = RequestMethod.GET, produces = "application/json")
	public ResponVO<List<AcademyVO>> findAllAcademy(){
		return academyService.findAllAcademy();
	}
	
	@RequestMapping(value = "/findAll/{pageNum}/{pageSize}", method = RequestMethod.GET, produces = "application/json")
	public ResponVO<PageInfo> findAllAcademy(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize, @RequestParam("isEnable") String isEnable){
		ResponVO<PageInfo> result = new ResponVO<>();
		PageHelper.startPage(pageNum, pageSize);
		logger.info("########  Paging query");
		List<AcademyVO> listAcademy = academyDao.findAllAcademy(isEnable);
		PageInfo pageInfo = new PageInfo(listAcademy);
		result.setData(pageInfo);
		result.setSuccess(true);
		result.setCode("200");
		return result;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<String> updateAcademy(@RequestBody AcademyVO academyVO){
		return academyService.updateAcademyByNum(academyVO);
	}
	
	@RequestMapping(value = "/find/{academyId}", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<AcademyVO> findAcademyById(@PathVariable("academyId") String academyId){
		return academyService.findAcademyById(academyId);
	}
	
	@RequestMapping(value = "/find/{academyName}/{isEnable}", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<PageInfo> findAcademyByName(@PathVariable("academyName") String academyName, @PathVariable("isEnable") String isEnable){
		AcademyVO academy = new AcademyVO();
		academy.setAcademyName(academyName);
		academy.setIsEnable(isEnable);
		return academyService.findAcademyByName(academy);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<String> deleteAcademyLogic(@RequestBody List<String> academyIds){
		return academyService.deleteAcademyLogic(academyIds);
	}
	
	@RequestMapping(value = "/delete/academys", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<String> deleteAcademyPhy(@RequestBody List<String> academyIds){
		return academyService.deleteAcademyPhy(academyIds);
	}
	
	@RequestMapping(value = "/rest", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<String> restAcademyLogic(@RequestBody List<String> academyIds){
		return academyService.restAcademyLogic(academyIds);
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<AcademyVO> createAcademy(@RequestBody AcademyVO academyVO){
		return academyService.createAcademy(academyVO);
	}
	

}
