/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.test;

import com.coderbd.dao.RoleDao;
import com.coderbd.daoImpl.RoleDaoImpl;

/**
 *
 * @author User
 */
public class RoleTest {
   public static void main(String[] args) {
        RoleDao roleDao = (RoleDao) new RoleDaoImpl();
        roleDao.createTable();
    }
}
