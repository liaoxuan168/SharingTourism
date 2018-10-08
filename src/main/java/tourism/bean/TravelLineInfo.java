package tourism.bean;

import java.sql.Timestamp;

/**
 * @author liaoxuan
 * @date 2018-10-8-0008.
 */
public class TravelLineInfo {
    private int id;
    private Timestamp createTime = new Timestamp(System.currentTimeMillis());
    private String pathNo;
    private String travelNo;
    private String pathName;
    private double amount;
    private boolean able;

    public TravelLineInfo(int id, Timestamp createTime, String pathNo, String travelNo, String pathName, double amount, boolean able) {
        this.id = id;
        this.createTime = createTime;
        this.pathNo = pathNo;
        this.travelNo = travelNo;
        this.pathName = pathName;
        this.amount = amount;
        this.able = able;
    }

    public TravelLineInfo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
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
