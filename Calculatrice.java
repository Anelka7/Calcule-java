/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package calculatrice;

import java.util.Scanner;
public class Calculatrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        float num1, num2, result;
        char operation;
        System.out.println("entrez le premier nombre");
        num1= Sc.nextFloat();
        System.out.println("Entrez le deuxieme nombre");
        num2 = Sc.nextFloat();
        System.out.println("choissisez l'operation(+,-, *,/:)");
        operation = Sc.nextChar();
        switch(operation){
            case'+':
                result = num1+num2;
                System.out.println("resultat est " + result);
                break;
            case'-': 
                result = num1- num2;
                System.out.println(" le resultata est "+result);
                break;
            case '*':
                result = num1*num2;
                System.out.println("le resultat est" + result);
                break;
            case '/':
                if(num2!= 0){
                result = num1 /num2;
                System.out.println("Le resultat est"+ result);
            }else{
                    System.out.println("Tu ndem!");
                    }
            break;
            default:
                System.out.println("operateur non valide!");
                
                
                
                
                
                
                
                
        }
    }
    
}
