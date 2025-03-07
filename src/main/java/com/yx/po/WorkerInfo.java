package com.yx.po;

import java.io.Serializable;
import java.util.Date;

public class WorkerInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker_info.id
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker_info.username
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker_info.password
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker_info.realName
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    private String realname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker_info.sex
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker_info.birthday
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    private Date birthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker_info.address
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker_info.tel
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker_info.email
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker_info.registerDate
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    private Date registerdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker_info.workerNumber
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    private String workernumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker_info.avatar
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    private String avatar;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column worker_info.status
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table worker_info
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker_info.id
     *
     * @return the value of worker_info.id
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker_info.id
     *
     * @param id the value for worker_info.id
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker_info.username
     *
     * @return the value of worker_info.username
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker_info.username
     *
     * @param username the value for worker_info.username
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker_info.password
     *
     * @return the value of worker_info.password
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker_info.password
     *
     * @param password the value for worker_info.password
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker_info.realName
     *
     * @return the value of worker_info.realName
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker_info.realName
     *
     * @param realname the value for worker_info.realName
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker_info.sex
     *
     * @return the value of worker_info.sex
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker_info.sex
     *
     * @param sex the value for worker_info.sex
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker_info.birthday
     *
     * @return the value of worker_info.birthday
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker_info.birthday
     *
     * @param birthday the value for worker_info.birthday
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker_info.address
     *
     * @return the value of worker_info.address
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker_info.address
     *
     * @param address the value for worker_info.address
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker_info.tel
     *
     * @return the value of worker_info.tel
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker_info.tel
     *
     * @param tel the value for worker_info.tel
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker_info.email
     *
     * @return the value of worker_info.email
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker_info.email
     *
     * @param email the value for worker_info.email
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker_info.registerDate
     *
     * @return the value of worker_info.registerDate
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public Date getRegisterdate() {
        return registerdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker_info.registerDate
     *
     * @param registerdate the value for worker_info.registerDate
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker_info.workerNumber
     *
     * @return the value of worker_info.workerNumber
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public String getWorkernumber() {
        return workernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker_info.workerNumber
     *
     * @param workernumber the value for worker_info.workerNumber
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public void setWorkernumber(String workernumber) {
        this.workernumber = workernumber == null ? null : workernumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker_info.avatar
     *
     * @return the value of worker_info.avatar
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker_info.avatar
     *
     * @param avatar the value for worker_info.avatar
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column worker_info.status
     *
     * @return the value of worker_info.status
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column worker_info.status
     *
     * @param status the value for worker_info.status
     *
     * @mbggenerated Wed Apr 19 17:37:51 CST 2023
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}