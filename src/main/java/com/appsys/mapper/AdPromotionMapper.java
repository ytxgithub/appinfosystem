package com.appsys.mapper;

import com.appsys.pojo.AdPromotion;

public interface AdPromotionMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_promotion
	 * @mbggenerated  Fri Jun 19 16:45:22 CST 2020
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_promotion
	 * @mbggenerated  Fri Jun 19 16:45:22 CST 2020
	 */
	int insert(AdPromotion record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_promotion
	 * @mbggenerated  Fri Jun 19 16:45:22 CST 2020
	 */
	int insertSelective(AdPromotion record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_promotion
	 * @mbggenerated  Fri Jun 19 16:45:22 CST 2020
	 */
	AdPromotion selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_promotion
	 * @mbggenerated  Fri Jun 19 16:45:22 CST 2020
	 */
	int updateByPrimaryKeySelective(AdPromotion record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ad_promotion
	 * @mbggenerated  Fri Jun 19 16:45:22 CST 2020
	 */
	int updateByPrimaryKey(AdPromotion record);
}