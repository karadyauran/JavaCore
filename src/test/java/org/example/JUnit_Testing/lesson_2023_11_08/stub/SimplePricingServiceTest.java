package org.example.JUnit_Testing.lesson_2023_11_08.stub;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimplePricingServiceTest {
  @Test public void getHighestPricedTrade() {
    Price price1 = new Price(10);
    Price price2 = new Price(20);
    Price price3 = new Price(30);

    List<Trade> trades = new ArrayList<>();
  }

}