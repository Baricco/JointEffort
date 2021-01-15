package com.mycompany.calcolatrice;

import java.lang.Exception;

/***
 * Eccezione che serve a gestire l'errore di inserimento dei dati da parte dell'utente
 * @author Filippo
 */
public class InvalidUserInputException extends Exception {
    public InvalidUserInputException() { super("User Input is Invalid"); }
}
