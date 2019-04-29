package com.cc.open.dao;

import com.cc.open.domain.Academy;
import com.cc.open.domain.AcademyExample;
import com.cc.open.vo.AcademyVO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcademyMapper {
    long countByExample(AcademyExample example);

    int deleteByExample(AcademyExample example);

    int deleteByPrimaryKey(String academyId);

    int insert(Academy record);

    int insertSelective(Academy record);

    List<Academy> selectByExample(AcademyExample example);

    Academy selectByPrimaryKey(String academyId);

    int updateByExampleSelective(@Param("record") Academy record, @Param("example") AcademyExample example);

    int updateByExample(@Param("record") Academy record, @Param("example") AcademyExample example);

    int updateByPrimaryKeySelective(Academy record);

    int updateByPrimaryKey(Academy record);

	List<AcademyVO> findAllAcademy(@Param("isEnable") String isEnable);

	void updateAcademyByNum(@Param("academyVO") AcademyVO academyVO);

	AcademyVO findAcademyById(@Param("academyId") String academyId);

	void deleteLogically(@Param("academyIds") List<String> academyIds);
	
	void restLogically(@Param("academyIds") List<String> academyIds);

	AcademyVO findAcademyByName(@Param("academy") AcademyVO academy);

	int createAcademy(@Param("academyVO") AcademyVO academyVO);

	void deletePhy(List<String> academyIds);
}