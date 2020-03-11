package com.app.bean;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements FactoryBean<Date> {

    private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    @Override
    public Date getObject() throws Exception {
        String[] args = input.split("\\|");
        SimpleDateFormat s = new SimpleDateFormat(args[1].trim());
        return s.parse(args[0].trim());

    }

    @Override
    public Class<?> getObjectType() {
        return java.util.Date.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
