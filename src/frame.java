/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import javax.swing.*;
public class frame {
    public static void main(String arg[])
    {
        JFrame jf=new JFrame();
        JButton jb=new JButton("Click");
          jb.setBounds(10,30,100,80);
            JLabel jl=new  JLabel("Name");
       jl.setBounds(40,30,90,100);
        jf.add(jl);
        jf.add(jb);
        
       
       jf.setSize(400,400);
       jf.setVisible(true);
       
       
        
    }
    
    
}
