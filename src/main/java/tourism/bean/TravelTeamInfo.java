package tourism.bean;

/**
 * 旅游团队信息
 * @author liaoxuan
 * @date 2018-9-28-0028.
 */
public class TravelTeamInfo extends BaseEntity{
    /**主键*/
    private String travelName;
    private String phone;
    private String travelNo;
    private String travelHead;
    private boolean able;

    public TravelTeamInfo( String travelName, String phone, String travelNo, String travelHead, boolean able) {
        this.travelName = travelName;
        this.phone = phone;
        this.travelNo = travelNo;
        this.travelHead = travelHead;
        this.able = able;
    }

    public TravelTeamInfo() {
    }

    public String getTravelName() {
        return travelName;
    }

    public void setTravelName(String travelName) {
        this.travelName = travelName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTravelNo() {
        return travelNo;
    }

    public void setTravelNo(String travelNo) {
        this.travelNo = travelNo;
    }

    public String getTravelHead() {
        return travelHead;
    }

    public void setTravelHead(String travelHead) {
        this.travelHead = travelHead;
    }

    public boolean isAble() {
        return able;
    }

    public void setAble(boolean able) {
        this.able = able;
    }
}
