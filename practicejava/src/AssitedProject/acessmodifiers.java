package AssitedProject;

public class acessmodifiers {
	private int i=34;
	long g=34445;
	protected float h=394.556f;
		
		
		public void methodPublic() {
			System.out.println("classM: Method is public");
			methodPrivate();
		}
		void defaultmethod() {
			System.out.println("classM: Method is default");
		}
		protected void methodProtected() {
			System.out.println("classM: Method is protected");
		}
		
		private void methodPrivate() {
			System.out.println("classM: Method is private");
			System.out.println("i value is"+i);
			System.out.println("g value is"+g);
			System.out.println("h value is"+h);
		}
		public static void main(String args[])
		{
			acessmodifiers g=new acessmodifiers();
			g.methodPublic();
			g.defaultmethod();
			g.methodProtected();
			g.methodPrivate();
		}
}
