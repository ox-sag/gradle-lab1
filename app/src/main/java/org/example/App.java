/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import com.google.common.collect.ImmutableSet;

public class App {
    public String getGreeting() {
        return "Hello Sagar World!!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

                ImmutableSet<String> names = org.gradle.model.Data.COLOR_NAMES;

                for(String name : names) {
                    System.out.println(name);
                }
    }
}





