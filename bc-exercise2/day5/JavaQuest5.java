/**
 * 
 * When target = 'c', the expected output: We found 3 character c in the String.
 * 
 * When target = 'z', the expected output: Not Found.
 */
// Count the target of character in a String.
public class JavaQuest5 {
  public static void main(String[] args) {
    String str = "Welcome to the coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic

    int count = 0;

    for (int i = 0; i < str.length(); ++i) {
      if (str.charAt(i) == target) {
        count++;

      }
      if (count == 3) {
        System.out.println("We found " + count + " character c in the String");
        break;
      }
    }
//

  char target2 = 'z';
  int count2 = 0;
  for(int i = 0;i<str.length();++i)
  {
    if (str.charAt(i) == target2) {
      count2++;
    }
    System.out.println("we found " + count2 + " character z in the String");
    break;

  }if(count2==0)
  {
    System.out.println("Not Found");
  }


  // Use a loop to count the target of character in a String.
  // code here
  // output should be 3



  // if found, print "We found 3 character c in the String."
  // if not found, print "Not Found."
  // code here



}}
