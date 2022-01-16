package AssitedProject;

import java.io.IOException;

class threadthrows{  
	  void m()throws IOException{  
	    throw new IOException("device error");//checked exception  
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
		  threadthrows obj=new threadthrows();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }  
	}  
