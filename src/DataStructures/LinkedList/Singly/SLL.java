package DataStructures.LinkedList.Singly;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SLL {
    Node head;

    SLL(){
        head=null;
    }

    void insertAtHead(int val){
        Node n=new Node(val);
        n.next=head;
        head=n;
    }

    void insertAtTail(int val){
        Node n=new Node(val);
        if(head==null){
            head=n;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
    }

    void insertAtPos(int val,int pos){
        Node n=new Node(val);
        if(pos==1){
            n.next=head;
            head=n;
            return;
        }
        Node temp=head;
        for(int i=1;i<pos-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Position out of range");
            return;
        }
        n.next=temp.next;
        temp.next=n;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
}
class Driver{
    public static void main(String[] args) {
        SLL sll=new SLL();
        sll.insertAtTail(100);

        sll.insertAtHead(10);
        sll.insertAtHead(20);
        sll.insertAtHead(30);
        sll.insertAtHead(40);
        sll.insertAtHead(50);
        sll.insertAtPos(99,3);
        sll.display();


    }
}
