package com.it.bean;

public class StudetBean {
    private int sid;
    private String sname;
    private String city;

    public StudetBean() {
    }

    public StudetBean(int sid, String sname, String city) {
        this.sid = sid;
        this.sname = sname;
        this.city = city;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "StudetBean{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
