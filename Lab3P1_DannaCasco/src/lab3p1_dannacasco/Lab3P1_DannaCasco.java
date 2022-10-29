/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_dannacasco;

import java.util.Scanner;

/**
 *
 * @author Danna Casco
 */
public class Lab3P1_DannaCasco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese número de ejrcicio (1-3):");
        int numej = entrada.nextInt();
        entrada.nextLine();
        
        if (numej == 1){
            
        }
        else if(numej == 2){
            System.out.print("Ingresar valor de K : ");
            int vark = entrada.nextInt();
            double factorial=vark;
            
            
            for(int n=1;n<=1;n ++){
               int part1=2*n+1;
               int part2 = n*n+3;
               
               int num = part2;
               
               // factorials
            for(int i=num;i>=vark;i--){
                factorial=factorial*i;
                
            }
            double suma = part1/factorial;
                System.out.println("Resultado:"+suma);
            }
                
        }else{
            int numimp;
            int res;
             
            System.out.println("Ingrese numero impar:");
                    numimp = entrada.nextInt();
                    
                    res = numimp % 2;
                    if (res == 0){
                        System.out.println("Favor ingrese un numero impar");
                    }
                    for (int i = 1; i <= numimp; i++) {
                        for (int j = 1; j < numimp +1; j++) {
                   
                           if((int)i == 1 || (int)i == numimp || (int)i == j || i + j == (numimp+1)) {
                               System.out.print("* "); 
                           }
                           else{
                               System.out.print("  "); 
                           }
                        }
                        System.out.println("");
                    }
            
            
            
            
            
            
            
            
            
            
                    
            
            
           
            
            
        }  
            
        }
        
        
    }
    
}



