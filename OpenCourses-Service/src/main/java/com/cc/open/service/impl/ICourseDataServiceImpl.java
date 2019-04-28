package com.cc.open.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.open.dao.CourseDataMapper;
import com.cc.open.service.ICourseDataService;

@Service
public class ICourseDataServiceImpl implements ICourseDataService {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private CourseDataMapper courseDataDao;

}
