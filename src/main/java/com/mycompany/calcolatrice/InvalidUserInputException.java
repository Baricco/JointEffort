package com.mycompany.calcolatrice;

import java.lang.Exception;

public class InvalidUserInputException extends Exception {
    public InvalidUserInputException() { super("User Input is Invalid"); }
}