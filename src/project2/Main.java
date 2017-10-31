package project2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter gym date" );
		 String date = sc.nextLine();
		 System.out.println( date );
		List<LocalDate> datelist =new ArrayList();
		
		LocalDate today = LocalDate.now();
	
		;
		LocalDate tommarow = today.plusDays(1);
	LocalDate ysterday = today.minusDays(1);
	   
		
	
		if(today.isAfter(tommarow) ) {
			System.out.println("nice logic");
			
		}
		else {
			System.out.println("its not correct");
		}

	
		datelist.add(today);
		 datelist.add(tommarow);
	
		for (int i = 0; i < datelist.size(); i++) {
			LocalDate tempdart = datelist.get(i);
			System.out.println(datelist);
			datelist.remove(today);
			System.out.println("***********************");
			//datelist.sort(null);
			
		}	
		

	}
	}

