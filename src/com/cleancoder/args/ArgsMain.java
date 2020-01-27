package com.cleancoder.args;

public class ArgsMain {
  public static void main(String[] args) {
    try {
      Args arg = new Args("a,b#,c*,e##", args);
      boolean logging = arg.getBoolean('a');
      int port = arg.getInt('b');
      String directory = arg.getString('c');
      // String[] s_array = arg.getStringArray('d');
      double d_int = arg.getDouble('e');
      executeApplication(logging, port, directory, d_int);
    } catch (ArgsException e) {
      System.out.printf("Argument error: %s\n", e.errorMessage());
    }
  }

  private static void executeApplication(boolean logging, 
  										 int port, 
  										 String directory,
  										 double d_int) {
    System.out.printf("logging is %s, port:%d, directory:%s float:%f\n",logging, port, directory, d_int);
  }
}