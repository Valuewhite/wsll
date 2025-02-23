package com.itheima.pojo;

public class WebUser {
    private String name;
    private Integer age;

    public Address getAddress() {
        return address;
    }

    public WebUser() {
    }

    public WebUser(String name, Integer age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private Address address;

    @Override
    public String toString() {
        return "WebUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public WebUser(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
