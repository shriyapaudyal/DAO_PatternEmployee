/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shriya.DAO4;

import com.shriya.DAO4.entity.Employee;
import com.shriya.DAO4.entity.dao.EmployeeDAO;
import com.shriya.DAO4.entity.dao.impl.EmployeeDAOImpl;
import java.util.Scanner;

/**
 *
 * @author shneha
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmployeeDAO EmployeeDAO = new EmployeeDAOImpl();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add employee:");
            System.out.println("2. Update employee:");
            System.out.println("3.Delete employee:");
            System.out.println("4.Get by id:");
            System.out.println("5.Dispaly All employee:");
            System.out.println("6.Exit:");
            System.out.println("enter your choice[1-6]:");

            switch (input.nextInt()) {
                case 1: {
                    System.out.println("Add a employee:");
                    Employee s = new Employee();
                    System.out.println("Enter ID:");
                    s.setId(input.nextInt());
                    System.out.println("Enter  Name:");
                    s.setName(input.next());

                    System.out.println("Enter post:");
                    s.setPost(input.next());
                    System.out.println("Enter salary:");
                    s.setSalary(input.nextFloat());
                    if (EmployeeDAO.insert(s)) {
                        System.out.println("Inserted Sucessfully");
                    } else {
                        System.out.println("Space Full");
                    }

                }

                break;
                case 2: {
                    Employee[] c = EmployeeDAO.getAll();

                    System.out.println("Enter ID to be updated:");
                    int a = input.nextInt();
                    for (int i = 0; i < c.length; i++) {
                        Employee Employee = c[i];

                        if (Employee != null && Employee.getId() == a) {
                            System.out.println("Add a employee:");
                            Employee s = new Employee();
                            System.out.println("Enter ID:");
                            s.setId(input.nextInt());
                            System.out.println("Enter  Name:");
                            s.setName(input.next());

                            System.out.println("Enter post:");
                            s.setPost(input.next());
                            System.out.println("Enter salary:");
                            s.setSalary(input.nextFloat());
                            if (EmployeeDAO.update(s)) {
                                System.out.println("Inserted Sucessfully");
                            } else {
                                System.out.println("Space Full");
                            }
                        }
                    }
                    break;
                }

                case 3:{
              Employee[] c = EmployeeDAO.getAll();

                    System.out.println("Enter ID to be deleted:");
                    int a = input.nextInt();
                    for (int i = 0; i < c.length; i++) {
                            Employee Employee= c[i];

                        if (Employee != null && Employee.getId() == a)  {

                                EmployeeDAO.delete(a);

                        }
                    }

                }
                
                break;
            case 4:
            {
                Employee[] c = EmployeeDAO.getAll();
            

                    System.out.println("Enter ID to be deleted:");
                    int a = input.nextInt();
                    for (int i = 0; i < c.length; i++) {
                            Employee Employee= c[i];

                        if (Employee != null && Employee.getId() == a)  {

                            System.out.println("ID:" + Employee.getId());
                            System.out.println("Employee Name:" + Employee.getName());
                          
                          
                            System.out.println("post:" + Employee.getPost());
                            System.out.println("Salary:" + Employee.getSalary());

                        }
                    }
                    break;
                }
            
                 case 5: {

                        Employee[] c = EmployeeDAO.getAll();
            

                    System.out.println("Enter ID to be deleted:");
                    int a = input.nextInt();
                    for (int i = 0; i < c.length; i++) {
                            Employee Employee= c[i];

                         if (Employee != null && Employee.getId() == a)  {

                            System.out.println("ID:" + Employee.getId());
                            System.out.println("Employee Name:" + Employee.getName());
                          
                          
                            System.out.println("post:" + Employee.getPost());
                            System.out.println("Salary:" + Employee.getSalary());

                        }

                    }


                    break;
                }
            
            case 6: {
                    System.out.println("Do You Really Want To Exit[y/n]:");
                    if (input.next().equalsIgnoreCase("y")) {
                        System.exit(0);
                    }

                    break;

                }
            }
        }
    }
}

   