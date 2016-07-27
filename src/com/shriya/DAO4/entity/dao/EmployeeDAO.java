/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shriya.DAO4.entity.dao;

import com.shriya.DAO4.entity.Employee;

/**
 *
 * @author shneha
 */
public interface EmployeeDAO {

    boolean insert(Employee s);

    boolean update(Employee s);

    boolean delete(int id);

    Employee getById(int id);

    Employee[] getAll();

}
