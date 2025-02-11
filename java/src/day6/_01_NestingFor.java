package day6;

public class _01_NestingFor {

	public static void main(String[] args) {
		/*
		 ***
		 ***
		 ***
		 ***
		 ***
		 
		 */
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 0시 0분부터 23시 59분
		for(int k = 0; k<24; k++) {
			
			for(int l=0;l<60;l++) {
				
				System.out.printf("%d시 %d분\n",k,l);
				
			}
			System.out.println();
		}
	}

}
