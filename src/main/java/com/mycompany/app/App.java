package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World! - modify";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
    	System.out.println("App.getMessage ---- test ---");
        return message;
    }

}
