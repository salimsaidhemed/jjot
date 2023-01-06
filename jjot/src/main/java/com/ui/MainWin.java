package com.ui;

import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;


public class MainWin extends JFrame {
    public MainWin(){
        super();
        setTitle("Jot");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().add(new WindowContent());
        setSize(400, 400);

    }


}

class WindowContent extends JPanel {
    public WindowContent() {
        super();
        
        setBackground(Color.CYAN);
        
        JTextPane editor = new JTextPane();
        setLayout(new BorderLayout());
        
        add(editor);
    }
}