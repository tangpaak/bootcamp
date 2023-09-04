public class VictorianFurnitureFactory implements FurnitureFactory {

  int size;

  public VictorianFurnitureFactory(){
    
  }

  public VictorianFurnitureFactory(int size){
    this.size = size;
  }

  @Override
  public Chair createChair() {
    return new VictorianChair();
  }

  @Override
  public Sofa createSofa() {
    return new VictorianSofa();
  }

  public static void main(String[] args) {
    VictorianFurnitureFactory vFactory = new VictorianFurnitureFactory();
    Chair chair = vFactory.createChair();

    System.out.println("this is VictorianFurnitureFactory");
    }
  }
