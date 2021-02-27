package edu.unca.csci333;

public class OpenAddressedHashTable {

	//instance variables
	int m;
	Integer[] myArray;
	static final int DELETED = Integer.MIN_VALUE;
	
	//constructor
	public OpenAddressedHashTable(int n) {
		//this.m=hash(n); 
		//The homework spec says make this same size as the chainedHash array, but shouldn't it be same as the number of inputs?
		this.m=n;
		myArray = new Integer[this.m];	
	}
	
	public int insert(int k) {
		for(int i=0; i<=this.m-1; i++) {
			int j = hash(k, i);
			if (myArray[j]== null || myArray[j]== DELETED) {  //we can place the element in a spot that is empty or in a spot that is deleted, whichever comes first.
					myArray[j]=k;
					return j;
			}
		}
		return -1;
		//TODO here: error, hash table overflow. Theoretically we have searched every spot by now and did not find an available (empty or deleted) spot.
	}
	
	public int delete(int k) {
		for(int i=0; i<=this.m-1; i++){
			int j = hash(k, i);   //call the probe sequence iteratively. This gives us the order in which we search for the key.
			if(myArray[j]==k) {
				myArray[j]= DELETED;
				return j;
			}
		}
		return -1; //error 'element not found'
	}
	
	
	//Should this be "Integer" object method which enables me to return Null instead of -1?
	public Integer search(int k) {
		for(int i=0; i<=this.m-1; i++) {
			int j = hash(k, i);
			if(myArray[j] == null)
				return -1; //in the item was in the table, it would be here, so null means we can stop searching because the item won't be further along our probe. We ignore "deleted" items and keep searching, however.
			if (myArray[j]==k)
				return myArray[j]; //found it, return it.
		}
		return null; //tried everything and still didn't find it, nor did we find a spot where it would be placed with a linear probe (which implies the element is not further down in our probe sequence and therefore we can stop searching)
	}
	
	/*
	 * Prints out our hash table in a neat format. Displays "deleted" spaces as though they are empty
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
	
	//primary hash function.
	//given a key and an index into the probe sequence, returns the appropriate element of the probe sequence, which is an index into the hash table's main array.
	//It does this by invoking the auxiliary hash method.
	
	/*
	 *	This is our primary hash function that enables linear probing. It calls the auxiliary 
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
