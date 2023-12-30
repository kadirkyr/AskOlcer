package com.kadirkyr.askolcer;

public class Female extends Gender{
    public Female(String name) {
        super(name);
    }

    @Override
    public String gender() {
        return "Kadın";
    }


}
