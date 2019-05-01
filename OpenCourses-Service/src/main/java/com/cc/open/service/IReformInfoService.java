package com.cc.open.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.cc.open.domain.ReformInfo;
import com.cc.open.vo.ResponVO;

public interface IReformInfoService {

	ResponVO<ReformInfo> createReformInfo(ReformInfo reformInfo, MultipartFile file);

	ResponVO<ReformInfo> updateReformInfo(ReformInfo reformInfo);

	ResponVO<String> deleteReformInfo(List<String> reformIds);

	ResponVO<ReformInfo> getReformInfodetalis(String reformId);

}
