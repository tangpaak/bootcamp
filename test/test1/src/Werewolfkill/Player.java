package Werewolfkill;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Player {
  private String name = "player1";
  private Role role;
  private SpecialRole specialrole;


  public Player() { // empty constuctor


  }

  public Player(String name, Role role, SpecialRole specialrole) {
    this.name = name;
    this.role = role;
    this.specialrole = specialrole;
  }

// getters and setters for name and role
  public String getPlayerName() {
    return this.name;
  }

  public void setPlayerName(String name) {
    this.name = name;
  }

  public String getRole() {
    if (specialrole == null) {
        return "Your role is " + role.name();
    } else {
        return "Your roles are " + role.name() + " and " + specialrole.name();
    }
}


  public void setRole(Role role) {
    this.role = role;
  }

  public static List<Player> createPlayers() {
    List<Player> players = new ArrayList<>();
    Random random = new Random();

    // Prompt the user for their name
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    // Add the user as a player with a random role
    Role role = random.nextBoolean() ? Role.VILLAGER : Role.WEREWOLF;
    SpecialRole specialRole = null;
    if (role == Role.VILLAGER && random.nextBoolean()) {
        specialRole = random.nextBoolean() ? SpecialRole.NURSE : SpecialRole.SEER;
    }
    Player player = new Player(name, role, specialRole);
    players.add(player);

    // Create 9 more players with random roles and special roles
    for (int i = 2; i <= 10; i++) {
        name = "Player " + i;
        role = random.nextBoolean() ? Role.VILLAGER : Role.WEREWOLF;
        specialRole = null;
        if (role == Role.VILLAGER && random.nextBoolean()) {
            specialRole = random.nextBoolean() ? SpecialRole.NURSE : SpecialRole.SEER;
        }
        player = new Player(name, role, specialRole);
        players.add(player);
    }

    return players;
}


public static void main(String[] args) {
    List<Player> players = createPlayers();

    // Display the names and roles of each player
    for (Player player : players) {
        System.out.println(player.getPlayerName() + " - " + player.getRole());
    }
}







  
}
