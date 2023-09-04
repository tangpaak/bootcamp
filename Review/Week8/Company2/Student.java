package Company2;

public class Student<T extends Number> {
  T data;
  // public class Student{
  // String data; <- cannot

  public static void main(String[] args) {
    Student<Integer> student = new Student<>();
    Student.getThing(2);
  }

  public  T getData(){
    return this.data;
  }

  public static <T> T getThing(T data) {
    return data;
  }







}
