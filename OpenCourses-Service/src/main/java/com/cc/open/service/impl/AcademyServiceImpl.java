package com.cc.open.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.open.dao.AcademyMapper;
import com.cc.open.domain.AcademyExample;
import com.cc.open.service.IAcademyService;
import com.cc.open.vo.AcademyVO;
import com.cc.open.vo.ResponVO;

@Service
public class AcademyServiceImpl implements IAcademyService {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private AcademyMapper academyDao;

	@Override
	public ResponVO<List<AcademyVO>> findAllAcademy() {
		ResponVO<List<AcademyVO>> result = new ResponVO<List<AcademyVO>>();
		List<AcademyVO> list = academyDao.findAllAcademy();
		result.setData(list);
		result.setCode("200");
		return result;
	}

}
