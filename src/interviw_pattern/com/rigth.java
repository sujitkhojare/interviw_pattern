package interviw_pattern.com;

public class rigth { 
	public static void main(String[] args) {
		 int n = 5;
		 for (int i = 1; i <= n; i++) { 
	            // Print spaces before the asterisks
	         for (int j = 1; j<=i ; j++) { 
	                System.out.print(" ");
	            }	            // Print asterisks for each row
	             for (int j = i; j <= n; j++) { 
	                System.out.print("*");
	            }
	            // Move to the next line after each row
	            System.out.println();
	        }
	    }
	}