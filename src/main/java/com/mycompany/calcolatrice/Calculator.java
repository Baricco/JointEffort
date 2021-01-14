package com.mycompany.calcolatrice;
        
public class Calculator {
    double a, b;
    char op;
    
    public Calculator(double a, double b, char op) { 
        this.a = a;
        this.b = b;
        this.op = op;
    }
    
    public void calculate() {
        double ris = 0;
        switch(op) {
            case '+': ris = sum(a, b); break;
            case '-': ris = subtraction(a, b); break;       //questa funzione la deve aggiungere Ivan
            case '*': ris = multiplication(a, b); break;
            case '/': ris = division(a, b); break;
            case '%': ris = modulo(a, b); break;            
            default: System.out.println("Errore nella gestione dell'operatore"); return;
        }
        System.out.println(a + " " + op + " " + b + " = " + ris);
    }
    
    private double division(double a, double b) { return a / b; }
    
    private double multiplication(double a, double b){ return a * b; }
    
    private double sum(double a, double b) { return a + b; }
    
    private double modulo(double a, double b){ return a % b; }
}

