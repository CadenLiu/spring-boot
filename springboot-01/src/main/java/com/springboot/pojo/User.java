/******************************************************************
** 类    名：User
** 描    述：用户
** 创 建 者：bianj
** 创建时间：2017-08-03 00:34:51
******************************************************************/

package com.springboot.pojo;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 用户(M_USER)
 * 
 * @author bianj
 * @version 1.0.0 2017-08-03
 */
public class User implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 609456608850389451L;
    
    /**  */
    private Long id;
    
    /** 用户名 */
    private String userName;
    
    /** 密码 */
    private String password;
    
    /** 盐 */
    private String salt;
    
    /** 昵称 */
    private String nickname;
    
    /** 状态(1：正常，2：禁用；默认1) */
    private Integer status;
    
    /** 创建时间 */
    private Date createTime;
    
    /** 更新时间 */
    private Timestamp lastupdateTime;
        
    /**
     * 获取
     * 
     * @return 
     */
    public Long getId() {
        return this.id;
    }
     
    /**
     * 设置
     * 
     * @param id
     *          
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * 获取用户名
     * 
     * @return 用户名
     */
    public String getUserName() {
        return this.userName;
    }
     
    /**
     * 设置用户名
     * 
     * @param userName
     *          用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * 获取密码
     * 
     * @return 密码
     */
    public String getPassword() {
        return this.password;
    }
     
    /**
     * 设置密码
     * 
     * @param password
     *          密码
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * 获取盐
     * 
     * @return 盐
     */
    public String getSalt() {
        return this.salt;
    }
     
    /**
     * 设置盐
     * 
     * @param salt
     *          盐
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }
    
    /**
     * 获取昵称
     * 
     * @return 昵称
     */
    public String getNickname() {
        return this.nickname;
    }
     
    /**
     * 设置昵称
     * 
     * @param nickname
     *          昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    /**
     * 获取状态(1：正常，2：禁用；默认1)
     * 
     * @return 状态(1：正常
     */
    public Integer getStatus() {
        return this.status;
    }
     
    /**
     * 设置状态(1：正常，2：禁用；默认1)
     * 
     * @param status
     *          状态(1：正常，2：禁用；默认1)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    /**
     * 获取创建时间
     * 
     * @return 创建时间
     */
    public Date getCreateTime() {
        return this.createTime;
    }
     
    /**
     * 设置创建时间
     * 
     * @param createTime
     *          创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    /**
     * 获取更新时间
     * 
     * @return 更新时间
     */
    public Timestamp getLastupdateTime() {
        return this.lastupdateTime;
    }
     
    /**
     * 设置更新时间
     * 
     * @param lastupdateTime
     *          更新时间
     */
    public void setLastupdateTime(Timestamp lastupdateTime) {
        this.lastupdateTime = lastupdateTime;
    }
}