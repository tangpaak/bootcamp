import java.util.Comparator;

public class SortByDesending implements Comparator<String>{

  @Override 
  public int compare(String o1, String o2){
    return o2.charAt(0) > o1.charAt(0) ? 1: -1;
  }
  
}