package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        Millenials millenials = new Millenials("Bartek");
        YGeneration yGeneration = new YGeneration("Tomek");
        ZGeneration zGeneration = new ZGeneration("Wojtek");

        String mil = millenials.sharePost();
        String yGen = yGeneration.sharePost();
        String zGen = zGeneration.sharePost();

        Assertions.assertEquals("Facebook", mil);
        Assertions.assertEquals("Twitter", yGen);
        Assertions.assertEquals("Snapchat", zGen);
    }

    @Test
    public void testIndividualSharingStrategy(){
        ZGeneration zGeneration = new ZGeneration("Roman");
        zGeneration.setPublisher(new TwitterPublisher());
        String zGen = zGeneration.sharePost();
        Assertions.assertEquals("Twitter", zGen);
    }
}
