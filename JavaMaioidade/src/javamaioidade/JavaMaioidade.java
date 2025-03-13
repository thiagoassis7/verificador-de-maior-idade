/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamaioidade;

import java.util.Scanner;

/**
 *
 * @author thiago
 */
public class JavaMaioidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner obg  = new Scanner(System.in);
        System.out.println("ola digite o seu nome");
        String  nome = obg.nextLine();
        System.out.println("ola " +nome + "! agora digite  o ano do seu nascimento");
        float datadenasc = obg.nextFloat();
        obg.nextLine();
        System.out.println("agorra digite o ano em que estamos");
        float ano = obg.nextFloat();
        obg.nextLine();
         float resultado = ( ano - datadenasc);       
        if( resultado <= 18 ){
            System.out.println("voce  é menor de idade");
        }else{System.out.println("voce ja é maior de idade");
        // TODO code application logic here
    }
    
}
