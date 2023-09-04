package LinkedList1;

public class NodeList {

  Node head;


  public NodeList(Node head) {
    this.head = head;
  }

  public void add(Node node) {
    this.head.next = node; // fix bug
    

  }

  public void addFirst() {


  }

  public void insert(int index, Node node) {
// index = this.node.chatAt(this.node.length()-1);

  }

  public void remove(Node node) {


  }


  public static void main(String[] args) {
    NodeList list = new NodeList(new Node(10));
    list.add(new Node(100));
    list.add(new Node(200));



  }



}
