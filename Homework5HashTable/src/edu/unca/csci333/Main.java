package edu.unca.csci333;

import java.util.Arrays;

/**
 * CSCI 333, Homework 5: Hash Tables
 * This program is a demonstration of Chained Hash Tables and Open Addressed Hash Tables.
 * This Main method runs the test/example methods.
 * 
 * @author Elias Landsman
 * @date February 26, 2021
 */


public class Main {

	/*
	 * Main method used for testing/displaying functionality of the hash tables.
	 */
	public static void main(String[] args) {		
		System.out.println("Chained Hash Table Test/Demonstration:"); 
		ChainedHashTable myCHT = new ChainedHashTable(20);
		System.out.println("Empty Table before adding items: ");
		myCHT.printTable();
		//insert 20 items
		myCHT.insert(4);
		myCHT.insert(18);
		myCHT.insert(6);
		myCHT.insert(6);
		myCHT.insert(4);
		myCHT.insert(1543);
		myCHT.insert(4352);
		myCHT.insert(43);
		myCHT.insert(657);
		myCHT.insert(1);
		myCHT.insert(20);
		myCHT.insert(230);
		myCHT.insert(543);
		myCHT.insert(64);
		myCHT.insert(23);
		myCHT.insert(2);
		myCHT.insert(4359);
		myCHT.insert(639);
		myCHT.insert(17);
		System.out.println("\nAfter adding 20 items: ");
		myCHT.printTable();
		//delete 5 items
		System.out.println("\nRemoving elements: 23, 4, 43, 1, 657:");
		myCHT.delete(23);
		myCHT.delete(4);
		myCHT.delete(43);
		myCHT.delete(1);
		myCHT.delete(657);
		myCHT.printTable();
		
		//search for 5 items in table
		System.out.println("\nSeeking 5 items that are in the table:");
		System.out.println(myCHT.search(17));
		System.out.println(myCHT.search(4359));
		System.out.println(myCHT.search(2));
		System.out.println(myCHT.search(4));
		System.out.println(myCHT.search(639));
		//search for 5 items not in table
		System.out.println("\nSeeking 5 items that are not in the table:");		
		System.out.println(myCHT.search(33));
		System.out.println(myCHT.search(428));
		System.out.println(myCHT.search(5000));
		System.out.println(myCHT.search(4000));
		System.out.println(myCHT.search(11));
		
		
		System.out.println("\n~~~~~~~~~~~~~~\n");
		System.out.println("Open Addressed Hash Table Test/Demonstration:"); 
		OpenAddressedHashTable myOAHT = new OpenAddressedHashTable(20);
		System.out.println("Empty Table:");
		myOAHT.printTable();
		//insert 20 items
		System.out.println("\nInserting 20 items into the Table:");
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
		System.out.println("\nRemoving elements: 20, 436, 43, 3524, 954");
		myOAHT.delete(20);
		myOAHT.delete(436);
		myOAHT.delete(43);
		myOAHT.delete(3524);
		myOAHT.delete(954);
		myOAHT.printTable();
		
		//search for 5 items in table
		System.out.println("\nSeeking 5 items that are in the table:");
		System.out.println(myOAHT.search(20));
		System.out.println(myOAHT.search(345));
		System.out.println(myOAHT.search(7));
		System.out.println(myOAHT.search(54));
		System.out.println(myOAHT.search(11));		
		//search for 5 items not in table
		System.out.println("\nSeeking 5 items that are not in the table:");		
		System.out.println(myOAHT.search(700));
		System.out.println(myOAHT.search(800));
		System.out.println(myOAHT.search(900));
		System.out.println(myOAHT.search(1000));
		System.out.println(myOAHT.search(12534534));
	}
}
