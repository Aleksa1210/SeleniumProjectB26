package com.cydeo.test.day13_configuration_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_fail() throws IOException {

        // Create properties object
        // We need properties class to use getProperty ("key") method
        Properties properties = new Properties();

        // Create FileInputStream object to open file as a stream in Java memory
        // opening(read) fail configuration.properties file
        FileInputStream file = new FileInputStream("configuration.properties");

        //Load properties object(class) with the "file" we opened using FileInputStream
        // Load to properties object
        properties.load(file);

        //We can use properties.getProperty method to read from the file we loaded. (configuration.properties)
        // get value by passing "key"
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"environment\") = " + properties.getProperty("environment"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
        System.out.println("properties.getProperty(\"password\") = " + properties.getProperty("password"));
    }


}
