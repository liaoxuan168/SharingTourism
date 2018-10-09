package tourism.bean;


/**
 * @author liaoxuan
 * @date 2018-4-11-0011.
 */
public class User extends BaseEntity{
    private String userNo;
    private String nickName;
    private String password;
    private String phoneNumber;
    private String email;
    private boolean able;

    public User(String userNo, String nickName, String password, String phoneNumber, String email) {
        this.userNo = userNo;
        this.nickName = nickName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public User() {
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

    public boolean isAble() {
        return able;
    }

    public void setAble(boolean able) {
        this.able = able;
    }
}
