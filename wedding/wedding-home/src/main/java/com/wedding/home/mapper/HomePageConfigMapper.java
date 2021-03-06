package com.wedding.home.mapper;

import com.wedding.home.pojo.HomePageConfig;
import com.wedding.home.pojo.HomePageConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HomePageConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_home_page_config
     *
     * @mbggenerated Wed Nov 26 16:23:00 CST 2014
     */
    int countByExample(HomePageConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_home_page_config
     *
     * @mbggenerated Wed Nov 26 16:23:00 CST 2014
     */
    int deleteByExample(HomePageConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_home_page_config
     *
     * @mbggenerated Wed Nov 26 16:23:00 CST 2014
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_home_page_config
     *
     * @mbggenerated Wed Nov 26 16:23:00 CST 2014
     */
    int insert(HomePageConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_home_page_config
     *
     * @mbggenerated Wed Nov 26 16:23:00 CST 2014
     */
    int insertSelective(HomePageConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_home_page_config
     *
     * @mbggenerated Wed Nov 26 16:23:00 CST 2014
     */
    List<HomePageConfig> selectByExample(HomePageConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_home_page_config
     *
     * @mbggenerated Wed Nov 26 16:23:00 CST 2014
     */
    HomePageConfig selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_home_page_config
     *
     * @mbggenerated Wed Nov 26 16:23:00 CST 2014
     */
    int updateByExampleSelective(@Param("record") HomePageConfig record, @Param("example") HomePageConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_home_page_config
     *
     * @mbggenerated Wed Nov 26 16:23:00 CST 2014
     */
    int updateByExample(@Param("record") HomePageConfig record, @Param("example") HomePageConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_home_page_config
     *
     * @mbggenerated Wed Nov 26 16:23:00 CST 2014
     */
    int updateByPrimaryKeySelective(HomePageConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wd_home_page_config
     *
     * @mbggenerated Wed Nov 26 16:23:00 CST 2014
     */
    int updateByPrimaryKey(HomePageConfig record);
}