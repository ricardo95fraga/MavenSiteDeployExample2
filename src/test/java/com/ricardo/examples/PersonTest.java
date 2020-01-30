package com.ricardo.examples;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testHello() {

        Person person = new Person();

        String hello = person.hello();
        Assert.assertEquals(hello,"Hello");
    }
}