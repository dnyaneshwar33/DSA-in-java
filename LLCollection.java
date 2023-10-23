import java.util.*;
public class LLCollection{
    public static void main(String args[]){

        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("list");
        System.out.println(list);
        list.addFirst("this");
        System.out.println(list);
        System.out.println(list.size());
        list.add(3,"new");
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");

        }

        System.out.println("null");
        
        // list.removeFirst();
        //  System.out.println(list);
        //  list.removeLast();
        //  System.out.println(list);

        //remove element at specific index
        list.remove(2);
        System.out.println(list);

// reverse a linkedlist
       for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+"->");

        }

    }
}