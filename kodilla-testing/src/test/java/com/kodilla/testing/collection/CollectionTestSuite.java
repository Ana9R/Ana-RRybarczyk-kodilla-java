package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test case: begin");
    }

    @After
    public void after() {
        System.out.println("Test case: end");
    }
        @Test
        public void testOddNumbersExterminatorEmptyList () {
            //given
            OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
            ArrayList<Integer> empty = new ArrayList<Integer>();
            //when
            ArrayList<Integer> result = oddNumbersExterminator.exterminate(empty);
            //then
            Assert.assertEquals(empty, result);

        }

        @Test
        public void testOddNumbersExterminatorNormalList () {
            //given
            OddNumbersExterminator oddNumbersExterminator2 = new OddNumbersExterminator();
            ArrayList<Integer> normal = new ArrayList<Integer>();
            normal.add(0);
            normal.add(1);
            normal.add(2);
            normal.add(3);
            normal.add(4);
            normal.add(5);
            //when
            ArrayList<Integer> result2 = oddNumbersExterminator2.exterminate(normal);
            //then
            Assert.assertEquals(3, result2.size());

        }

    }
