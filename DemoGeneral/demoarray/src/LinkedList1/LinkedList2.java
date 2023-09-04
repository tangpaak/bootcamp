package LinkedList1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList2 {
  private String str;
  private LinkedList2 node;

  public LinkedList2() {

  }

  public LinkedList2(String str) {
    this.str = str;
  }

  public void setStr(String str) {
    this.str = str;
  }

  public void setNode(LinkedList2 node) {
    this.node = node;
  }

  public LinkedList2 getNode() {
    return this.node;
  }

  @Override
  public String toString() {
    return this.str;
  }

  public static void main(String[] args) {
    LinkedList2 ll = new LinkedList2();
    ll.setStr("Head");
    ll.setNode(new LinkedList2("body"));
    ll.getNode().setNode(new LinkedList2("tail"));
    System.out.println(ll); // head

    //
    LinkedList2 head = ll;
    String string = "";
    while (head.getNode() != null) { // bug
      System.out.println();
      head = head.getNode(); // object reference
    }
    // print 空白 2次

    // LinkedList
    List<String> l1 = new LinkedList<>();
    l1.add("abc");
    l1.add("abc");
    l1.add("abc");
    System.out.println("l1 = " + l1);

    List<String> String = new ArrayList<>(); // Poly, interface
    System.out.println(String);
    // if (time == 6pm)
    // {
    //   parent.add();
    // }



  }



}
