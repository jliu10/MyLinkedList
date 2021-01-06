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

  private Node getNode(int index){
    if(index<0||index>size()) throw new IndexOutOfBoundsException();
    Node current=start;
    for(int i=0;i<index;i++){
      current=current.getNext();
    }
    return current;
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

  public void add(int index, String value){
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
      newNode.setNext(getNode(index));
      newNode.setPrev(getNode(index-1));
      newNode.getNext().setPrev(newNode);
      newNode.getPrev().setNext(newNode);
    }
    size++;
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
