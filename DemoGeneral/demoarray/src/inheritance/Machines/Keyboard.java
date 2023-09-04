package inheritance.Machines;

import java.util.Objects;

public class Keyboard {

  String buttonType;
  int noOfButton;

  public Keyboard (String buttonType, int noOfButton){
    this.buttonType = buttonType;
    this.noOfButton = noOfButton;
  }

//Button type
public String getButtonType(){
  return this.buttonType;
}

public void setButtonType(String bottonType){
  this.buttonType = bottonType;
}

//noOfButton
public int getnoOfButton(){
  return this.noOfButton;
}

public void setnoOfButton(int noOfButton){
  this.noOfButton = noOfButton;
}

@Override
public boolean equals(Object o){
  if (this == o)
  return true;
  if (!(o instanceof Keyboard))
  return false;

  Keyboard keyboard = (Keyboard) o;
  
  return Objects.equals(keyboard.buttonType, this.buttonType)
  && Objects.equals(keyboard.noOfButton, this.noOfButton);
}



}
