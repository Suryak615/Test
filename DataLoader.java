package com.dnpass.corejavatraining.day8.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.dnpass.corejavatraining.day13.Stream.Person;

public class DataLoader {

	public static List<Transaction> newTransactions() {
		List<Transaction> transactions=new ArrayList<Transaction>();
		transactions.add(new Transaction(123,ProductType.FUEL,33.33,"london","GBP"));
		transactions.add(new Transaction(124,ProductType.GROCERIES,15.33,"america","USD"));
		transactions.add(new Transaction(125,ProductType.FRUITS,152.22,"london","GBP"));
		transactions.add(new Transaction(124,ProductType.ELECTRIC,100.0,"BANGALORE","INR"));
		transactions.add(new Transaction(127,ProductType.FUEL,33.33,"bangalore","INR"));
		transactions.add(new Transaction(128,ProductType.FUEL,12.22,"london","GBP"));
		transactions.add(new Transaction(129,ProductType.GROCERIES,99.99,"russia","GBP"));
		return transactions;
		
		

	}
	public static List<Person> newPersons(){
		return Arrays.asList(new Person("ted","neward",42),new Person("charlotte","neward",39)
				,new Person("michal","neward",19),new Person("mathew","newton",13),new Person("naal","ford",45),
				new Person("candy","ford",39),new Person("jeff","brown",43),new Person("betsy","brown",39));
	}

}
