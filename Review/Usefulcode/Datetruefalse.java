package Review.Usefulcode;

import java.time.LocalDate;

public class Datetruefalse {
  public static void main(String[] args) {

    LocalDate effectiveDate = LocalDate.of(2023, 7, 20);
    LocalDate targetDate = LocalDate.of(2023, 7, 20);
    boolean checked = false;
    if (effectiveDate.equals(targetDate)) {
      checked = true;
    }
    System.out.println(checked);


  }
}
