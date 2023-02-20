package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void probablyIWillThrowException(){
        SecondChallenge secondChallenge = new SecondChallenge();
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.1,1.4)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 2)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.9, 0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.9, 1.5))
        );
    }
}

