package com.mmall.dao;

import com.mmall.model.SysAclModule;

public interface SysAclModuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl_module
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl_module
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    int insert(SysAclModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl_module
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    int insertSelective(SysAclModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl_module
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    SysAclModule selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl_module
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    int updateByPrimaryKeySelective(SysAclModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_acl_module
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    int updateByPrimaryKey(SysAclModule record);
}