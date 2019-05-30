package j2ee.p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BuyBooks {

	public static void main(String[] args) {
		// TODO Auto-generaed method stub

		ArrayList<Books> lb=new ArrayList<Books>();
		Books b1=new Books("dfdfd","dcdc","dvsd",54);
		Books b2= new Books("fdfdf","fdfd","dfdfd",5);
		
		ArrayList<Books> lb2=new ArrayList<Books>();
		
		
		lb.add(b1);
		lb.add(b2);
		for(Books b:lb) {
			
			System.out.println(b);
		}
		
	Collections.sort(lb, new Compare());
	
	System.out.println("Sorted lb");
	for(Books b:lb) {
		
		System.out.println(b);
	}
	

	for(Books b:lb) {
		
		lb2.add(b);
	}
	
	System.out.println("\nnew lb");
	
for(Books b:lb2) {
		
		System.out.println(b);
	}
		
	
	}

}
