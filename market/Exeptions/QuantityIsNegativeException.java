package ru.market.Exeptions;

public class QuantityIsNegativeException extends Exception{
    public QuantityIsNegativeException(String message) {
        super(message);
    }
}