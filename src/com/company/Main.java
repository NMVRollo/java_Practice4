package com.company;

import java.util.concurrent.ExecutorService;

public class Main {

    public static void main(String[] args) {
        ExecutorService simpleExecutorService = new ExecutorServiceSimpleImpl(4);
        simpleExecutorService.execute(() -> {
            System.out.println("Hello world!");
        });
    }
}
