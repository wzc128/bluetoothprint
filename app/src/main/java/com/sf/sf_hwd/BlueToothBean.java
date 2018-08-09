package com.sf.sf_hwd;

public class BlueToothBean {

    private String name;
    private String address;
    private  boolean connect;

    public BlueToothBean(String name, String address, boolean connect) {
        this.name = name;
        this.address = address;
        this.connect = connect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isConnect() {
        return connect;
    }

    public void setConnect(boolean connect) {
        this.connect = connect;
    }
}
