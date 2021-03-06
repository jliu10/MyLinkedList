public class Node{
  private String data;
  private Node next,prev;
  public Node(String value){
    data=value;
    next=null;
    prev=null;
  }

  public String getData(){
   return data;
  }

  public String setData(String s){
    String old=data;
    data=s;
    return old;
  }

  public Node getPrev(){
    return prev;
  }

  public Node setPrev(Node s){
    Node old=prev;
    prev=s;
    return old;
  }

  public Node getNext(){
    return next;
  }

  public Node setNext(Node s){
    Node old=next;
    next=s;
    return old;
  }
}
