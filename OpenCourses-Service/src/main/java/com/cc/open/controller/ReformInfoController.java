package com.cc.open.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cc.open.dao.ReformInfoMapper;
import com.cc.open.domain.ReformInfo;
import com.cc.open.domain.ReformInfoExample;
import com.cc.open.service.IReformInfoService;
import com.cc.open.vo.ResponVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping(value = "/reform")
public class ReformInfoController {

	@Autowired
	private IReformInfoService reformInfoService;
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private ReformInfoMapper reformInfoDao;
	
	/**
	 * 创建改革信息
	 * @param reformInfo
	 * @return
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<ReformInfo> createReformInfo(ReformInfo reformInfo, @RequestParam("file") MultipartFile file){
		
		return reformInfoService.createReformInfo(reformInfo, file);
	}
	
	@RequestMapping(value = "/findAll/{pageNum}/{pageSize}", method = RequestMethod.GET, produces = "application/json")
	public ResponVO<PageInfo> findAllReformInfo(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
		ResponVO<PageInfo> result = new ResponVO<>();
		PageHelper.startPage(pageNum, pageSize);
		logger.info("########  Paging query reform info");
		List<ReformInfo> list = reformInfoDao.selectByExample(new ReformInfoExample());
		PageInfo pageInfo = new PageInfo(list);
		result.setCode("200");
		result.setData(pageInfo);
		result.setMessage("查询教学改革信息成功");
		
		return result;
	}
	
	/**
	 * 更新改革信息
	 * @param reformInfo
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<ReformInfo> updateReformInfo(@RequestBody ReformInfo reformInfo){
		return reformInfoService.updateReformInfo(reformInfo);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<String> deleteReformInfo(@RequestBody List<String> reformIds){
		return reformInfoService.deleteReformInfo(reformIds);
	}
	
	@RequestMapping(value = "/detalis/{reformId}", method = RequestMethod.GET, produces = "application/json")
	public ResponVO<ReformInfo> getReformInfodetalis(@PathVariable("reformId") String reformId){
		return reformInfoService.getReformInfodetalis(reformId);
	}
}
