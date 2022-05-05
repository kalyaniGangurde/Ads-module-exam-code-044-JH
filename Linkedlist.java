class Linkedlist
{
static Node head;
static class Node{
int data;
Node next;
Node (int d)
{
data =d;
next =null;
}
}
Node reverse (Node node)
{
	Node prev =null;
	Node current= node;
	Node next =null;
	while (current!=null)
		next =current.next;
	    current.next=prev;
		prev=current;
		current=next;
}
node=prev;
return node;
}
void printList(Node node)
{
	while(node!=null){
		System.out.print(node.data +"");
		node =node.next;
	}
}
public static void main(String[]args){
	
Linkedlist list =new Linkedlist();
list.head=new Node(85);
list.head.next=new Node(15);
list.head.next.next=new Node(4);
list.head.next.next.next=new Node(20);
System.out.print("given");
list.printlist(head);
head= list.reverse(head);
System.out.print(" ");
System.out.print("reversed");
list.printlist(head);
}
}

		

