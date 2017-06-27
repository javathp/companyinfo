package pojo;

import java.util.Date;

public class CiCyclePic {
    private Byte id;

    private String name;

    private String pic;

    private Date updateTime;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

	@Override
	public String toString() {
		return "CiCyclePic [id=" + id + ", name=" + name + ", pic=" + pic + ", updateTime=" + updateTime + "]";
	}
    
}