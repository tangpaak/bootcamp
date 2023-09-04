public class Basketball {
  double weight; // 0 kg
  int volume; // 0 brand
  String color; // null

  public Basketball(double weight, int volume, String color) {
    this.weight = weight;
    this.volume = volume;
    this.color = color;

  }

  public double getweight() {
    return this.weight;
  }

  public void setweight(double weight) {
    this.weight = weight;
  }


  public int getvolume() {
    return this.volume;
  }

  public void setvolume(int volume) {
    this.volume = volume;
  }

public String getcolor(){
  return this.color;
}

public void setcolor(String color){
  this.color = color;
}



  public static void main(String[] args) {

Basketball ball1 = new Basketball(1.00, 1, "orange");
ball1.setweight(1.05);
ball1.setvolume(4);
ball1.setcolor("Black");

System.out.println(ball1.getweight());
System.out.println(ball1.getvolume());
System.out.println(ball1.getcolor());


  }
}
