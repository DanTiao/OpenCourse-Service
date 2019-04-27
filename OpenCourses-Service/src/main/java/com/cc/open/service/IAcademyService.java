package com.cc.open.service;

import java.util.List;

import com.cc.open.vo.AcademyVO;
import com.cc.open.vo.ResponVO;

public interface IAcademyService {

	ResponVO<List<AcademyVO>> findAllAcademy();

}
