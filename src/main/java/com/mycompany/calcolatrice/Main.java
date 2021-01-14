package com.mycompany.calcolatrice;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        String expression;
        Scanner scanner = new Scanner(System.in);
        boolean var = false;
        do {
        double a = 0, b = 0, ris;
        char op = ' ';
        System.out.println("Inserire l'espressione che si desidera risolvere utilizzando questa \"sintassi\": num1 op num2");
        expression = scanner.nextLine();
        var = false;
        try { stringManager(expression, a, b, op); } catch (InvalidUserInputException e) { System.out.println("L'input inserito non è corretto, usare la sintassi corretta"); var = true; }
        } while(var);
    }
    
    public static void stringManager(String string, double a, double b, char op) throws InvalidUserInputException {
        String num1 = "", num2 = "", operator = "";
        int index = 0;
        
        
        for (int i = index; i < string.length(); i++) {
            if (string.charAt(i) == ' ') { index = i; break; }
            else num1 += string.charAt(i);
        }
        index++;
        for (int i = index; i < string.length(); i++) {
            if (string.charAt(i) == ' ') { index = i; break; }
            operator += string.charAt(i);
        }
        if (operator.length() > 1) throw new InvalidUserInputException();
        index++;
        for (int i = index; i < string.length(); i++) {
            if (string.charAt(i) == ' ') break;
            else num2 += string.charAt(i);
        }
        
        try { a = Double.parseDouble(num1); } catch (Exception e) { throw new InvalidUserInputException(); }
        try { b = Double.parseDouble(num2); } catch (Exception e) { throw new InvalidUserInputException(); }
        op = operator.charAt(0);
    }
}
