package AssitedProject;

public class innerclass {
	

		 private int f=4353; 
		 
		 class Inner{  
		  void hello(){
	      System.out.println("Inner class");
		  System.out.println("Outer class:"+f);
		  }  
		 }  


		public static void main(String[] args) {

			innerclass obj=new innerclass();
			innerclass.Inner in=obj.new Inner();  
			in.hello();  
		}
	}

/*
	public class innerclass {

	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	 
	public static void main(String[] args) {
		innerClassAssisted2  ob=new innerClassAssisted2 ();  
		ob.display();  
		}
	}


	//anonymous inner class
	abstract class AnonymousInnerClass {
		   public abstract void display();
		}


		public class innerClass {

		public static void main(String[] args) {
		AnonymousInnerClass i = new AnonymousInnerClass() {

		         public void display() {
		            System.out.println("Anonymous Inner Class");
		         }
		      };
		      i.display();
		   }
		}
*/

