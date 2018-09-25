package tourism.bean;

import java.sql.Timestamp;

/**
 * @author liaoxuan
 * @date 2018-4-11-0011.
 */
public class User {
    private int id;
    private Timestamp createTime = new Timestamp(System.currentTimeMillis());
    private String userNo;
    private String nickName;
    private String password;
    private String phoneNumber;
    private String email;

    public User(String userNo, String nickName, String password, String phoneNumber, String email) {
        this.userNo = userNo;
        this.nickName = nickName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserNo() {
        return userNo;
    }

    public String getNickName() {
        return nickName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }
}
