/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

/**
 *
 * @author ferna
 */
public class Exercicios {

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainPage janela = new MainPage();
                janela.setTitle("SISTEMA Fernando");
                janela.setLocationRelativeTo(null);
                janela.setVisible(true);
            }
        });
    }
}