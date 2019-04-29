package com.cc.open.service.impl;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.open.common.SessionCommon;
import com.cc.open.dao.AcademyMapper;
import com.cc.open.domain.AcademyExample;
import com.cc.open.service.IAcademyService;
import com.cc.open.vo.AcademyVO;
import com.cc.open.vo.CourseVO;
import com.cc.open.vo.ResponVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

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
		List<AcademyVO> list = academyDao.findAllAcademy("1");
		result.setData(list);
		result.setCode("200");
		return result;
	}

	@Override
	public ResponVO<String> updateAcademyByNum(AcademyVO academyVO) {
		ResponVO<String> result = new ResponVO<String>();
		result.setSuccess(false);
		if(SessionCommon.isAdmin(request) || SessionCommon.isSupAdmin(request)) {
			academyDao.updateAcademyByNum(academyVO);
			result.setCode("200");
			result.setSuccess(true);
			return result;
		}
		logger.info("########  权限不足");
		result.setCode("500");
		return result;
	}

	@Override
	public ResponVO<AcademyVO> findAcademyById(String academyId) {
		ResponVO<AcademyVO> result = new ResponVO<>();
		result.setSuccess(false);
		AcademyVO academy = academyDao.findAcademyById(academyId);
		if(academy != null) {
			result.setCode("200");
			result.setSuccess(true);
			result.setData(academy);
		}
		return result;
	}

	@Override
	public ResponVO<String> deleteAcademyLogic(List<String> academyIds) {
		ResponVO<String> result = new ResponVO<String>();
		result.setSuccess(false);
		if(academyIds.isEmpty() || academyIds == null) {
			result.setCode("500");
			result.setMessage("The academyIds is null");
			return result;
		}
		academyDao.deleteLogically(academyIds);
		logger.info("########  Delete logic academy successful");
		result.setCode("200");
		result.setSuccess(true);
		return result;
	}

	@Override
	public ResponVO<String> restAcademyLogic(List<String> academyIds) {
		ResponVO<String> result = new ResponVO<String>();
		result.setSuccess(false);
		if(academyIds.isEmpty() || academyIds == null) {
			result.setCode("500");
			result.setMessage("The academyIds is null");
			return result;
		}
		academyDao.restLogically(academyIds);
		logger.info("########  Rest logic academy successful");
		result.setCode("200");
		result.setSuccess(true);
		return result;
	}

	@Override
	public ResponVO<PageInfo> findAcademyByName(AcademyVO academy) {
		ResponVO<PageInfo> result = new ResponVO<>();
		PageHelper.startPage(1, 10);
		logger.info("########  Paging query by search academy name");
		List<AcademyVO> list = new ArrayList<>();
		AcademyVO acad = academyDao.findAcademyByName(academy);
		list.add(acad);
		PageInfo pageInfo = new PageInfo(list);
		result.setData(pageInfo);
		result.setSuccess(true);
		result.setCode("200");
		return result;
	}

	@Override
	public ResponVO<AcademyVO> createAcademy(AcademyVO academyVO) {
		ResponVO<AcademyVO> result = new ResponVO<>();
		result.setSuccess(false);
		result.setCode("500");
		result.setData(academyVO);
		logger.info("########  Create academy");
		//课程是否已存在
		AcademyVO academy = academyDao.findAcademyByName(academyVO);
		if(academy != null) {
			logger.info("########  academy already exists");
			result.setMessage("学院已存在");
			return result;
		}
		String id = UUID.randomUUID().toString();
		academyVO.setAcademyId(id);
		academyVO.setIsEnable("1");
		int randNum = 0;
		try {
			randNum = SecureRandom.getInstance("SHA1PRNG").nextInt(999999);
		} catch (NoSuchAlgorithmException e) {
			logger.info("NoSuchAlgorithmException"+e);
		}
		String num = "A"+Integer.toString(randNum);
		academyVO.setAcademyNum(num);
		int flag = -1;
		try {
			flag = academyDao.createAcademy(academyVO);
		} catch (Exception e) {
			logger.error("Creat course fail------"+e);
			result.setMessage("创建学院失败");
			return result;
		}
		if(flag>0) {
			result.setCode("200");
			result.setMessage("增加成功");
			result.setSuccess(true);
			result.setData(academyVO);
			logger.info("########  Create academy successful");
		}else {
			result.setMessage("增加失败");
			logger.info("########  Create academy fail");
		}
		return result;
	}

	@Override
	public ResponVO<String> deleteAcademyPhy(List<String> academyIds) {
		ResponVO<String> result = new ResponVO<String>();
		result.setSuccess(false);
		if(academyIds.isEmpty() || academyIds == null) {
			result.setCode("500");
			result.setMessage("The academyIds is null");
			return result;
		}
		academyDao.deletePhy(academyIds);
		logger.info("########  Delete academy successful");
		result.setCode("200");
		result.setSuccess(true);
		return result;
	}

}
