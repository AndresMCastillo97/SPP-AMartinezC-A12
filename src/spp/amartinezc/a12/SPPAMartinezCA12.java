/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.amartinezc.a12;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author andres
 */
public class SPPAMartinezCA12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println("Calculadora IMC");
          double l, w, imc;
          String eIMC;
          Scanner  teclado = new Scanner (System.in);
          int seleccion=JOptionPane.showOptionDialog(null,"Desea ingresar a la calculadora de IMC","IMC",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"Si","No"},"Si");   
         if(seleccion==0){
         w=devolverdatos("Introduce el peso en kilogramos");
         l=devolverdatos("Introduce la estatura en metros");
          imc= w / Math.pow (l,2);
         if (imc > 25){
            JOptionPane.showMessageDialog(null, "Sobrepeso imc=" +imc);   
        }else if(imc<19){
            JOptionPane.showMessageDialog(null, "Desnutricion imc=" +imc);
            System.exit(0);
        }else{
            JOptionPane.showMessageDialog(null, "Peso normal imc=" +imc);
            System.exit(0);
        }
        } else if(seleccion==1){
            JOptionPane.showMessageDialog(null, "Vuelva pronto");
            System.exit(0);
        }    
    } 
    public static double devolverdatos(String mensaje){
        boolean flag;
        double x=0;
        do{
        try{
            String dato=JOptionPane.showInputDialog(null,  mensaje);
           x=Double.parseDouble(dato) ;
            flag=true;
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Dato no válido, vuelva a intentarlo","ERROR", JOptionPane.OK_CANCEL_OPTION);
            flag=false;
        }
    }while(flag==false);
        return x;  
 }
}