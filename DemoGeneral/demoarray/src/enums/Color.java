package enums;

public enum Color {

  RED("RED", "#FF0000"), //
  GREEN("GREEN", "#00FF00"), //
  BLUE("BLUE", "#0000FF") //
  ;

  private String color;
  private String code;

  private Color(String color, String code) {
    this.color = color;
    this.code = code;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }


}
