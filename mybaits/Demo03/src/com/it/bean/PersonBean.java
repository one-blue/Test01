package com.it.bean;

public class PersonBean {
    private int pid;
    private String pname;
    private String address;
    public PersonBean() {
    }

    public PersonBean(int pid, String pname, String address) {
        this.pid = pid;
        this.pname = pname;
        this.address = address;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonBean{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
