package com.mmall.dao;

import com.mmall.model.SysRoleAcl;

public interface SysRoleAclMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_acl
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_acl
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    int insert(SysRoleAcl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_acl
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    int insertSelective(SysRoleAcl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_acl
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    SysRoleAcl selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_acl
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    int updateByPrimaryKeySelective(SysRoleAcl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_acl
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    int updateByPrimaryKey(SysRoleAcl record);
}