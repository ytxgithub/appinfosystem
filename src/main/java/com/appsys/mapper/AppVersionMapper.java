package com.appsys.mapper;

import com.appsys.pojo.AppVersion;

public interface AppVersionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    int insert(AppVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    int insertSelective(AppVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    AppVersion selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    int updateByPrimaryKeySelective(AppVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated Wed Jun 17 11:32:14 CST 2020
     */
    int updateByPrimaryKey(AppVersion record);
}