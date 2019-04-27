package com.cc.open.vo;

import java.io.Serializable;

public class AcademyVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String academyId;

    private String academyNum;

    private String academyName;

    private String isEnable;

	public String getAcademyId() {
		return academyId;
	}

	public void setAcademyId(String academyId) {
		this.academyId = academyId;
	}

	public String getAcademyNum() {
		return academyNum;
	}

	public void setAcademyNum(String academyNum) {
		this.academyNum = academyNum;
	}

	public String getAcademyName() {
		return academyName;
	}

	public void setAcademyName(String academyName) {
		this.academyName = academyName;
	}

	public String getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(String isEnable) {
		this.isEnable = isEnable;
	}

}
