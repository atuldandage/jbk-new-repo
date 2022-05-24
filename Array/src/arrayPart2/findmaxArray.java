package arrayPart2;

public class findmaxArray {
public static void main(String[] args) {
	
	int b[]= {22,44,55,88};
	
	int max=b[0];    //first consider o index is max...
	
	for( int i=0    ; i<b.length ;i++  ) {
		
		if(b[i]>max) {
			
			max=b[i];	
		}
		
	}
	System.out.println("max number in array is+"+max);
	
	
}
}
