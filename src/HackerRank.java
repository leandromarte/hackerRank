import java.util.Scanner;

public class HackerRank {

	private static void simpleArraySum() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();		
        int result = 0;
        
        in.nextLine();
        
        String numbersStr = in.nextLine();
        String[] split = numbersStr.split("\\s+");
        
        for (int i = 0; i < n; i++) {
        	result += Integer.parseInt(split[i]);
        }
        
        System.out.println(result);
        in.close();
	}

	private static void aVeryBigSum() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();		
        long result = 0;
        
        in.nextLine();
        
        String numbersStr = in.nextLine();
        String[] split = numbersStr.split("\\s+");
        
        for (int i = 0; i < n; i++) {
        	result += Long.parseLong(split[i]);
        }
        
        System.out.println(result);
        in.close();		
	}

	private static void diagonalDifference() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();		
        int result = 0;
        
        in.nextLine();
        
        String[][] matrix = new String[n][n]; 
        
        for (int i = 0; i < n; i++) {
        	String numbersStr = in.nextLine();
        	matrix[i] = numbersStr.split("\\s+");
        }
        
        int leftDiagonal = 0, rightDiagonal = 0;
        
        
        for (int i = 0; i < n; i++) {
        	leftDiagonal += Integer.parseInt(matrix[i][i]);
        	rightDiagonal += Integer.parseInt(matrix[i][n - i - 1]);
        } 
        result = Math.abs(leftDiagonal - rightDiagonal);
        
        System.out.println(result);
        in.close();			
	}

	private static void plusMinus() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();		
        double totalNegative = 0, totalPositive = 0, totalZeroes = 0;
        
        in.nextLine();
        
        String[] numbers = in.nextLine().split("\\s+");
        int current = 0;
        
        for (int i = 0; i < n; i++) {
        	current = Integer.parseInt(numbers[i]);
        	if (current == 0) {
        		totalZeroes++;
        	} else if (current < 0) {
        		totalNegative++;
        	} else {
        		totalPositive++;
        	}
        }
        
        System.out.println(totalPositive / n);
        System.out.println(totalNegative / n);
        System.out.println(totalZeroes / n);
        
        in.close();
	}
	
	public static void main(String[] args) {
		plusMinus();
	}

}
