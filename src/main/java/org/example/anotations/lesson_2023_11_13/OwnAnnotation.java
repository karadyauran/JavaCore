package org.example.anotations.lesson_2023_11_13;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD}) // над чем можно ставить аннотацию (классы, методы, поля, ...)
public @interface OwnAnnotation {

}
