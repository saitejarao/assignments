package AssitedProject;


public class methods {
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    
	public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }
	
	public void area(float g,int c)
	{
		System.out.println("printing the value "+ g + "---" +c);
	}
	
	public void area(int h, float g, char m)
	{
		System.out.println("printing the value h"+ h + "---g  " + g + "----m"+ m);
	}

    public static void main(String args[])
    {
      methods ob=new methods();
      ob.area(2,5);
      ob.area(10.0f,12);
      ob.area(5);  
      ob.area(2,9.345434626346f,'m');
    }
}
