/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.carlamancero2020;

import java.util.Scanner;

/**
 *
 * @author SO-LAB1-PC20
 */
public class CarlaMancero2020 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int [] punDiarias= new int[7];
         
        int puntosTotal;
        int promedio;
        int punAlta;
        int punBaja;
        
        
        Scanner sc = new Scanner(System.in);
                
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese la puntuacion obtenida");
            
           int puntuacion=sc.nextInt();
           punDiarias[i]=puntuacion;
       }
       int dato=0;
       int i=0;
         
        
        System.out.println("1.Total de puntuaciones de la semana");
        System.out.println("2.Promedio de puntuaciones");
        System.out.println("3.Dia con puntuacion mas alta y mas baja");
        System.out.println("4.Total de puntuaciones acumuladas ");
        System.out.println("5.Salir");
        
        
        int opciones=sc.nextInt();
      
         switch(opciones){
             case 1:
               int suma=0;
                 for (int i = 0; i < 7; i++) {
                 suma=suma+punDiarias[i];
                 }
                 System.out.println("Total de puntuación es:"+suma);
                 break;
            case 2:
               
                 for (int i = 0; i < 7; i++) {
                 suma=suma+punDiarias[i];
                 }
                promedio=suma/7;
                
                contadorPuntuaciones=0;
                 encimaPromedio;
                    for (int i = 0; i < 7; i++){
                        if (punDiarias[i] > encimaPromedio) {
                            contadorPuntuaciones=encimaPromedio+1;
                        }
                        if (punDiarias[i]< bajoPromedio){
                            contadorPuntuaciones= bajoPromedio;
                         
                    }
                        System.out.println("Los dias por encima del promedio son;"+encimaPromedio);
                        System.out.println("Los dias por debajo del promedio son:"+BajoPromedio);
                }
                System.out.println("Su promedio de puntuaciones es:"+promedio);
                break;
            case 3:
                 punAlta = punDiarias[0];
                    punBaja = punDiarias[0];
                    for (int i = 0; i < 7 ; i++) {
                        if (punDiarias[i] > punAlta) {
                            punAlta = punDiarias[i];
                        }
                        if (punDiarias[i] < punBaja) {
                           punBaja = punDiarias[i];
                        }
                    }
                System.out.println("Los dias con puntuaciones mas alta es:"+punAlta);
                System.out.println("Los dias con puntuaciones mas baja es:"+punBaja);
                break;
            
           }
   
                
                
               
    }
        
       
          
               
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
