package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.Customer;
import com.kodilla.patterns.strategy.IndividualCustomer;
import com.kodilla.patterns.strategy.predictors.AggressivePredictor;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User millenials = new Millenials();
        User zGeneration = new ZGeneration();
        User yGeneration = new YGeneration();

        //When
        String shareMillenials = millenials.sharePost();
        String shareZGeneration = zGeneration.sharePost();
        String shareYGeneration = yGeneration.sharePost();

        //Then
        Assert.assertEquals("Facebook", shareMillenials);
        Assert.assertEquals("Twitter", shareYGeneration);
        Assert.assertEquals("Snapchat", shareZGeneration);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials();
        millenials.setSocialPublisher(new TwitterPublisher());
        User zGeneration = new ZGeneration();
        zGeneration.setSocialPublisher(new FacebookPublisher());
        User yGeneration = new YGeneration();
        yGeneration.setSocialPublisher(new SnapchatPublisher());

        //When
        String shareMillenials = millenials.sharePost();
        String shareZGeneration = zGeneration.sharePost();
        String shareYGeneration = yGeneration.sharePost();

        //Then
        Assert.assertEquals("Twitter", shareMillenials);
        Assert.assertEquals("Snapchat", shareYGeneration);
        Assert.assertEquals("Facebook", shareZGeneration);
    }

}
