public class SwitchDemo {

  // static final (constant)
  // instance variable (1X)
  // static variable (1-2)
  // constructors
  // public instance methods //main logic
  // static methods //tools
  // private methods



  public static void main(String[] args) throws Exception {
    // 1. Switch 普通寫法
    System.out.println(grade(90));
    System.out.println(grade(60));

    WeekDay weekday = WeekDay.TUE;

    // 2. Approach 1: Switch Lambda既寫法
    int result = switch (weekday) {
      case MON -> 1;
      case TUE -> 2;
      case WED -> 3;
      case THUR -> 4;
      case FRI -> 5;
      case SAT -> 6;
      case SUN -> 7;
      // case MON, TUE ->8
      // default -> 0; <-enum千其唔好寫default

    };
    System.out.println("Switch Lambda weekday= " + result);

    // 3. Approach 2
    int result2 = switch (weekday) {

      case MON:
        System.out.println("Monday or Tuesday");
        yield 1;

      case TUE:
        System.out.println("MONADY or TUSDAY");
        yield 1;

      case WED:
        System.out.println("MOnday or Tuesday");
        yield 2;

      case THUR:
        System.out.println("MOnday or Tuesday");
        yield 3;

      case FRI:
        System.out.println("MOnday or Tuesday");
        yield 4;

      case SAT:
        System.out.println("MOnday or Tuesday");
        yield 5;

      case SUN:
        System.out.println("MOnday or Tuesday");
        yield 6;
      // default:
      // yield 0;

    };
    System.out.println("result2 = " + result2);
    

  }



  public static int getWeekDay(WeekDay weekday) {
    switch (weekday) { // which using enum
      case MON:
        return 1;

      case TUE:
        return 2;

      case WED:
        return 3;

      case THUR:
        return 4;

      case FRI:
        return 5;

      case SAT:
        return 6;

      case SUN:
        return 7;

      default:
        return 0;



    }
  }

  public static char grade(int score) {
    char grade = ' ';
    switch (score) {

      case 90:
        grade = 'A';
        break;

      case 80:
        grade = 'B';
        break;

      case 70:
        grade = 'C';
        break;

      default:
        grade = 'F';

    }
    return grade;
  }



}
