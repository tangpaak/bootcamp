package general;
public class Conditions {
  public static void main(String[] args) {
    // if, else if, else
    int i = 10;
    if (i > 9) {
      System.out.println("i=" + i);// i = 10
    }
    // asking if i > 9, if yes, execute the block of the codes
    // Remind there is using {}

    if (i < 8) {
      System.out.println("i is smaller than 8");
      // not fullfill, so it would not showout
    } else {
      System.out.println("i is larger than or equals to 8");

    }
    // else if
    if (i > 12) {
      System.out.println("i>12");// not excecuted

    } else if (i <= 12 && i > 0) {
      System.out.println("i<=12 and i >=0"); // excuted

    } else {
      System.out.println("i is negative"); // not excecuted
    }

    // box = 19
    int a = 2;
    int b = 5;
    int box = 0;
    if (a > b) {
      box = 10;
      System.out.println("box=" + box);// not excuted, since a < 5
    } else {
      box = 19;
      System.out.println("box=" + box); // excuted
    }
//
    a = 3;
    b = 3;
    box = 0;
    if (a > b) {
      box = 1;
      System.out.println("a more than b");//
    } else if (a < b) {
      box = 2;
      System.out.println("a less than b"); //
    } else if (a == b) {
      box = 3;
      System.out.println("equals");
    }
    // Else if (), can use to different secenrio

    int number = 12;
    if (number % 2 == 0) {
      System.out.println("the number is even");
    } else {
      System.out.println("the number is odds");

    } // number check is even or odds

    String day = "Sunday";
    if (day.equals("Sunday")) {
      System.out.println("It's weekend");
    } else {
      System.out.println("it's weekday");
    } // String check is it correct

    String str = "Monday";
    if (str.equals("Monday")) {
      System.out.println("str = Monday");
    }

    if (str.charAt(4) == 'd') {
      // false, charAt(4)> 'a',
      // checking Monday of the 4 word is it d (from 0 start)
      System.out.println("yes");
    }

    if (str.length() < 10) {
      System.out.println("length <10");
    }
    // checking length is under 10 or not

    if (str.equals("Monday") || str.charAt(4) == 'd' || str.length() > 10) {
      System.out.println("fullfill one of option");
    }

    if (str.equals("Monday") && str.charAt(4) == 'a' || str.length() > 10) {
      System.out.println("fullfil part of option");
    }

    if (str.equals("Monday") && str.charAt(4) == 'a' && str.length() == 6) {
      System.out.println("fullfil all option");
    }

    // Check score

    int score = 89;
    char grade = ' ';
    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80) {// true
      grade = 'B';// executed
    } else if (score >= 70) {
      grade = 'C';
    } else if (score >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    } // if all score option is not fullfill, then F
    System.out.println(grade);


    // boolean sample(write a completed if boolean on a single line)
    // Then it will become more simple to coding, and will easily to modify
    int age = 65;
    boolean isElderly = age >= 65;
    if (isElderly) {
      System.out.println("yes he is elderly");
    }


    // switch
    // Simple Version
    int dayOfWeek = 3;
    String dayName = "";

    switch (dayOfWeek) { // check if the value equals to the following cases
      case 1:
        dayName = "Monday";
        System.out.println(1);
        break;// exit
      case 2:
        dayName = "Tuesday";
        System.out.println(2);
        break;// exit
      case 3:
        dayName = "Wednesday";
        System.out.println(3);
        break;// exit
      case 4:
        dayName = "Thursday";
        System.out.println(4);
        break;// exit
      case 5:
        dayName = "Friday";
        System.out.println(5);
        break;// exit
      case 6:
        dayName = "Saturday";
        System.out.println(6);
        break;// exit
      case 7:
        dayName = "Sunday";
        System.out.println(7);
        break;// exit
    }
    System.out.println("dayName=" + dayName);
    // If you don't make break; > outcome will be Sunday
    // add break will be Wednesday

//below make a example of char >using switch
    char grade2 = 'B';
    int pocketMoney = 100;
    switch (grade2) {
      case 'A':
        pocketMoney += 100;
        break;
      case 'B':
        pocketMoney += 70;
        break;
      case 'C':
        pocketMoney += 20;
        break;
      default:
        pocketMoney += 5;
        break;

    }
    System.out.println("pocketMoney=" + pocketMoney);



  }
}
