package arrayPart2;

public class printArray {
	
public static void main(String[] args) {
	int [][] a= {{10,20,30,40},{50,60},{70,80,90}};
	//here a.length=3
	for(int i=0;i<a.length    ; i++   ) {
	 //here a[i]=4
	for(int j=0  ;j<a[i].length  ; j++ ) {
			
		System.out.println(a[i][j]+" ");	
		}
	}
	System.out.println();
	
	
	
}	

}
