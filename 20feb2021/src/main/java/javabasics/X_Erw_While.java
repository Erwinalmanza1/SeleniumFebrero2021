package javabasics;

public class X_Erw_While {

	public static void main(String[] args) {
	
		double num = 0;
		
		while(num<=100) {
			
			System.out.println(num);
			if(num==80)
				break;
			
			num=num+.5;
	
		}

	}

}
