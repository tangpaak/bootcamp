package Class;

import java.time.LocalDate;
import java.time.Month;

public class LocalDate1 {

  public static void main(String [] args){

LocalDate today = LocalDate.now(); //2023-7-28
System.out.println("today= " + today);
LocalDate yesterday = LocalDate.now().minusDays(1);
System.out.println("yesterday= " + yesterday);

LocalDate specifiedDate = LocalDate.of(2023, Month.FEBRUARY, 28);
System.out.println(specifiedDate);
System.out.println(LocalDate.parse("2023-12-30"));

LocalDate d1 = LocalDate.parse("2023-12-30");
System.out.println(d1.getYear());
System.out.println(d1.getMonth());

Month result = d1.getMonth();
System.out.println(result.getValue()); // 12
System.out.println(d1.getDayOfMonth()); // 30
System.out.println(d1.getDayOfWeek()); // saturday

System.out.println(LocalDate.parse("2023-12-30").getDayOfWeek()); // saturday
System.out.println(LocalDate.parse("2023-07-28").getDayOfYear()); // 209, 果一年入面既第幾日

System.out.println(d1.plusMonths(3L));  //2024-3-30
//plusDays
//plusYears

boolean expiry = false;
LocalDate effectiveDate = LocalDate.of(2023, 7, 20);
System.out.println(effectiveDate);
if ( LocalDate.now().isAfter(effectiveDate.plusMonths(3L))){
  expiry = true;
}
System.out.println("expiry=" + expiry);


LocalDate targetDate = LocalDate.of(2023, 7, 20);
boolean checked = false;
if(effectiveDate.equals(targetDate)){
  checked = true;
}
System.out.println(checked);






  }



}
