package beans;

/**
 * ====================================
 * 作者：王月丽
 * 版本：1.0
 * 创建日期：2016/6/16 19:32
 * 创建描述：
 * 更新日期：
 * 更新描述：
 * ====================================
 */
public class DataBean {
   private String name;
    private int ResId;

    public DataBean(String name, int resId) {
        this.name = name;
        ResId = resId;
    }

    public DataBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResId() {
        return ResId;
    }

    public void setResId(int resId) {
        ResId = resId;
    }

    @Override
    public String toString() {
        return "DataBean{" +
                "name='" + name + '\'' +
                ", ResId=" + ResId +
                '}';
    }
}
