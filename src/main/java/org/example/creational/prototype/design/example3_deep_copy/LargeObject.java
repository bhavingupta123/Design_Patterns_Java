package org.example.creational.prototype.design.example3_deep_copy;

public class LargeObject implements Cloneable{

    private String data;

    public void loadData(){
        this.data = "takes so much time";
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    protected LargeObject clone() throws CloneNotSupportedException{ // deep copy
        LargeObject largeObject = new LargeObject();
        largeObject.data = this.data;

        return largeObject;
    }
}
