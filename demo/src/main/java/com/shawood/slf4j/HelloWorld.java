package com.shawood.slf4j;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

public class HelloWorld {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        logger.info("Hello World");
    }
}
