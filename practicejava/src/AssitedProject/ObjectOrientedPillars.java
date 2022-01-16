package AssitedProject;

import program.jav.inheritance.DisplayOverloading;

public class ObjectOrientedPillars {

	//inheritance
	class A
	{
		int b=34;
		void run() {
			System.out.println("running");
		}
	}
	class B extends A
	{
		void run()
		{System.out.println("B is running");}
		public static void main(String args[])
		{
			B n=new B();
			n.run();
			System.out.println("Test"+b);
		}
	}
	//static polymorphism
	class DisplayOverloading
	{
	    protected void disp(char c)
	    {
	         System.out.println(c);
	    }
	    
	    public void disp(char c, long num)  
	    {
	         System.out.println(c + " "+num);
	    }
	    
	    double disp(int c)
	    {
	       System.out.println(c);
	       return 0;
	    } 
	}

	public class StaticPolymorphism
	{
	   public static void main(String args[])
	   {
	       DisplayOverloading obj = new DisplayOverloading();
	       
	       obj.disp('a');
	       obj.disp('a',10); //?
	       obj.disp(5);       
	   }
	}
}
