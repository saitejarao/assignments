package AssitedProject;

public class thread implements Runnable{
		 
	    public static int myCount = 0;
	    public thread(){
	         
	    }
	    public void run() {
	        while(thread.myCount <= 10){
	            try{
	                System.out.println("Expl Thread: "+(++thread.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex) {
	                System.out.println("Exception in thread: "+iex.getMessage());
	            }
	        }
	    } 
	    public static void main(String a[]){
	        System.out.println("Starting Main Thread...");
	        thread mrt = new thread();
	        Thread t = new Thread(mrt);
	        t.start();
	        while(thread.myCount <= 10){
	            try{
	                System.out.println("Main Thread: "+(++thread.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex){
	                System.out.println("Exception in main thread: "+iex.getMessage());
	            }
	        }
	        System.out.println("End of Main Thread...");
	    }
	}


