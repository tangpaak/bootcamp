import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoVar {


  public static void main(String[] args) throws Exception {

    var s = "Hello";
    // s = 3; // 呢個位s唔可以放3, 佢係String, error refer to String

    var i = 2;
    var c = 'a';
// var n = null; // not allowed, compile cannot refer the actual type


    // looping
    List<String> strings = Arrays.asList("abc", "def");
    for (var str : strings) {
      System.out.println(str);
    }

    Map<String, Integer> map = new HashMap<>();
    map.put("a", 1);
    map.put("b", 2);

    for (var entry : map.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

  }


  public List<List<String>> getString() {
    return Arrays.asList(Arrays.asList("abc"));
  }

  // This is not allowed type
  // public static var add (int x, int y ){
  // return x+y;
  // }





}
