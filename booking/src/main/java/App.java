/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nhatb
 */

import java.awt.EventQueue;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

import view.LoginView;


public class App {
    public static void main(String[] args) {
        try {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run(){
                    try {
                        UIManager.setLookAndFeel(new FlatMacLightLaf());
                    } catch (UnsupportedLookAndFeelException e) {
                        e.printStackTrace();
                    }
                    LoginView view = new LoginView();
                    view.setVisible(true);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
