package Werewolfkill;

public enum Role {
  VILLAGER("Villager"), WEREWOLF("attack during the night")//
  ;

  private String actionDescription;

  private Role(String actionDescription) {
    this.actionDescription = actionDescription;
  }
}


enum SpecialRole { // no access modifier needed since it's in the same package
  NURSE("HEAL"), //
  WITCH("KILL or HEAL"), //
  SEER("CHECK WHETHER IS WEREWOLF")//
  ;

  private String actionDescription;

  private SpecialRole(String actionDescription) {
    this.actionDescription = actionDescription;
  }


  public String getActionDescription() {
    return actionDescription;
  }


}


