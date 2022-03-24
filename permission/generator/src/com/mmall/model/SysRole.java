package com.mmall.model;

import java.util.Date;

public class SysRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.id
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.name
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.type
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.status
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.remark
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.operator
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    private String operator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.operate_time
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    private Date operateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.operate_ip
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    private String operateIp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.id
     *
     * @return the value of sys_role.id
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.id
     *
     * @param id the value for sys_role.id
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.name
     *
     * @return the value of sys_role.name
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.name
     *
     * @param name the value for sys_role.name
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.type
     *
     * @return the value of sys_role.type
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.type
     *
     * @param type the value for sys_role.type
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.status
     *
     * @return the value of sys_role.status
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.status
     *
     * @param status the value for sys_role.status
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.remark
     *
     * @return the value of sys_role.remark
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.remark
     *
     * @param remark the value for sys_role.remark
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.operator
     *
     * @return the value of sys_role.operator
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.operator
     *
     * @param operator the value for sys_role.operator
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.operate_time
     *
     * @return the value of sys_role.operate_time
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.operate_time
     *
     * @param operateTime the value for sys_role.operate_time
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.operate_ip
     *
     * @return the value of sys_role.operate_ip
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public String getOperateIp() {
        return operateIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.operate_ip
     *
     * @param operateIp the value for sys_role.operate_ip
     *
     * @mbggenerated Thu Mar 24 17:42:12 IRKT 2022
     */
    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp == null ? null : operateIp.trim();
    }
}