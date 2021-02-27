package edu.unca.csci333;

public class OpenAddressedHashTable {

	//instance variables
	int m;
	Integer[] myArray;
	static final int DELETED = Integer.MIN_VALUE;
	
	//constructor
	public OpenAddressedHashTable(int n) {
		this.m=hash(n);
		myArray = new Integer[this.m];
	//	In the constructor, create the array of size m as an array of Integer of the same array length as the ChainedHashTable class's array.
	//based on a hash table with open addressing, using linear probing from the slides/textbook and an auxiliary hash function identical to your ChainedHashTable's hash function. Your should use an array of Integer objects as your primary instance variable / data field.
		
	}
	
	public int insert(int k) {
		for(int i=0; i<=this.m-1; i++) {
			int j = hash(k, i);
			if (myArray[j]== null || myArray[j]== DELETED) {
					myArray[j]=k;
					return j;
			}
		}
		//TODO here: error, hash table overflow
	}
	
	public int delete(int k) {
		for(int i=0; i<=this.m-1; i++){
			int j = hash(k, i);
			if(myArray[j]==k) {
				myArray[j]= DELETED;
				return j;
			}
		}
		error 'element not found'
	}
	
	public int search(int k) {
		for(int i=0; i<=this.m-1; i++) {
			int j = hash(k, i);
			if(myArray[j] == null)
				return -1;
			if (myArray[j]==k)
				return myArray[j];
		}
		return -1;
	}
	
	public void printTable() {
		
	}
	
	//linear probe sequence
	private int hash(int key, int index) {
		//tells you the i'th place to look.
		return 0;
	}
	
	/*
	 *  This takes a key as input and returns the hash value. The hash value corresponds to an index of myArray-  that index is where the linkedList containing this item should be, if present.
	 */
	private int hash(int k) {
		float A = (float) .6180339887;
		int hash = (int) ((this.m)*((k*A)%1));
		return hash;
	}
	
	
	
}
