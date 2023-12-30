package com.kadirkyr.askolcer;

public class Male extends Gender{
    public Male(String name) {
        super(name);
    }

    @Override
    public String gender() {
        return "Erkek";
    }



}
