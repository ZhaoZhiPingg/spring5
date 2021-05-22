package com.zzp.spring5.entity;

public class Book {
    private String userid;
    private String username;
    private String userstatus;

    @Override
    public String toString() {
        return "Book{" +
                "userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", userstatus='" + userstatus + '\'' +
                '}';
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(String userstatus) {
        this.userstatus = userstatus;
    }
}
