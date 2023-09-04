public interface Swimable {


  void swim();

  // public static void start(List<? extends Swimable> humans) { ->一樣功能的寫法
  public static <T extends Swimable> void start(List<T> humans) {
    for (Swimable human : humans)
      human.swim();
  }



}
