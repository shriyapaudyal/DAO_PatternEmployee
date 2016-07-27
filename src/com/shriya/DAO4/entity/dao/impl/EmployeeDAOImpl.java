/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shriya.DAO4.entity.dao.impl;

import com.shriya.DAO4.entity.Employee;
import com.shriya.DAO4.entity.dao.EmployeeDAO;

/**
 *
 * @author shneha
 */
public class EmployeeDAOImpl implements EmployeeDAO {

    private Employee[] EmployeeList = new Employee[10];
    private int counter = 0;

    @Override
    public boolean insert(Employee s) {
        if (EmployeeList.length == counter) {
            return false;
        } else {
            EmployeeList[counter] = s;
        }
        counter++;
        return true;
    }

    @Override
    public boolean update(Employee s) {
        if (EmployeeList.length == counter) {
            return false;
        } else {
            EmployeeList[counter] = s;
        }
        counter++;
        return true;
    }

    @Override
    public boolean delete(int id) {
        for (int i = 0; i < EmployeeList.length; i++) {
            Employee s = EmployeeList[i];
            if (s != null && s.getId() == id) {
                EmployeeList[i] = null;
                return true;
            }

        }
        return false;

    }

    @Override
    public Employee getById(int id) {
        for (int i = 0; i < EmployeeList.length; i++) {
            Employee s = EmployeeList[i];
            if (s != null && s.getId() == id) {
                EmployeeList[i] = null;
                return s;
            }

        }
        return null;

    }

    @Override
    public Employee[] getAll() {

        return EmployeeList;
    }
}
