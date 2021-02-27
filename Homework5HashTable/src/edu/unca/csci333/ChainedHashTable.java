package edu.unca.csci333;

import java.util.Arrays;
import java.util.LinkedList;



public class ChainedHashTable {

	//instance variables
	//this is our array wherein each index has a head of a unique LinkedList.
	public LinkedList<Integer>[] myArray;
	public int m;
	//constructor
	/*
	 * @param int n, total number of inputs that will be stored in this hash table.
	 * @precondition: n>0
	 */
	public ChainedHashTable(int n) {
		//establish M, which is length of the array.
		
		//get next highest power of 2
		this.m=1;
		while (this.m <n) {
			this.m *=2;
		}
		//create a size 'm' array of LinkedLists 
		this.myArray = new LinkedList[this.m];
		//instantiate an empty LinkedList in each spot
		for(int i=0; i<myArray.length; i++) {
			System.out.println(i);
			myArray[i] = new LinkedList<Integer>();
		}
		
		//in constructor, create array of size m as the first power of 2 larger than n, full of constructed but empty linked lists at each index.
		//You may choose A directly, or use integer fraction method.
	}
	
	/*
	 * Insert an item into our universe, specifically at the head of the linkedList of its hash index.
	 * @param int x, the key of the element we want to insert
	 */ 
	public void chtInsert(int x) {
		int h = hash(x);
		myArray[h].addFirst(x);		
	}
	
	/*
	 * Finds occurrence of element, returns it. Return -1 if not present.
	 * @param int k, the key of the item we seek.
	 */
	public int chtSearch(int k) {
		int h = hash(k);
		if (!myArray[h].contains(k)){
			return -1;
		}
		else return k;
		//in real life, we would be returning k.data, because K is just the key of the node.
	}

	/*
	 * @param int x, the element we want to delete
	 */ 
	public void chtDelete(int k) {
		int h = hash(k);
		//we have to find the indexOf before we can remove it.
		int index= myArray[h].indexOf(k);
		if(index!= -1)
			myArray[h].remove(index);
	}
		
	/*
	 * Prints a neatly formatted table of the universe.
	 */
	public void printTable() {
		for(int i=0; i<myArray.length; i++) {
			System.out.print("h["+i+"]:  ");
			System.out.println(myArray[i].toString());
		}
	}
	
	/*
	 *  This takes a key as input and returns the hash value. The hash value corresponds to an index of myArray-  that index is where the linkedList containing this item should be, if present.
	 */
	private int hash(int k) {
		//hash = m(kA%1), rounded down
		float A = (float) .6180339887;
		int hash = (int) ((this.m)*((k*A)%1));
		//we multiply A to the key K, use mod do get fractional part, then multiply by M
		//choose M to be a power of 2
		//m = 2^p where P is integer
		//h(k) = [m(kA mod 1)]
		//		where kA mod 1 is fractional part of kA, that is,  ( kA - [kA] )
		return hash;
	}
	
}
