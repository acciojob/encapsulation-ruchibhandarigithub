package com.driver;

public class Main {
  public static void main(String args[]){
      RWOnly r = new RWOnly();
     // System.out.println(r.name); getting error
      r.setName("Ruchi");
      System.out.println(r.getName());
  }
}