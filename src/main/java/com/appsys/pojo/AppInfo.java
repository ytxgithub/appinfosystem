package com.appsys.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AppInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.id
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.softwareName
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private String softwarename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.APKName
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private String apkname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.supportROM
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private String supportrom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.interfaceLanguage
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private String interfacelanguage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.softwareSize
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private BigDecimal softwaresize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.updateDate
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private Date updatedate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.devId
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private Long devid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.appInfo
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private String appinfo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.status
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private Long status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.onSaleDate
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private Date onsaledate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.offSaleDate
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private Date offsaledate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.flatformId
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private Long flatformid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.categoryLevel3
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private Long categorylevel3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.downloads
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private Long downloads;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.createdBy
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private Long createdby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.creationDate
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private Date creationdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.modifyBy
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private Long modifyby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.modifyDate
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private Date modifydate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.categoryLevel1
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private Long categorylevel1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.categoryLevel2
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private Long categorylevel2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.logoPicPath
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private String logopicpath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.logoLocPath
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private String logolocpath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.versionId
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    private Long versionid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.id
     *
     * @return the value of app_info.id
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.id
     *
     * @param id the value for app_info.id
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.softwareName
     *
     * @return the value of app_info.softwareName
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public String getSoftwarename() {
        return softwarename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.softwareName
     *
     * @param softwarename the value for app_info.softwareName
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setSoftwarename(String softwarename) {
        this.softwarename = softwarename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.APKName
     *
     * @return the value of app_info.APKName
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public String getApkname() {
        return apkname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.APKName
     *
     * @param apkname the value for app_info.APKName
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setApkname(String apkname) {
        this.apkname = apkname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.supportROM
     *
     * @return the value of app_info.supportROM
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public String getSupportrom() {
        return supportrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.supportROM
     *
     * @param supportrom the value for app_info.supportROM
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setSupportrom(String supportrom) {
        this.supportrom = supportrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.interfaceLanguage
     *
     * @return the value of app_info.interfaceLanguage
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public String getInterfacelanguage() {
        return interfacelanguage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.interfaceLanguage
     *
     * @param interfacelanguage the value for app_info.interfaceLanguage
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setInterfacelanguage(String interfacelanguage) {
        this.interfacelanguage = interfacelanguage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.softwareSize
     *
     * @return the value of app_info.softwareSize
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public BigDecimal getSoftwaresize() {
        return softwaresize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.softwareSize
     *
     * @param softwaresize the value for app_info.softwareSize
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setSoftwaresize(BigDecimal softwaresize) {
        this.softwaresize = softwaresize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.updateDate
     *
     * @return the value of app_info.updateDate
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public Date getUpdatedate() {
        return updatedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.updateDate
     *
     * @param updatedate the value for app_info.updateDate
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.devId
     *
     * @return the value of app_info.devId
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public Long getDevid() {
        return devid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.devId
     *
     * @param devid the value for app_info.devId
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setDevid(Long devid) {
        this.devid = devid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.appInfo
     *
     * @return the value of app_info.appInfo
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public String getAppinfo() {
        return appinfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.appInfo
     *
     * @param appinfo the value for app_info.appInfo
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setAppinfo(String appinfo) {
        this.appinfo = appinfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.status
     *
     * @return the value of app_info.status
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public Long getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.status
     *
     * @param status the value for app_info.status
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.onSaleDate
     *
     * @return the value of app_info.onSaleDate
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public Date getOnsaledate() {
        return onsaledate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.onSaleDate
     *
     * @param onsaledate the value for app_info.onSaleDate
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setOnsaledate(Date onsaledate) {
        this.onsaledate = onsaledate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.offSaleDate
     *
     * @return the value of app_info.offSaleDate
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public Date getOffsaledate() {
        return offsaledate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.offSaleDate
     *
     * @param offsaledate the value for app_info.offSaleDate
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setOffsaledate(Date offsaledate) {
        this.offsaledate = offsaledate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.flatformId
     *
     * @return the value of app_info.flatformId
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public Long getFlatformid() {
        return flatformid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.flatformId
     *
     * @param flatformid the value for app_info.flatformId
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setFlatformid(Long flatformid) {
        this.flatformid = flatformid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.categoryLevel3
     *
     * @return the value of app_info.categoryLevel3
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public Long getCategorylevel3() {
        return categorylevel3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.categoryLevel3
     *
     * @param categorylevel3 the value for app_info.categoryLevel3
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setCategorylevel3(Long categorylevel3) {
        this.categorylevel3 = categorylevel3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.downloads
     *
     * @return the value of app_info.downloads
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public Long getDownloads() {
        return downloads;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.downloads
     *
     * @param downloads the value for app_info.downloads
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setDownloads(Long downloads) {
        this.downloads = downloads;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.createdBy
     *
     * @return the value of app_info.createdBy
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public Long getCreatedby() {
        return createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.createdBy
     *
     * @param createdby the value for app_info.createdBy
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.creationDate
     *
     * @return the value of app_info.creationDate
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.creationDate
     *
     * @param creationdate the value for app_info.creationDate
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.modifyBy
     *
     * @return the value of app_info.modifyBy
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public Long getModifyby() {
        return modifyby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.modifyBy
     *
     * @param modifyby the value for app_info.modifyBy
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setModifyby(Long modifyby) {
        this.modifyby = modifyby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.modifyDate
     *
     * @return the value of app_info.modifyDate
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.modifyDate
     *
     * @param modifydate the value for app_info.modifyDate
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.categoryLevel1
     *
     * @return the value of app_info.categoryLevel1
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public Long getCategorylevel1() {
        return categorylevel1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.categoryLevel1
     *
     * @param categorylevel1 the value for app_info.categoryLevel1
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setCategorylevel1(Long categorylevel1) {
        this.categorylevel1 = categorylevel1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.categoryLevel2
     *
     * @return the value of app_info.categoryLevel2
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public Long getCategorylevel2() {
        return categorylevel2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.categoryLevel2
     *
     * @param categorylevel2 the value for app_info.categoryLevel2
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setCategorylevel2(Long categorylevel2) {
        this.categorylevel2 = categorylevel2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.logoPicPath
     *
     * @return the value of app_info.logoPicPath
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public String getLogopicpath() {
        return logopicpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.logoPicPath
     *
     * @param logopicpath the value for app_info.logoPicPath
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setLogopicpath(String logopicpath) {
        this.logopicpath = logopicpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.logoLocPath
     *
     * @return the value of app_info.logoLocPath
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public String getLogolocpath() {
        return logolocpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.logoLocPath
     *
     * @param logolocpath the value for app_info.logoLocPath
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setLogolocpath(String logolocpath) {
        this.logolocpath = logolocpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.versionId
     *
     * @return the value of app_info.versionId
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public Long getVersionid() {
        return versionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.versionId
     *
     * @param versionid the value for app_info.versionId
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    public void setVersionid(Long versionid) {
        this.versionid = versionid;
    }
}