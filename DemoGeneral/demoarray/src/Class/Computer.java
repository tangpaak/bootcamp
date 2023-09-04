public class Computer {
  // arttributes
  private int ram;
  private int weight;
  private String color;

  // Constructors
  public Computer(String color) { // (1) No return type, (2) Constructor name = Class name
    this.color = color;

  }

  public Computer(int ram, int weight, String color) {
    this.ram = ram;
    this.weight = weight;
    this.color = color;

  }



  public String getColor() {
    return this.color;
  }

  public void setColor(String Color) {
    this.color = color;
  }

  public int getram() {
    return this.ram;
  }

  public void setRam(int ram) {
    this.ram = ram;
  }

  public int getWeight (){
    return this.weight;
  }

  public void setWeight(int Weight) {
    this.weight = weight;
  }


  // Constructor用黎control object



}
