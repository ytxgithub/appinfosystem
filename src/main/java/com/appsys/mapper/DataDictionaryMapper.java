package com.appsys.mapper;

import java.util.List;

import com.appsys.pojo.DataDictionary;

public interface DataDictionaryMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table data_dictionary
	 * @mbggenerated  Fri Jun 19 16:45:22 CST 2020
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table data_dictionary
	 * @mbggenerated  Fri Jun 19 16:45:22 CST 2020
	 */
	int insert(DataDictionary record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table data_dictionary
	 * @mbggenerated  Fri Jun 19 16:45:22 CST 2020
	 */
	int insertSelective(DataDictionary record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table data_dictionary
	 * @mbggenerated  Fri Jun 19 16:45:22 CST 2020
	 */
	DataDictionary selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table data_dictionary
	 * @mbggenerated  Fri Jun 19 16:45:22 CST 2020
	 */
	int updateByPrimaryKeySelective(DataDictionary record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table data_dictionary
	 * @mbggenerated  Fri Jun 19 16:45:22 CST 2020
	 */
	int updateByPrimaryKey(DataDictionary record);

	/**
     * 查询所属平台
     * @return
     */
    List<DataDictionary> listFlatform();
}