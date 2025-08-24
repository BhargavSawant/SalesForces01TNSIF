package com.TNSIF;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
	Node head;

	void insert(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
				temp = temp.next;
			}
		temp.next = newNode;
	}
	
	void print(){
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println("Null");
	}
}

public class leetcode_LinkedList {
	
	public static void main(String[] args) {
		LinkedList solve = new LinkedList();
		solve.insert(10);
		solve.insert(20);
		solve.insert(10);
		solve.print();
	}
}	
