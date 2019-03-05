/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codder.util;

import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 *
 * @author User
 */
public class CommonMenu {
    
    public static JMenuBar getCommonMenu(JFrame f) {
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        
        JMenuItem itemAbout = new JMenuItem("about");
        itemAbout.setAccelerator(KeyStroke.getKeyStroke('A', InputEvent.CTRL_DOWN_MASK));
        itemAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new About().setVisible(true);
            }
        });

        JMenuItem itemDesh = new JMenuItem("DeshBoard");
        itemDesh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new DeshBoard().setVisible(true);
            }
        });

        // JMenuItem itemAbout = new JMenuItem("About");
        JMenuItem exist = new JMenuItem("Exist");
        exist.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                //  new Login().setVisible(true);
                System.out.println(0);
            }
        });
        
        JMenu help = new JMenu("Help");
        file.add(itemDesh);
        file.add(itemAbout);
        file.add(exist);
        
        menuBar.add(file);
        menuBar.add(help);
        f.setJMenuBar(menuBar);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        return menuBar;
    }
    
}
