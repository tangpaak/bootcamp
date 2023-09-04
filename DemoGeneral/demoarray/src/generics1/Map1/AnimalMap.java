package Map1;

import java.util.HashMap;
import java.util.Map;

public class AnimalMap<T> { // Java17 remove this feature (String || Integer)

  Map<T, String> map;


  public AnimalMap() {
    map = new HashMap<>();
  }


  public void put(T key, String animal) {
    map.put(key, animal);
    // map.put(T, animal);
    // Run time execute既野唔可以寫<T>
  }


  public void get(T key, String animal) {
    map.get(key, animal);
  }

  public void pull(T key, String animal) {
    map.pull(key, animal);
  }

  public static void main(String[] args) {
    AnimalMap<String> map1 = new AnimalMap();
    map1.put("abc", "Dog");

    AnimalMap<Integer> map2 = new AnimalMap();
    map1.put(1, "Dog");

  }
}
