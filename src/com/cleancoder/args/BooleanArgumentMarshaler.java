package com.cleancoder.args;

import java.util.Iterator;

public class BooleanArgumentMarshaler implements ArgumentMarshaler {
  private boolean booleanValue = false;

  public void set(Iterator<String> currentArgument) throws ArgsException {
    booleanValue = true;
  }

  private static boolean instance_validator(ArgumentMarshaler am){
  	if (am != null && am instanceof BooleanArgumentMarshaler)
  		return true;
  	else
  		return false;
  }

  public static boolean getValue(ArgumentMarshaler am) {
    if (instance_validator(am))
      return ((BooleanArgumentMarshaler) am).booleanValue;
    else
      return false;
  }
}
