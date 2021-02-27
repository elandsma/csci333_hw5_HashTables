package edu.unca.csci333;

import java.util.Arrays;

/**
 * CSCI 333, Homework 5: Hash Tables
 * 
 * @author Elias Landsman
 * @date February 26, 2021
 */


public class Main {

	/*
	 * Main method used for testing.
	 */
	public static void main(String[] args) {
		//pseudocode:
		//create a CHT object and fill it with at least n=20 inserted elements.
		//print the hash table.
		//remove a handful of elements, then print table again.
		//then search for at least 5 keys in the table, and 5 keys not in table, printing results of the search each time.
		
		//create an OAHT object and fill it with at least n=20 inserted elements.
		//print the table
		//remove a handful of elelemts, then print table again.
		//Then search for at least 5 keys in the table and 5 keys not in the table, printing out the results of the search each time.

		
		System.out.println("Chained Hash Table Test/Demonstration:"); 
		ChainedHashTable myCHT = new ChainedHashTable(20);
		myCHT.printTable();
		//insert 20 items
		myCHT.chtInsert(4);
		myCHT.chtInsert(18);
		myCHT.chtInsert(6);
		myCHT.chtInsert(6);
		myCHT.chtInsert(4);
		myCHT.chtInsert(1543);
		myCHT.chtInsert(4352);
		myCHT.chtInsert(43);
		myCHT.chtInsert(657);
		myCHT.chtInsert(1);
		myCHT.chtInsert(20);
		myCHT.chtInsert(230);
		myCHT.chtInsert(543);
		myCHT.chtInsert(64);
		myCHT.chtInsert(23);
		myCHT.chtInsert(2);
		myCHT.chtInsert(4359);
		myCHT.chtInsert(639);
		myCHT.chtInsert(17);
		myCHT.printTable();
		//delete 5 items
		System.out.println("Removing elemsnts: 23, 4, 43, 1, 657");
		myCHT.chtDelete(23);
		myCHT.chtDelete(4);
		myCHT.chtDelete(43);
		myCHT.chtDelete(1);
		myCHT.chtDelete(657);
		myCHT.printTable();
		
		//search for 5 items in table
		System.out.println("Seeking 5 items that are in the table:");
		System.out.println(myCHT.chtSearch(17));
		System.out.println(myCHT.chtSearch(4359));
		System.out.println(myCHT.chtSearch(2));
		System.out.println(myCHT.chtSearch(4));
		System.out.println(myCHT.chtSearch(639));
		//search for 5 items not in table
		System.out.println("Seeking 5 items that are not in the table:");		
		System.out.println(myCHT.chtSearch(33));
		System.out.println(myCHT.chtSearch(428));
		System.out.println(myCHT.chtSearch(5000));
		System.out.println(myCHT.chtSearch(4000));
		System.out.println(myCHT.chtSearch(11));

	}

}
