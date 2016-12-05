package com.verein.bean.sql;

import java.util.Date;

/**
 * Created by LinYaoyao on 16/12/2.
 */
public class TassociationsBean {
    private String name;
    private Date founded_date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFounded_date() {
        return founded_date;
    }

    public void setFounded_date(Date founded_date) {
        this.founded_date = founded_date;
    }

    @Override
    public String toString() {
        return "TassociationsBean{" +
                "name='" + name + '\'' +
                ", founded_date=" + founded_date +
                '}';
    }
}
