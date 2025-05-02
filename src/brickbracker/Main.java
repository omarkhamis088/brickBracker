
package brickbracker;

import javax.swing.JFrame;



public class Main {

   
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        obj.setBounds(10, 10, 700, 600);//الحجم
        obj.setTitle("osama");
        obj.setResizable(false);//
       obj.setVisible(true);// أظهار
       obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // زر الاغلاق وايقاف البرنامج
        
    }
    
}
