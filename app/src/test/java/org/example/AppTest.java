/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void testLongTask() throws IOException {
        int timeTaken = performTaskAndRecordTime();

        // Record the time taken
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("data.txt").getFile());
        String outputFilePath = file.getAbsolutePath().replace("data", "timing") ;
        new File(outputFilePath).getParentFile().mkdirs();
        BufferedWriter writer = new BufferedWriter(new BufferedWriter(
                new java.io.FileWriter(outputFilePath.toString())));
        writer.write("Time taken: " + timeTaken +" seconds") ;
        writer.close();

    }

    private int performTaskAndRecordTime() {
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        return (int) (end - start);
    }
}
