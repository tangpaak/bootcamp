/**
 * Expected Output: Car Year=2020, Car Model=ModelY
 */
public class JavaQuest19 {
  int carYear;
  String carModel;

  public JavaQuest19(int carYear, String carModel) {
    this.carYear = carYear;
    this.carModel = carModel;
  }

  public int getcarYear() {
    return this.carYear;
  }

  public void setcarYear(int carYear) {
    this.carYear = carYear;
  }

  public String getcarModel() {
    return this.carModel;
  }

  public void setcarModel(String carModel){
    this.carModel = carModel;
  }


  // Declare instance variables carYear and carModel

  // Constructor with variables carYear and carModel

  // methods

  public static void main(String[] args) {
    JavaQuest19 myCar = new JavaQuest19(2020, "ModelY");
    System.out.println("Car Year =" + myCar.getcarYear()+ "," + "Car Model=" + myCar.getcarModel());
    // Create an instance of thefclass, with carYear 2020, and carModel
    // "ModelY"
    // print the expected output
  }
}
