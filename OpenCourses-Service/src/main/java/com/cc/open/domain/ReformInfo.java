package com.cc.open.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ReformInfo {
    private String reformId;

    private String reformTitle;

    private String reformContent;

    private String fileName;

    private String fileUrl;

    private String createBy;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private String isEnable;

    public String getReformId() {
        return reformId;
    }

    public void setReformId(String reformId) {
        this.reformId = reformId;
    }

    public String getReformTitle() {
        return reformTitle;
    }

    public void setReformTitle(String reformTitle) {
        this.reformTitle = reformTitle;
    }

    public String getReformContent() {
        return reformContent;
    }

    public void setReformContent(String reformContent) {
        this.reformContent = reformContent;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable;
    }
}