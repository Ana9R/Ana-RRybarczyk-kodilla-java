package com.kodilla.patterns2.facade.api;

public class OrderProcessingException extends Exception {

    public static String ERR_NOT_AUTHORISED = "User is not authorized";
    public static String ERR_PAYMENT_REJECTED = "User is not authorized";
    public static String ERR_VERIFICATION_ERROR = "User is not authorized";
    public static String ERR_SUBMITTING_ERROR = "User is not authorized";

    public OrderProcessingException(String message) {
        super(message);
    }
}
