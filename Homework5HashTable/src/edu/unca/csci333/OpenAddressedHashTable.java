package edu.unca.csci333;

/**
 * CSCI 333, Homework 5: Hash Tables
 * This program is a demonstration of Chained Hash Tables and Open Addressed Hash Tables.
 * This class defines the Open Addressed Hash Table.
 * 
 * @author Elias Landsman
 * @date February 26, 2021
 */

public class OpenAddressedHashTable {

	//instance variables
	int m;
	Integer[] myArray;
	static final int DELETED = Integer.MIN_VALUE;
	
	//constructor
	/*
	 * @param n, maximum number of elements in our universe.
	 */
	public OpenAddressedHashTable(int n) {
		this.m=n;
		myArray = new Integer[this.m];	
		//we are creating an array of Integer objects, the size of the maximum number of objects we will have in this universe.
	}
	
	/*
	 *  Insert an element into the universe.
	 *  @param int k, the element we are inserting.
	 */
	public int insert(int k) {
		for(int i=0; i<=this.m-1; i++) {
			int j = hash(k, i);
			if (myArray[j]== null || myArray[j]== DELETED) {  //we can place the element in a spot that is empty or in a spot that is deleted, whichever comes first.
					myArray[j]=k;
					return j;
			}
		}
		return -1;
		//here: error, hash table overflow. Theoretically we have searched every spot by now and did not find an available (empty or deleted) spot.
	}
	
	/*
	 * Remove an element from the table.
	 * @param int k, the element to be removed.
	 */
	public int delete(int k) {
		for(int i=0; i<=this.m-1; i++){
			int j = hash(k, i);   //call the probe sequence iteratively. This gives us the order in which we search for the key.
			if(myArray[j]==k) {
				myArray[j]= DELETED;
				return j;
			}
		}
		return -1; //error 'element not found'. How we handle this would depend on how we write the rest of the program.
	}	
	
	/*
	 * Seek an item in the table, return it if present, return null if not.
	 * @param int k, the element we seek.
	 */
	public Integer search(int k) {
		for(int i=0; i<=this.m-1; i++) {
			int j = hash(k, i);
			if(myArray[j] == null)
				return -1; //in the item was in the table, it would be here, so null means we can stop searching because the item won't be further along our probe. We know this because a "deleted" element would be a different value (and that means our element could potentially be further down the linear probe), so "null" means we haven't touched this index yet. For "deleted" values of an index, we ignore them and keep searching/probing.
			if (myArray[j]==k)
				return myArray[j]; //found it, return it.
		}
		return null; //tried everything and still didn't find it, nor did we find a spot where it would be placed with a linear probe (which implies the element is not further down in our probe sequence and therefore we can stop searching)
	}
	
	/*
	 * Prints out our hash table in a neat format. For educational purposes, this clearly displays when spaces are "deleted" (as in, had a value previously, but now do not), but in production code this wouldn't necessarily be how you want to display this, depending on the usage.
	 */
	public void printTable() {
		for(int i=0; i<myArray.length; i++) {
			System.out.print("h["+i+"]:  ");
			if(String.valueOf(myArray[i]).equals(String.valueOf(DELETED)))
				System.out.println("(deleted)");
			else if(myArray[i]==null)
				System.out.println("");
			else 
				System.out.println(String.valueOf(myArray[i]));
		}
	}
		
	/*
	 *	This is our primary hash function that enables linear probing. It calls the auxiliary hash method and performs a function on that number to return where we are probing.
	 *	@param int key, the key of element we are placing.
	 *	@param index, this is iterative and given from the parent method that calls this function. This number is hashed together with the key, to return the value of the index to look at next.
	 */
	private int hash(int key, int index) {
		int hprime = hash(key);
		return ((hprime+index)%m);
		//tells you the i'th place to look.
	}
		
	/*
	 *  This takes a key as input and returns the hash value.
	 *  This is the "auxiliary" hash function.
	 *  @param int k, the key of the element we are hashing and getting an index for.
	 */
	private int hash(int k) {
		float A = (float) .6180339887;
		int hash = (int) ((this.m)*((k*A)%1));
		return hash;
	}		
}
