package exam.spring4.mvc.model;


public class LibraryVO {
    private int lbno;
    private String lbname;
    private String sido;
    private String gugun;
    private String lbtype;
    private String clsday;
    private String addr;
    private String phone;
    private String homepage;
    private double lat;
    private double lon;
    private String regdate;

    public LibraryVO() {}

    public LibraryVO(String lbname, String sido, String gugun, String lbtype, String clsday, String addr, String phone, String homepage, double lat, double lon) {
        this.lbname = lbname;
        this.sido = sido;
        this.gugun = gugun;
        this.lbtype = lbtype;
        this.clsday = clsday;
        this.addr = addr;
        this.phone = phone;
        this.homepage = homepage;
        this.lat = lat;
        this.lon = lon;
    }

    public LibraryVO(int lbno, String lbname, String sido, String gugun, String clsday, String phone) {
        this.lbno = lbno;
        this.lbname = lbname;
        this.sido = sido;
        this.gugun = gugun;
        this.clsday = clsday;
        this.phone = phone;
    }

    public LibraryVO(int lbno, String lbname, String sido, String gugun, String lbtype, String clsday, String addr, String phone, String homepage, double lat, double lon, String regdate) {
        this.lbno = lbno;
        this.lbname = lbname;
        this.sido = sido;
        this.gugun = gugun;
        this.lbtype = lbtype;
        this.clsday = clsday;
        this.addr = addr;
        this.phone = phone;
        this.homepage = homepage;
        this.lat = lat;
        this.lon = lon;
        this.regdate = regdate;
    }

    public LibraryVO(String lbtype, String clsday, String addr, String phone, String homepage, double lat, double lon) {
        this.lbtype = lbtype;
        this.clsday = clsday;
        this.addr = addr;
        this.phone = phone;
        this.homepage = homepage;
        this.lat = lat;
        this.lon = lon;
    }

    public int getLbno() {
        return lbno;
    }

    public void setLbno(int lbno) {
        this.lbno = lbno;
    }

    public String getLbname() {
        return lbname;
    }

    public void setLbname(String lbname) {
        this.lbname = lbname;
    }

    public String getSido() {
        return sido;
    }

    public void setSido(String sido) {
        this.sido = sido;
    }

    public String getGugun() {
        return gugun;
    }

    public void setGugun(String gugun) {
        this.gugun = gugun;
    }

    public String getLbtype() {
        return lbtype;
    }

    public void setLbtype(String lbtype) {
        this.lbtype = lbtype;
    }

    public String getClsday() {
        return clsday;
    }

    public void setClsday(String clsday) {
        this.clsday = clsday;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    @Override
    public String toString() {
        String fmt = "%d %s %s %s %s %s %s %s %s %.8f %.8f %s\n";
        return String.format(fmt, lbno, lbname, sido, gugun, lbtype, clsday, addr, phone, homepage, lat, lon, regdate);
    }
}
