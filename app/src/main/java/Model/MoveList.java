package Model;

public class MoveList {
    private String name , info, more ;
    private int img;
    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public MoveList(String name, String info, String more , int img) {
        this.name = name;
        this.info = info;
        this.more = more;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }
}
