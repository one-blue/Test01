package com.it.bean;

public class WorkBean {
    private int sid;
    private String shobby;

    public WorkBean() {
    }

    public WorkBean(int sid, String shobby) {
        this.sid = sid;
        this.shobby = shobby;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getShobby() {
        return shobby;
    }

    public void setShobby(String shobby) {
        this.shobby = shobby;
    }

    @Override
    public String toString() {
        return "work{" +
                "sid=" + sid +
                ", shobby='" + shobby + '\'' +
                '}';
    }
}
