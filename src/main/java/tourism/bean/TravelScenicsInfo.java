package tourism.bean;

/**
 * @author liaoxuan
 * @date 2018-10-8-0008.
 */
public class TravelScenicsInfo extends BaseEntity {
    /**
     * 路线编号
     */
    private String pathNo;
    /**
     * 景点名称
     */
    private String scenicSpotName;
    /**
     * 景点图片
     */
    private String scenicSpotImage;
    /**
     * 景点消费金额
     */
    private double amount;
    /**
     * 备注
     * */
    private String remark;
    /**
     *景点省份
     * */
    private String province;
    /**
     * 景点市区
     * */
    private String city;
    /**
     * 景点介绍
     * */
    private String scenicSpotIntroduce;
    /**
     * 景点是否可用
     * */
    private boolean able;

    public TravelScenicsInfo(String pathNo, String scenicSpotName, String scenicSpotImage, double amount, String remark, String province, String city, String scenicSpotIntroduce, boolean able) {
        this.pathNo = pathNo;
        this.scenicSpotName = scenicSpotName;
        this.scenicSpotImage = scenicSpotImage;
        this.amount = amount;
        this.remark = remark;
        this.province = province;
        this.city = city;
        this.scenicSpotIntroduce = scenicSpotIntroduce;
        this.able = able;
    }

    public TravelScenicsInfo() {
    }

    public String getPathNo() {
        return pathNo;
    }

    public void setPathNo(String pathNo) {
        this.pathNo = pathNo;
    }

    public String getScenicSpotName() {
        return scenicSpotName;
    }

    public void setScenicSpotName(String scenicSpotName) {
        this.scenicSpotName = scenicSpotName;
    }

    public String getScenicSpotImage() {
        return scenicSpotImage;
    }

    public void setScenicSpotImage(String scenicSpotImage) {
        this.scenicSpotImage = scenicSpotImage;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getScenicSpotIntroduce() {
        return scenicSpotIntroduce;
    }

    public void setScenicSpotIntroduce(String scenicSpotIntroduce) {
        this.scenicSpotIntroduce = scenicSpotIntroduce;
    }

    public boolean isAble() {
        return able;
    }

    public void setAble(boolean able) {
        this.able = able;
    }
}
