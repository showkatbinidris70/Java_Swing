/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservice;

import java.util.List;



/**
 *
 * @author User
 */
public interface CommonDAO {
    
    void save (Student obj);
    void update (Object obj);
    void delete (Object obj);
    void deleteById (int obj);
    
    Object getById(int id);
    List<Object> finalAll();

    public static class Student {

        public Student() {
        }
    }
    
    
    
    
}
