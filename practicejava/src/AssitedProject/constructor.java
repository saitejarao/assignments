package AssitedProject;


	class EmpInfo{
		int id=452;
		String name="raju";

	void display() {
		System.out.println(id+" "+name);
		}
	}

	public class constructor {

	public static void main(String[] args) {

		EmpInfo emp1=new EmpInfo();
		EmpInfo emp2=new EmpInfo();

		emp1.display();
		emp2.display();
		}
	}

	/*//parameterized constructor
	class Std{
		int id;
		String name;

		Std(int i,String n)
		{
		id=i;
		name=n;
		}

		void display() {
		System.out.println(id+" "+name);
		}
	}

	public class constructor {
	public static void main(String[] args) {

		Std std1=new Std(948,"raju");
		Std std2=new Std(746,"Amrut");
		std1.display();
		std2.display();
			}
	}
*/


