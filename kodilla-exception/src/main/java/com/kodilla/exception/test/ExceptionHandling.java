package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(4, 1);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("I caught exception!" + e);
        } finally {
            System.out.println("I'm in finally!");
        }
    }

}
