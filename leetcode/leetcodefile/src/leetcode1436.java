// 1436. Destination City

// You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a 
// direct path going from cityAi to cityBi. Return the destination city, that is, 
// the city without any path outgoing to another city.

// It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.

// Example 1:

// Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
// Output: "Sao Paulo" 
// Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the 
// destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".

// Example 2:

// Input: paths = [["B","C"],["D","B"],["C","A"]]
// Output: "A"
// Explanation: All possible trips are: 
// "D" -> "B" -> "C" -> "A". 
// "B" -> "C" -> "A". 
// "C" -> "A". 
// "A". 
// Clearly the destination city is "A".
// Example 3:

// Input: paths = [["A","Z"]]
// Output: "Z"
 

// Constraints:

// 1 <= paths.length <= 100
// paths[i].length == 2
// 1 <= cityAi.length, cityBi.length <= 10
// cityAi != cityBi
// All strings consist of lowercase and uppercase English letters and the space character.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetcode1436 {



    public static String destCity(List<List<String>> paths) {
      
                // Create a set to store all source cities
                Set<String> sources = new HashSet<>();

                // Add all source cities to the set
                for (List<String> path : paths) {
                    sources.add(path.get(0));
                }
        
                // Iterate through the paths and find the destination city
                for (List<String> path : paths) {
                    String destination = path.get(1);
                    if (!sources.contains(destination)) {
                        return destination;
                    }
                }
        
                return ""; // Handle the case when no destination city is found
            }



    public static void main(String[] args) {
      
        // Example usage
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("London", "New York"));
        paths.add(Arrays.asList("New York", "Lima"));
        paths.add(Arrays.asList("Lima", "Sao Paulo"));

        leetcode1436 solution = new leetcode1436();
        String destinationCity = solution.destCity(paths);
        System.out.println("Destination city: " + destinationCity);

        //[["B","C"],["D","B"],["C","A"]]
      paths.clear();
      paths.add(Arrays.asList("B","C"));
      paths.add(Arrays.asList("D","B"));
      paths.add(Arrays.asList("C","A"));
      destinationCity = solution.destCity(paths);
      System.out.println("Destination city: " + destinationCity);

      //[["A","Z"]]
      paths.clear();
      paths.add(Arrays.asList("A","Z"));
      destinationCity = solution.destCity(paths);
      System.out.println("Destination city: " + destinationCity);
    //






    }





    }







    


  
  

