package tourism.bean;

import java.sql.Timestamp;

/**
 * @author liaoxuan
 * @date 2018-10-8-0008.
 */
public class BaseEntity {
    private int id;
    private Timestamp createTime = new Timestamp(System.currentTimeMillis());

    public BaseEntity(int id, Timestamp createTime) {
        this.id = id;
        this.createTime = createTime;
    }

    public BaseEntity() {
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
}
