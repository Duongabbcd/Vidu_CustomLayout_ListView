package com.example.vidu_customlayout_listview;

public class Employee {
    private String id ;
    private String name ;
    private boolean sex ;


    public Employee(String id, String name, boolean sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public Employee() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }


}
