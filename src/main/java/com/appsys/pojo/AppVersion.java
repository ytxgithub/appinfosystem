package com.appsys.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AppVersion {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column app_version.id
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column app_version.appId
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	private Long appid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column app_version.versionNo
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	private String versionno;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column app_version.versionInfo
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	private String versioninfo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column app_version.publishStatus
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	private Long publishstatus;
	private String publishstatusName;
	
	public String getPublishstatusName() {
		return publishstatusName;
	}

	public void setPublishstatusName(String publishstatusName) {
		this.publishstatusName = publishstatusName;
	}

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column app_version.downloadLink
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	private String downloadlink;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column app_version.versionSize
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	private BigDecimal versionsize;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column app_version.createdBy
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	private Long createdby;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column app_version.creationDate
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	private Date creationdate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column app_version.modifyBy
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	private Long modifyby;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column app_version.modifyDate
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	private Date modifydate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column app_version.apkLocPath
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	private String apklocpath;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column app_version.apkFileName
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	private String apkfilename;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column app_version.id
	 * @return  the value of app_version.id
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column app_version.id
	 * @param id  the value for app_version.id
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column app_version.appId
	 * @return  the value of app_version.appId
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public Long getAppid() {
		return appid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column app_version.appId
	 * @param appid  the value for app_version.appId
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public void setAppid(Long appid) {
		this.appid = appid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column app_version.versionNo
	 * @return  the value of app_version.versionNo
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public String getVersionno() {
		return versionno;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column app_version.versionNo
	 * @param versionno  the value for app_version.versionNo
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public void setVersionno(String versionno) {
		this.versionno = versionno;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column app_version.versionInfo
	 * @return  the value of app_version.versionInfo
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public String getVersioninfo() {
		return versioninfo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column app_version.versionInfo
	 * @param versioninfo  the value for app_version.versionInfo
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public void setVersioninfo(String versioninfo) {
		this.versioninfo = versioninfo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column app_version.publishStatus
	 * @return  the value of app_version.publishStatus
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public Long getPublishstatus() {
		return publishstatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column app_version.publishStatus
	 * @param publishstatus  the value for app_version.publishStatus
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public void setPublishstatus(Long publishstatus) {
		this.publishstatus = publishstatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column app_version.downloadLink
	 * @return  the value of app_version.downloadLink
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public String getDownloadlink() {
		return downloadlink;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column app_version.downloadLink
	 * @param downloadlink  the value for app_version.downloadLink
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public void setDownloadlink(String downloadlink) {
		this.downloadlink = downloadlink;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column app_version.versionSize
	 * @return  the value of app_version.versionSize
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public BigDecimal getVersionsize() {
		return versionsize;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column app_version.versionSize
	 * @param versionsize  the value for app_version.versionSize
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public void setVersionsize(BigDecimal versionsize) {
		this.versionsize = versionsize;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column app_version.createdBy
	 * @return  the value of app_version.createdBy
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public Long getCreatedby() {
		return createdby;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column app_version.createdBy
	 * @param createdby  the value for app_version.createdBy
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column app_version.creationDate
	 * @return  the value of app_version.creationDate
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public Date getCreationdate() {
		return creationdate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column app_version.creationDate
	 * @param creationdate  the value for app_version.creationDate
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column app_version.modifyBy
	 * @return  the value of app_version.modifyBy
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public Long getModifyby() {
		return modifyby;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column app_version.modifyBy
	 * @param modifyby  the value for app_version.modifyBy
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public void setModifyby(Long modifyby) {
		this.modifyby = modifyby;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column app_version.modifyDate
	 * @return  the value of app_version.modifyDate
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public Date getModifydate() {
		return modifydate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column app_version.modifyDate
	 * @param modifydate  the value for app_version.modifyDate
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column app_version.apkLocPath
	 * @return  the value of app_version.apkLocPath
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public String getApklocpath() {
		return apklocpath;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column app_version.apkLocPath
	 * @param apklocpath  the value for app_version.apkLocPath
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public void setApklocpath(String apklocpath) {
		this.apklocpath = apklocpath;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column app_version.apkFileName
	 * @return  the value of app_version.apkFileName
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public String getApkfilename() {
		return apkfilename;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column app_version.apkFileName
	 * @param apkfilename  the value for app_version.apkFileName
	 * @mbggenerated  Fri Jun 19 17:35:16 CST 2020
	 */
	public void setApkfilename(String apkfilename) {
		this.apkfilename = apkfilename;
	}
}