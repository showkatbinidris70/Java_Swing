/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservice;

import pojo.Student;

/**
 *
 * @author User
 */
public class Test {
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Minhaz");
        CommonDAO commonDAO = new StudentService();
        commonDAO.save(s1);
    }
}
