package org.example.JUnit_Testing.lesson_2023_11_09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;


public class ProductServiceTest {

  @InjectMocks
  private ProductService productService;

  @Mock
  private MerchService merchService;

  @BeforeEach
  public void setUp() {
    // Initialize the mock objects
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void saveTest() {
    Product product = new Product("Apple", 20.0, "China");

    // Stub the behavior of the merchService mock
    doNothing().when(merchService).setArticle(product);

    // Call the method being tested
    productService.save(product);

    // Assert the result
    Assertions.assertEquals(1, productService.getProducts().size());

    // Verify that the setArticle method was called
    verify(merchService).setArticle(product);
  }
}