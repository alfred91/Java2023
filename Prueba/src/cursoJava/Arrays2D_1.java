package cursoJava;

public class Arrays2D_1 {

	public static void main(String[] args) {
		
	int matrix[][]={
			
			{1,2,3,4,5},
			{6,7,8,9,10},
			{11,12,13,14,15},
			{16,17,18,19,20}
					};	
	
			for(int[]fila:matrix) {
				
				System.out.println();
				
				for(int z:fila) {
					System.out.print(z +" ");
				}
			}

	}

}