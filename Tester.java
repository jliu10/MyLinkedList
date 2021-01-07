public class Tester{

  public static void main(String[]args){
    try{
      Node n=new Node("apple");

      System.out.println("-----TESTING NODE-----");
      System.out.println(n.getData());
      System.out.println(n.getPrev());
      System.out.println(n.getNext());
      n.setData("slapple");
      System.out.println(n.getData());
      System.out.println();

      MyLinkedList x=new MyLinkedList();

      System.out.println("-----TESTING MYLINKEDLIST-----");
      System.out.println(x.size());
      System.out.println(x);
      x.add(n.getData());
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
      System.out.println(x.toStringReversed());
      x.remove(2);
      System.out.println(x);
      x.remove(2);
      System.out.println(x);
      x.remove(0);
      System.out.println(x);
      x.remove(0);
      System.out.println(x);

      MyLinkedList a = new MyLinkedList();
      MyLinkedList b = new MyLinkedList();
      for(int i = 0; i < 10; i++){
        if(i < 5){
          a.add(i+"");
        }else{
          b.add(i+"");
        }
      }
      System.out.println();
      System.out.println("A:"+a+a.size());
      System.out.println("B:"+b+b.size());

      a.extend(b);
      System.out.println("A:"+a+a.size());
      System.out.println("B:"+b+b.size());
      System.out.println("A reversed:"+a.toStringReversed()+a.size());
      System.out.println("B reversed:"+b.toStringReversed()+b.size());

    }catch(IndexOutOfBoundsException e){
      System.out.println("Index below 0 or above size");
    }
  }
}
