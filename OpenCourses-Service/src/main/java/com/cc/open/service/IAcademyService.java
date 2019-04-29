package com.cc.open.service;

import java.util.List;

import com.cc.open.vo.AcademyVO;
import com.cc.open.vo.ResponVO;
import com.github.pagehelper.PageInfo;

public interface IAcademyService {

	ResponVO<List<AcademyVO>> findAllAcademy();

	ResponVO<String> updateAcademyByNum(AcademyVO academyVO);

	ResponVO<AcademyVO> findAcademyById(String academyId);

	ResponVO<String> deleteAcademyLogic(List<String> academyIds);

	ResponVO<String> restAcademyLogic(List<String> academyIds);

	ResponVO<PageInfo> findAcademyByName(AcademyVO academy);

	ResponVO<AcademyVO> createAcademy(AcademyVO academyVO);

	ResponVO<String> deleteAcademyPhy(List<String> academyIds);

}
