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
    if(index<0||index>=size()) throw new IndexOutOfBoundsException();
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
    if(index<0||index>=size()) throw new IndexOutOfBoundsException();
    return getNode(index).getData();
  }

  public String set(int index, String value){
    if(index<0||index>=size()) throw new IndexOutOfBoundsException();
    String old=get(index);
    getNode(index).setData(value);
    return old;
  }

  public String toString(){
    if(size()==0) return "[]";
    String s="[";
    Node current=start;
    while(current.getNext()!=null){
      s+=current.getData()+", ";
      current=current.getNext();
    }
    s+=current.getData()+"]";
    return s;
  }

  public String remove(int index){
    if(index<0||index>=size()) throw new IndexOutOfBoundsException();
    String old=get(index);
    if(size()==1){ //SINGLE ELEMENT
      start=null;
      end=null;
    }else if(index==0){ //HEAD
      start.getNext().setPrev(null);
      start=start.getNext();
    }else if(index==size()-1){ //TAIL
      end.getPrev().setNext(null);
      end=end.getPrev();
    }else{ //MIDDLE
      getNode(index).getNext().setPrev(getNode(index).getPrev());
      getNode(index).getPrev().setNext(getNode(index).getNext());
    }
    size--;
    return old;
  }

  /*
  *@postcondition: All of the elements from other are removed from the other, and connected to the end of this linked list.
  *@postcondition: The size of other is reduced to 0.
  *@postcondition: The size of this is now the combined sizes of both original lists
  */
  public void extend(MyLinkedList other){
  }

  public String toStringReversed(){
    return "";
  }
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
