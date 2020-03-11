package com.app.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Department {
    private String name;
    private Date createdOn;

    public Department() {
    }

    public Department(String name, Date createdOn) {
        this.name = name;
        this.createdOn = createdOn;
    }
    public Department(String deptName , String dateWithFormat){
        this.setName(deptName);
        String d[] = (dateWithFormat.trim()).split("\\|");
        String dateStr = d[0];
        String format = d[1];
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.setCreatedOn(date);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
