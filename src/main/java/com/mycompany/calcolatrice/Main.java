package com.mycompany.calcolatrice;

import java.util.*;

public class Main {
    
    /***
     Queste variabili sono state aggiunte poichè il linguaggio di programmazione Java non permette di passare
     * efficientemente e in modo elegante delle variabili
     */
    public static double numerazzo1, numerazzo2;
    public static char operatorepazzodelbengala3;
    
    public static void main(String args[]) {
        String expression;
        Calculator calculator;
        Scanner scanner = new Scanner(System.in);
        boolean var = false;
        double ris;
        do {
        String num1 = "", num2 = "", operator = "";
        System.out.println("Inserire l'espressione che si desidera risolvere utilizzando questa \"sintassi\": num1 op num2");
        expression = scanner.nextLine();
        var = false;
        try { stringManager(expression); } catch (InvalidUserInputException e) { System.out.println("L'input inserito non è corretto, usare la sintassi corretta"); var = true; }
        } while(var);
        calculator = new Calculator(numerazzo1, numerazzo2, operatorepazzodelbengala3);
        calculator.calculate();
        
    }
    
    /***
     Questa funzione serve a dividere la stringa ottenuta in input nelle tre variabili num1, num2 e operatore
     */
    public static void stringManager(String string) throws InvalidUserInputException {
        String a = "";
        String b = "";
        String op = "";
        int index = 0;
        
        for (int i = index; i < string.length(); i++) {
            if (string.charAt(i) == ' ') { index = i; break; }
            else a += string.charAt(i);
        }
        index++;
        for (int i = index; i < string.length(); i++) {
            if (string.charAt(i) == ' ') { index = i; break; }
            op += string.charAt(i);
        }
        if (op.length() > 1) throw new InvalidUserInputException();
        index++;
        for (int i = index; i < string.length(); i++) {
            if (string.charAt(i) == ' ') break;
            else b += string.charAt(i);
        }
        
        numerazzo1 = Double.valueOf(a);
        numerazzo2 = Double.valueOf(b);
        
        operatorepazzodelbengala3 = op.charAt(0);
    }
}
