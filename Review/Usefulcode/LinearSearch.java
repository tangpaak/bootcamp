package Review.Usefulcode;

//搵Target數目係array入面

public class LinearSearch {

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Element found at index i
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25};
        int target = 15;
        int index = linearSearch(array, target);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}


// In this example, the `linearSearch` method takes an array and a target element as input. 
// It iterates through the array using a for loop and checks each element for a match with the target element. 
// If a match is found, the method returns the index of the element. 
// If no match is found, it returns -1.


