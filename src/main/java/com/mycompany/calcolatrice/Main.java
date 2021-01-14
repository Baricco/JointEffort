package com.mycompany.calcolatrice;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        String expression;
        Scanner scanner = new Scanner(System.in);
        boolean var = false;
        do {
        int a = 0, b = 0, ris;
        char op = ' ';
        System.out.println("Inserire l'operazione che si desidera fare utilizzando questa \"sintassi\": num1 op num2");
        expression = scanner.nextLine();
        var = false;
        try { stringManager(expression, a, b, op); } catch (InvalidUserInputException e) { System.out.println("L'input inserito non è corretto, usare la sintassi corretta"); var = true; }
        } while(var);
    }
    
    public static void stringManager(String string, int a, int b, char op) throws InvalidUserInputException {
        String num1 = "", num2 = "", operator = "";
        int index = 0;
        
        for (int i = index; i < string.length(); i++) {
            if (string.charAt(i) >= 48 && string.charAt(i) < 58) num1 += string.charAt(i);
            else if (string.charAt(i) == ' ') { index = i; break; }
            else throw new InvalidUserInputException();
        }      
        
        for (int i = index; i < string.length(); i++) {
            if (string.charAt(i) == ' ') { index = i; break; }
            operator += string.charAt(i);
        }
        if (operator.length() > 1) // throw InvalidUserInputException; bisogna implementare questa eccezione
        
        for (int i = index; i < string.length(); i++) {
            if (string.charAt(i) >= 48 && string.charAt(i) < 58) num2 += string.charAt(i);
            else if (string.charAt(i) == ' ') break;
            //else throw InvalidUserInputException; bisogna implementare questa eccezione
        }   
        
        a = Integer.parseInt(num1);
        b = Integer.parseInt(num2);
        op = operator.charAt(0);
    }
}
