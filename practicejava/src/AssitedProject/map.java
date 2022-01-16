package AssitedProject;
import java.util.*;
public class map {
	 
	 	public static void main(String[] args) {
	 		
	 		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	 	      hm.put(1,"JAI");    
	 	      hm.put(2,"KRISH");    
	 	      hm.put(3,"SURYA");   
	 	       
	 	      System.out.println("\nThe elements of Hashmap are ");  
	 	      for(Map.Entry m:hm.entrySet()){    
	 	       System.out.println(m.getKey()+" "+m.getValue());    
	 	      }
	 	      
	 	     
	 	       
	 	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	 	      
	 	      ht.put(4,"USHA");  
	 	      ht.put(5,"RAJ");  
	 	      ht.put(6,"RAMA");  
	 	      ht.put(7,"JAYA");  

	 	      System.out.println("\nThe elements of HashTable are ");  
	 	      for(Map.Entry n:ht.entrySet()){    
	 	       System.out.println(n.getKey()+" "+n.getValue());    
	 	      }
	 	      
	 	      
	 	      //TreeMap
	 	      
	 	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	 	      map.put(8,"ANKIT");    
	 	      map.put(9,"KASHI");    
	 	      map.put(10,"RAM");       
	 	      
	 	      System.out.println("\nThe elements of TreeMap are ");  
	 	      for(Map.Entry l:map.entrySet()){    
	 	       System.out.println(l.getKey()+" "+l.getValue());    
	 	      }    
	 	      
	 	   }  
}