package com.dnpass.corejavatraining.day8.Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;

public class MainTrans extends TransactionService {

	public static void main(String[] args) {
		
		Transaction t1 = new Transaction(126, ProductType.GROCERIES, 100.33, "USA", "DOLLARS");
		Transaction t2 = new Transaction(127, ProductType.ELECTRIC, 159.44, "UK", "GBP");
		Transaction t3 = new Transaction(128, ProductType.FRUITS, 34.75, "USA", "DOLLARS");
		Transaction t4 = new Transaction(129, ProductType.FUEL, 94.15, "KERELA", "INR");
		Transaction t5 = new Transaction(130, ProductType.FRUITS, 489.98, "DELHI", "INR");
		Transaction t6 = new Transaction(131, ProductType.GROCERIES, 78.45, "USA", "DOLLARS");
		Transaction t7 = new Transaction(132, ProductType.ELECTRIC, 77.98, "LONDON", "GBP");

		TransactionService ts = new TransactionService();
		ts.create(t1);
		ts.create(t2);
		ts.create(t3);
		ts.create(t4);
		ts.create(t5);
		ts.create(t6);
		ts.create(t7);

		System.out.println("After Creating Transactions :");
		ts.ShowTransactions();
		ts.delete(t5);
		System.out.println("\nAfter Removing Transaction 5 :");
		ts.ShowTransactions();
		System.out.println("\nFind transaction 5 and 4 :" + ts.find(t5) + " " + ts.find(t4));
		Transaction t8 = new Transaction(128, ProductType.FRUITS, 100.15, "KERELA", "INR");
		ts.update(t8);
		System.out.println("\nAfter updating :");
		ts.ShowTransactions();
		System.out.println("\nfind by ID :");
		ts.findById(126);
		System.out.println("\nfind by ProductType :");
		System.out.println(ts.findByProductType(ProductType.FRUITS));

		// samples

		System.out.println("\nDelete by city :");
		ts.DeleteByCity("USA");
		ts.ShowTransactions();

		System.out.println("\nDelete Dublicates :");
		Transaction t9 = new Transaction(128, ProductType.FRUITS, 100.15, "KERELA", "INR");
		Transaction t10 = new Transaction(128, ProductType.FRUITS, 100.15, "KERELA", "INR");
		Transaction t11 = new Transaction(127, ProductType.ELECTRIC, 159.44, "UK", "GBP");
		ts.create(t9);
		ts.create(t10);
		ts.create(t11);
		System.out.println("\nbefore Delete Dublicates :");
		ts.ShowTransactions();
		ts.removeDuplicate();
		System.out.println("\nafter Delete Dublicates :");
		ts.ShowTransactions();

		System.out.println("\nSwap transaction :");
		System.out.println("\nbefore Swap transaction :");
		ts.ShowTransactions();
		ts.swapTransactions(1, 5);
		System.out.println("\nafter Swap transaction :");
		ts.ShowTransactions();

		System.out.println("\nReplace Product type :");
		ts.replaceProductType(ProductType.FUEL, ProductType.ELECTRIC);
		ts.ShowTransactions();

		System.out.println("\nNew Transactions :");
		ts.newTransaction(1, 5);
		
		
		System.out.println("\nFind Transactions using binary search :");
		ts.ShowTransactions();
		ts.binarySearch(t2);

		System.out.println("\nSort Transactions :");
		ts.sortByAmount();
		System.out.println("\nAfter Sort Transactions by amount :");
		ts.ShowTransactions();

		ts.sortByCity();
		System.out.println("\nAfter Sort Transactions by City :");
		ts.ShowTransactions();
		
		
	}


}
