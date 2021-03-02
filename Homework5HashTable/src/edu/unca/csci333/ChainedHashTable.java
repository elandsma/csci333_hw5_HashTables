package edu.unca.csci333;

import java.util.Arrays;
import java.util.LinkedList;

public class ChainedHashTable {

	//instance variables
	public LinkedList<Integer>[] myArray;
	public int m;

	//constructor
	/*
	 * @param int n, total number of inputs that will be stored in this hash table.
	 * @precondition: n>0
	 */
	public ChainedHashTable(int n) {
		//establish m by getting next highest power of 2
		this.m=1;
		while (this.m <n) {
			this.m *=2;
		}
		//create a size 'm' array of LinkedLists 
		this.myArray = new LinkedList[this.m];
		//instantiate an empty LinkedList in each spot of the array
		for(int i=0; i<myArray.length; i++) {
			myArray[i] = new LinkedList<Integer>();
		}
	}
	
	/*
	 * Insert an item into our universe, at the head of the linkedList of its appropriate hash index.
	 * @param int x, the key of the element we want to insert
	 */ 
	public void insert(int x) {
		int h = hash(x);
		myArray[h].addFirst(x);	//new item becomes head of linkedList.
	}
	
	/*
	 * Finds occurrence of element; return it if present, return -1 if not present.
	 * @param int k, the key of the item we seek.
	 */
	public int search(int k) {
		int h = hash(k);
		if (!myArray[h].contains(k)){
			return -1;
		}
		else return k;
		//in real life, we would likely be returning k.data, because k is just the key of the node, but this depends on what we are actually storing in the table.
	}

	/*
	 * @param int x, the element we want to delete
	 */ 
	public void delete(int k) {
		int h = hash(k);
		//we have to find the indexOf before we can remove it.
		int index= myArray[h].indexOf(k);
		if(index!= -1)
			myArray[h].remove(index);
	}
		
	/*
	 * Prints a neatly formatted table of our hash universe.
	 */
	public void printTable() {
		for(int i=0; i<myArray.length; i++) {
			System.out.print("h["+i+"]:  ");
			System.out.println(myArray[i].toString());
		}
	}
	
	/*
	 *  This takes a key as input and returns a hash value. The hash value corresponds to an index of myArray, and  that index is where the linkedList containing this item should be (or will be if inserting it).
	 *  @param int k, the key that we are hashing in order to find the value of the index for.
	 */
	private int hash(int k) {
		//hash = m(kA%1), rounded down
		float A = (float) .6180339887; //I chose the golden ratio decimal portion, but this could be something else, as long as we are consistent and it is 0<n<1
		int hash = (int) ((this.m)*((k*A)%1));
		return hash;
	}
}
