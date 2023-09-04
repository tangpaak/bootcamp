package checked1.Exception;

public class Demo {


public static void main(String[] args) throws Exception{ // 唔會咁樣寫throws Exception
  
  try{
System.out.println("Hello, world!");
throw new CheckException();
}catch (CheckException e){
  
}

throw new CheckException();

}

  
}
