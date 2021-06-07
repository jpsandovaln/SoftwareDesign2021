package com.jalasoft.machine_learning.exception;

public class AlgorithmException extends Exception {
    private static final String MESSAGE = "Algorithm failed trying to predict.";

    public AlgorithmException(String currentMessage, Throwable ex) {
        super(currentMessage, ex);
    }

    public AlgorithmException(Throwable ex) {
        super(ex);
    }

    public AlgorithmException(String currentMessage) {
        super(currentMessage);
    }

    public AlgorithmException() {
        super(MESSAGE);
    }
}
