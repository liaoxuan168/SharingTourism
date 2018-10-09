package tourism.bean;

/**
 * @author liaoxuan
 * @date 2018-10-8-0008.
 */
public class TravelLineInfo extends BaseEntity{
    private String pathNo;
    private String travelNo;
    private String pathName;
    private double amount;
    private boolean able;

    public TravelLineInfo(String pathNo, String travelNo, String pathName, double amount, boolean able) {
        this.pathNo = pathNo;
        this.travelNo = travelNo;
        this.pathName = pathName;
        this.amount = amount;
        this.able = able;
    }

    public TravelLineInfo() {
    }

    public String getPathNo() {
        return pathNo;
    }

    public void setPathNo(String pathNo) {
        this.pathNo = pathNo;
    }

    public String getTravelNo() {
        return travelNo;
    }

    public void setTravelNo(String travelNo) {
        this.travelNo = travelNo;
    }

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isAble() {
        return able;
    }

    public void setAble(boolean able) {
        this.able = able;
    }
}
