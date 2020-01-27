package com.cleancoder.args;
import java.util.*;

public class ArgsMain {
  public static void main(String[] args) {
    String schemaTemplate = args[0];
    String[] actualArgs = Arrays.copyOfRange(args, 1, args.length);
    try {
      Args arg = new Args(schemaTemplate, actualArgs);
      arg.printArguments();
    } catch (ArgsException e) {
      System.out.printf("Argument error: %s\n", e.errorMessage());
    }
  }
}