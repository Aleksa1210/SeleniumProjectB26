package com.cydeo.test.day14_driverUtil_javaFaker;

public class Singleton {

  private Singleton(){} // constructor to make accessable outside (come from encapsilation)

    private static String word; // like object

  public static String getWord(){
    if (word == null){
        System.out.println("First time calling. Word object is null. Now is assigned value");
        word = "something";
    }else {
        System.out.println("word is already assigned and has a value");
    }
    return word;
  }

}
