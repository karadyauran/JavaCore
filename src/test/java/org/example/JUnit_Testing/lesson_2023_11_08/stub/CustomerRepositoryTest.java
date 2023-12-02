package org.example.JUnit_Testing.lesson_2023_11_08.stub;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;

/**
 * -Mockito.mock -> Dummy
 * -[@Mock/Mockito.mock] + when + verify -> Mock
 * -[@Stub/Mockito.mock] + when -> Stub
 * -[@Spy] + when -> Spy (real object)
 */

class CustomerRepositoryTest {
  @Test public void getInvalidCustomerById() {
    Customer customer = new Customer();
    CustomerRepository customerRepository = Mockito.mock(CustomerRepository.class); // dummy

    Mockito.when(customerRepository.getCustomerById(anyLong())).thenThrow(new CustomerNotFoundException());
    CustomerService customerService = new SimpleCustomerService(customerRepository);
    assertThrows(CustomerNotFoundException.class, () -> customerService.getCustomerById(customer.getId()));
  }
}