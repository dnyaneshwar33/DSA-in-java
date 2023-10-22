class LL{
    Node head;
    private int size;

    LL(){
        size=0;
    }
   public class Node{
    String data;
    Node next;

    Node(String data){
        this.data=data;
        this.next=null;

        size++;
    }
   }
   public void addFirst(String data){
    Node newNode = new Node(data);

    newNode.next=head;

    head = newNode;
   }

   public void printList(){
    Node currNode = head;

    while(currNode != null){
        System.out.print(currNode.data+" -> ");

        currNode = currNode.next;
    }
    System.out.println("null");
   }
  public void addLast(String data){
    Node newNode = new Node(data);

    if(head == null){
        head=newNode;
        return;
    }


    Node lastNode = head;
    while(lastNode.next!= null){
        lastNode = lastNode.next;
    }

    lastNode.next = newNode;
  }
public void deleteFirst(){
    if(head == null){
        System.out.println("List is empty");
        return;
    }

    head = head.next;
}

public void deleteLast(){
    if(head == null){
        System.out.println("List is empty");
        return;
    }

    if(head.next == null){
        head = null;
        return;
    }

    Node secondLast = head;
    Node lastNode = head.next;
    while(lastNode.next != null){
        lastNode = lastNode.next;
        secondLast = secondLast.next;

    }

    secondLast.next = null;

}








    public static void main(String args[]){

        LL list = new LL();

        list.addFirst("is");
      
        list.printList();
        list.addLast("List");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
        list.deleteFirst();

    }
}