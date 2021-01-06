public class Tester{

  public static void main(String[]args){
    Node a=new Node("apple");

    System.out.println(a.getData());
    System.out.println(a.getPrev());
    System.out.println(a.getNext());
    a.setData("slapple");
    System.out.println(a.getData());
  }
}
