public class Tester{

  public static void main(String[]args){
    try{
      Node a=new Node("apple");

      System.out.println("-----TESTING NODE-----");
      System.out.println(a.getData());
      System.out.println(a.getPrev());
      System.out.println(a.getNext());
      a.setData("slapple");
      System.out.println(a.getData());
      System.out.println();

      MyLinkedList x=new MyLinkedList();

      System.out.println("-----TESTING MYLINKEDLIST-----");
      System.out.println(x.size());
      System.out.println(x);
      x.add(a.getData());
      System.out.println(x.size());
      x.add("banana");
      System.out.println(x.size());
      x.add(1,"cat");
      System.out.println(x.size());
      x.add(0,"dog");
      System.out.println(x.size());
      System.out.println(x.get(0));
      System.out.println(x.get(1));
      System.out.println(x.get(2));
      System.out.println(x.get(3));
      System.out.println(x);
      x.set(3,"bonkers");
      System.out.println(x.get(3));
      System.out.println(x);

    }catch(IndexOutOfBoundsException e){
      System.out.println("Index below 0 or above size");
    }
  }
}
