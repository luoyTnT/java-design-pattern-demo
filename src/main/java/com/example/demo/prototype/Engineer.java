package com.example.demo.prototype;

import lombok.Data;

@Data
public abstract class Engineer implements Cloneable {

    private String engineerName;
    private String duty;

    public abstract void develop(String program);

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("错误");
        }
        return clone;
    }
}
