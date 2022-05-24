
public class intarray {

	int[] m1() {
		
		int a[]=new int[2];
		a[0]=24;
		a[1]=34;
		return a;
		}
	void m2(int b) {
		System.out.println("i am in m2");
	}
		public static void main(String[] args) {
		
	intarray ss=new intarray();
	
int[]yy=	ss.m1();
for(int i=0;  i<yy.length ;i++   ) {
	System.out.println(yy[i]);
}
	
	
      ss.m2(44);	
	}
	
	
	
}
