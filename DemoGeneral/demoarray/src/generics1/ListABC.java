import java.util.ArrayList;

public class ListABC <T extends Number>{

ArrayList<T> data;

public boolean add( T data){
  return false;
}

public static <U> U add (U data){
  return data;
}
  
public static <T> void add2(T data){ // 兩個T意味住係同一樣野

}



}
