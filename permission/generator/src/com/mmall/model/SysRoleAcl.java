package com.mmall.model;

import java.util.Date;

public class SysRoleAcl {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_acl.id
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_acl.role_id
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_acl.acl_id
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    private Integer aclId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_acl.operator
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    private String operator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_acl.operate_time
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    private Date operateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_acl.operate_ip
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    private String operateIp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_acl.id
     *
     * @return the value of sys_role_acl.id
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_acl.id
     *
     * @param id the value for sys_role_acl.id
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_acl.role_id
     *
     * @return the value of sys_role_acl.role_id
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_acl.role_id
     *
     * @param roleId the value for sys_role_acl.role_id
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_acl.acl_id
     *
     * @return the value of sys_role_acl.acl_id
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public Integer getAclId() {
        return aclId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_acl.acl_id
     *
     * @param aclId the value for sys_role_acl.acl_id
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public void setAclId(Integer aclId) {
        this.aclId = aclId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_acl.operator
     *
     * @return the value of sys_role_acl.operator
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_acl.operator
     *
     * @param operator the value for sys_role_acl.operator
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_acl.operate_time
     *
     * @return the value of sys_role_acl.operate_time
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_acl.operate_time
     *
     * @param operateTime the value for sys_role_acl.operate_time
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_acl.operate_ip
     *
     * @return the value of sys_role_acl.operate_ip
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public String getOperateIp() {
        return operateIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_acl.operate_ip
     *
     * @param operateIp the value for sys_role_acl.operate_ip
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp == null ? null : operateIp.trim();
    }
}