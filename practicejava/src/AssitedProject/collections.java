package AssitedProject;

import java.util.*;

public class collections{

		public static void main(String[] args) {
			//creating arraylist
			System.out.println("ArrayList");
			ArrayList<String> city=new ArrayList<String>();   
		      city.add("HYDERABAD");//
		      city.add("WARANGAL");    	   
		      System.out.println(city);  
			
			//creating vector
		      System.out.println("\n");
		      System.out.println("Vector");
		      Vector<Integer> vec = new Vector();
		      vec.addElement(74); 
		      vec.addElement(30); 
		      System.out.println(vec);
			
			
		       
		       //creating hashset
		       System.out.println("\n");
		       System.out.println("HashSet");
		       HashSet<Integer> s1=new HashSet<Integer>();  
		       s1.add(451);  
		       s1.add(154);  
		       s1.add(198);
		       s1.add(928);
		       System.out.println(s1);
		       
		       //creating linkedhashset
		       System.out.println("\n");
		       System.out.println("LinkedHashSet");
		       LinkedHashSet<Integer> s=new LinkedHashSet<Integer>();  
		       s.add(19);  
		       s.add(45);  
		       s.add(23);
		       s.add(76);	       
		       System.out.println(s);
		      	} 
		      }  