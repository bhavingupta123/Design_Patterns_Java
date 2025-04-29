package org.example.creational.prototype.design.example2_shallow_copy;

public class NetworkLargeObject implements Cloneable{

    private String ip;
    private String data; // lets say this takes a lot of time to fetch data

    public void loadLargeData(){
        this.data = "very large data and takes time to load"; // lets say this takes 5 mins
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

    }
}
