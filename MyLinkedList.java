public class MyLinkedList{
  private int size;
  private Node start,end;
  public MyLinkedList(){
    size=0;
    start=null;
    end=null;
  }

  public int size(){
    return size;
  }

  public boolean add(String value){
    Node newNode=new Node(value);
    if(size()==0) start=newNode; //ADDING TO EMPTY
    else{ //ADDING TO TAIL
      end.setNext(newNode);
      newNode.setPrev(end);
    }
    end=newNode;
    size++;
    return true;
  }

  public boolean add(int index, String value){
    Node newNode=new Node(value);
    if(index<0||index>size()) throw new IndexOutOfBoundsException();
    else if(index==size()){
      if(size()==0) start=newNode; //ADDING TO EMPTY
      else{ //ADDING TO TAIL
        end.setNext(newNode);
        newNode.setPrev(end);
      }
      end=newNode;
    }else if(index==0){ //ADDING TO HEAD
      start.setPrev(newNode);
      newNode.setNext(start);
      start=newNode;
    }else{ //ADDING TO MIDDLE
      
    }
    size++;
    return true;
  }

  public String get(int index){
    return "";
  }
  public String set(int index, String value){
    return "";
  }
  public String toString(){
    return "";
  }
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
