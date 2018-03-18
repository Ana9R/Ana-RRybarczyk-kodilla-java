package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (int n = 0; n < numbers.size(); n++) {
            Integer result = numbers.get(n);
            if (result % 2 == 0) {
                evenNumbers.add(result);
            }
        }
        return evenNumbers;
    }

}

