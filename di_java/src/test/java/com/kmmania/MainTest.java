package com.kmmania;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("Main method should print correct output")
    public void mainMethodShouldPrintCorrectOutput() throws
            InvocationTargetException,
            IllegalAccessException,
            ClassNotFoundException,
            NoSuchMethodException {
        // Redirect System.out to capture console output
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Replace original implementations with mocks using reflection
        Class<?> mainClass = Class.forName("com.kmmania.Main");
        // Call the main method
        Method mainMethod = mainClass.getDeclaredMethod("main", String[].class);
        mainMethod.invoke(null, (Object) new String[]{});
        // Verify console output
        String expectedOutput = """
                *** Easy jog speed by MAS ***
                Service computes 70% of MAS
                Data source provides a MAS 17.5km/h
                Compute easy jog by MAS: 12.25 km/h
                *** End ***
                *** Easy jog by HR ***
                Service computes 75% of max heart rate
                Data source provides a max heart rate 185bpm
                Compute easy jog by HR: 138.75 bpm
                *** End ***""";
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }
}