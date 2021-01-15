package com.mycompany.calcolatrice;


/***
 * questa classe gestisce le operazioni da eseguire
 * @author Filippo
 */
public class Calculator {
    double a, b;
    char op;
    
    /***
     questo è il costruttore della classe calcolatrice
     */
    public Calculator(double a, double b, char op) { 
        this.a = a;
        this.b = b;
        this.op = op;
    }
    
    /***
     * questa funzione serve per far "decidere" al programma l'operazione da eseguire e ad eseguirla
     */
    public void calculate() {
        double ris = 0;
        switch(op) {
            case '+': ris = sum(); break;
            case '-': ris = subtraction(); break;
            case '*': ris = multiplication(); break;
            case '/': ris = division(); break;
            case '%': ris = modulo(); break;            
            default: System.out.println("Errore nella gestione dell'operatore"); return;
        }
        System.out.println(a + " " + op + " " + b + " = " + ris);
    }
    
    /***
     * sottrazione
     * @return 
     */
    public double subtraction() { return a - b; }
    
    /***
     * divisione
     * @return 
     */
    public double division() { return a / b; }
    
    /***
     * moltiplicazione
     * @return 
     */
    public double multiplication(){ return a * b; }
    
    /***
     * somma
     * @return 
     */
    public double sum() { return a + b; }
    
    /***
     * modulo
     * @return 
     */
    public double modulo(){ return a % b; }
}

