/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shriya.DAO4.entity;

/**
 *
 * @author shneha
 */
public class Employee {
    private int id;
    private String name;
    private String post;
    private float salary;

    public Employee() {
    }

    public Employee(int id, String name, String post, float salary) {
        this.id = id;
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    
    
    
}

