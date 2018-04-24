/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;


import javax.swing.JOptionPane;


/**
 *
 * @author Cerrato
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       
       String [] nombres = new String[4];
       double [] notas = new double[4];
       double prom=0;
       double notaM=0;
       int ind=0;
       
       
        for (int i = 0; i < 4; i++) {
            JOptionPane.showInputDialog ("Ingrese el " + (i+1) + "° Nombre");
            notas[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota "+ (i+1)));
            prom += notas[i]; 
            if(notaM<notas[i]){
                notaM=notas[i];
                ind = i;
            }
        }
        prom = prom/4;
        JOptionPane.showMessageDialog(null, "Promedio ="+ prom + " \n La nota mayor es de: " + nombres[ind] + "  " + notaM);
    }
    
}
