package AssitedProject;

public class exception {
	    public static void main(String args[]) 
	    {
	        int[] array = new int[3];
	        try 
	        {
	            array[2] = 3/0;
	        }
	        catch (ArithmeticException e) 
	        {
	            System.out.println("Arithmetic Exception"); 
	        }
	        finally 
	        {
	            System.out.println("The array is of size " + array.length);
	        }
	    }
}