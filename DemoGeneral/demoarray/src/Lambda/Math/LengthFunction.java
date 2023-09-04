package Math;

import java.util.function.Function;

// @FunctionalInterface
public class LengthFunction implements Function<String, Integer> {

  @Override
  public Integer apply(String str){
    return str.length();
  }
  
}
