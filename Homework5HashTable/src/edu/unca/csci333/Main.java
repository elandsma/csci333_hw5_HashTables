package edu.unca.csci333;

import java.util.Arrays;

/**
 * CSCI 333, Homework 5: Hash Tables
 * 
 * @author Elias Landsman
 * @date February 26, 2021
 */



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Testing"); 
		ChainedHashTable myCHT = new ChainedHashTable(5);
		//myCHT.chtInsert(5);
		myCHT.printTable();
		myCHT.chtInsert(4);
		myCHT.printTable();

	}

}
