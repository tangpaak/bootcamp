

public interface FurnitureFactory {

  Chair createChair();

  Sofa createSofa();



  public static void main(String[] args) {
    // another business to determin style
    int b = 4;
    Style style = null;
    if (b < 3) {
      style = Style.MODERN;
    } else if (b < 10) {
      style = Style.VICTORIAN;
    }
    FurnitureFactory factory = FurnitureFactory.createFactory(style);
    int a = 200;
    Furniture furniture = null;
    if (a > 100) { // business logic
      furniture = factory.createChair();
    } else {
      furniture = factory.createSofa();
    }
    int c = 999;
    if (c > 1000) {
      furniture.destroy();
    }

    System.out.println("this is furniture factory");

  }

  
  // 全部return type都係interface
  static FurnitureFactory createFactory(Style style) {
    FurnitureFactory factory = switch (style) {
      case MODERN -> new ModernFurnitureFactory();
      case VICTORIAN -> new VictorianFurnitureFactory();

    };
    return factory;
  }

  static Chair createChair(Style style) {
    Chair chair = switch (style) {
      case MODERN -> new ModernChair();
      case VICTORIAN -> new VictorianChair();

    };
    return chair;
  }

  static Sofa createSofa(Style style) {
    Sofa sofa = switch (style) {
      case MODERN -> new ModernSofa();
      case VICTORIAN -> new VictorianSofa();

    };
    return sofa;
  }


}
