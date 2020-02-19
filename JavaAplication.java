
package javaapplication33;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   float farenhait = 0, celsius = 0;
   double conversorC, conversorF;
   int opcao;
   
   Scanner sc = new Scanner(System.in);
  

        
       
        
    
        
        
        System.out.println("Celsius-Farenhait, 1");
        System.out.println("Farenhait-Celsius, 2");
        
        opcao = sc.nextInt();
        
        switch(opcao){
            case 1:
             
                System.out.println("Digite uma temperatura em celsius");
                 celsius = sc.nextFloat();
                 conversorF = celsius * 1.8 + 32 ;
              
                System.out.println(conversorF);
            break;
            
            case 2:
                System.out.println("Digite a temperatura em F");
                farenhait = sc.nextFloat();
                conversorC = (farenhait -32)* 5/9;
                System.out.println(conversorC);
                
            break;
            default:
                System.out.println("Digite um numero valido");
            break;
            
            
            
            
        }
        
        
        
        
   
   
   
   
       
    }
    
}
