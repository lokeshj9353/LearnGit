package Datatypesuper;

public class Demo2 {
	public static void main(String[] args) {
		
		int a=123;
		int s=0;
		while(a!=0) {
			int r=a%10;
			s=s*10+r;
			a=a/10;
		}
System.out.println(s);
}
}