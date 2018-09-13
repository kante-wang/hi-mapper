package wang.kante.himapper.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sys_user")
public class SysUser implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    /**
     * 账号
     */
    @Column(name = "user_account")
    private String userAccount;

    /**
     * 密码
     */
    @Column(name = "user_password")
    private String userPassword;

    /**
     * 角色ID
     */
    @Column(name = "user_role_id")
    private Integer userRoleId;

    /**
     * 用户状态：0有效，1无效；默认0
     */
    @Column(name = "user_status")
    private Integer userStatus;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return user_id - 主键
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置主键
     *
     * @param userId 主键
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取账号
     *
     * @return user_account - 账号
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 设置账号
     *
     * @param userAccount 账号
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * 获取密码
     *
     * @return user_password - 密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置密码
     *
     * @param userPassword 密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 获取角色ID
     *
     * @return user_role_id - 角色ID
     */
    public Integer getUserRoleId() {
        return userRoleId;
    }

    /**
     * 设置角色ID
     *
     * @param userRoleId 角色ID
     */
    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    /**
     * 获取用户状态：0有效，1无效；默认0
     *
     * @return user_status - 用户状态：0有效，1无效；默认0
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
         * 设置用户状态：0有效，1无效；默认0
         *
         * @param userStatus 用户状态：0有效，1无效；默认0
         */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}