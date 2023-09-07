// LeetCode: 2418


import java.util.*;
import java.util.stream.Collectors;

class leetV2418 {
  private class People {
      String name;
      int height;
  }
  public String[] sortPeople(String[] names, int[] heights) {
      // People people = new People();
      List<People> plist = new ArrayList<>();
      for (int i = 0; i < names.length; i++) {
          People people = new People();
          people.name = names[i];
          people.height = heights[i];
          plist.add(people);
      }
      Comparator<People> heightDescOrder = (p1, p2) -> {
          return p1.height > p2.height ? -1 : 1;
      };
      Collections.sort(plist, heightDescOrder);
      // List -> Array, list.toArray(new array[])
      // Array -> List, Array.asList(array)
      return plist.stream() //
          .map(people -> people.name)
          .collect(Collectors.toList())
          .toArray(new String[names.length]);

  }

}
