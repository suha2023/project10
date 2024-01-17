/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singlelinkedlist1;

/**
 *
 * @author suha9
 */
public class SingleLinkedList1 {
class Node 
  { 
   int data; 
   Node next;  // Next is by default initialized  as null
   Node (int d) {data = d; next = null;}  // Constructor to create a new node         
  

class singleLinkedList1
{
	 
Node head;
        private int NewData;
//This function prints contents of linked list starting from head

 public void append(int newdata)
{ 
 Node NewNode = new Node(newdata); // Allocate the Node and store the data in it
       Node head = null;
 
if (head == null) //If the Linked List is empty
   { 
   head = new Node(newdata); //,then make the new node as head
   return; 
   }
NewNode.next = null; //This new node will be the last node, so make next of it as null

Node last = head;
  while (last.next != null){
      last = last.next;
  }
  last.next = NewNode;  //Change the next of last node
 return; 
} 
 public void printList(){
     Node N =head;
  while(N !=null){
      System.out.print(N.data" ");
         N=N.next;
     }
 }
public void push(int newdata) 
{ 
Node NewNode = new Node(newdata); // Allocate the Node & store  the data
NewNode.next = head; // Make next of new Node as head  
head = NewNode; // Move the head to point to new Node 
} 
public void insertAfter(Node PrevNode, int newdata) 
{ 
if (PrevNode == null) 
  { 
   System.out.println("The given previous node cannot be null"); 
   return; 
  } 
Node NewNode = new Node(newdata); //Allocate the Node &  3. Put in the data
NewNode.next = PrevNode.next; //Make next of new Node as next of prev_node 
PrevNode.next = NewNode;  //make next of prev_node as new_node 
  } 
}   

public class SingleLinkedList{
    

public static void main(String arg[])
{
SingleLinkedList1 llist = new SingleLinkedList1();  //Start with the empty list 

llist.append(6);  //Insert 6. So linked list becomes 6->NUllist 

llist.push(8);  //Insert 7 at the beginning. So the list becomes 7->6->NUllist 

llist.push(9);  //Insert 1 at the beginning. So the list becomes 1->7->6->NUllist 

llist.printList();
// The List printed are 1 7 8 6 4 6 4 
}
}
        // TODO code application logic here
    

 

