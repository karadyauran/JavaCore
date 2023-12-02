package org.example.JUnit_Testing.lesson_2023_11_09;

public interface MerchService {

    boolean withoutSupplierInfo();

    double getMarkup();

    void setArticle(Product product);

    boolean fullDeletion();
}