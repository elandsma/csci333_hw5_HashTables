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
		System.out.println("Removing elements: 23, 4, 43, 1, 657");
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
		
		
		System.out.println("~~~~~~~~~~~~~~\n");
		System.out.println("Open Addressed Hash Table Test/Demonstration:"); 
		OpenAddressedHashTable myOAHT = new OpenAddressedHashTable(20);
		myOAHT.printTable();
		//insert 20 items
		myOAHT.insert(4);
		myOAHT.insert(18);
		myOAHT.insert(18);
		myOAHT.insert(20);
		myOAHT.insert(20);		
		myOAHT.insert(20);
		myOAHT.insert(54363);
		myOAHT.insert(492);
		myOAHT.insert(0);
		myOAHT.insert(11);
		myOAHT.insert(4327);
		myOAHT.insert(3524);
		myOAHT.insert(436);
		myOAHT.insert(435);
		myOAHT.insert(434);
		myOAHT.insert(345);
		myOAHT.insert(7);
		myOAHT.insert(54);
		myOAHT.insert(43);
		myOAHT.insert(954);
		myOAHT.printTable();
		//delete 5 items
		System.out.println("Removing elements: 20, 436, 43, 3524, 954");
		myOAHT.delete(20);
		myOAHT.delete(436);
		myOAHT.delete(43);
		myOAHT.delete(3524);
		myOAHT.delete(954);
		myOAHT.printTable();
		
		//search for 5 items in table
		System.out.println("Seeking 5 items that are in the table:");
		System.out.println(myOAHT.search(20));
		System.out.println(myOAHT.search(345));
		System.out.println(myOAHT.search(7));
		System.out.println(myOAHT.search(54));
		System.out.println(myOAHT.search(11));		
		//search for 5 items not in table
		System.out.println("Seeking 5 items that are not in the table:");		
		System.out.println(myOAHT.search(700));
		System.out.println(myOAHT.search(800));
		System.out.println(myOAHT.search(900));
		System.out.println(myOAHT.search(1000));
		System.out.println(myOAHT.search(12534534));
	}
}
