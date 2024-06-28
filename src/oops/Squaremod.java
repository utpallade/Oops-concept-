package oops;

public class Squaremod {
	
	    
	    public static double calculateArea(double sideLength) {
	        return sideLength * sideLength;
	    }

	    
	    public static double calculateArea(double diagonalLength, String dummyArgument) {
	        double sideLength = diagonalLength / Math.sqrt(2);
	        return sideLength * sideLength;
	    }

	    public static void main(String[] args) {
	        double sideLength = 5.0;
	        double diagonalLength = 7.0;

	       
	        double area1 = calculateArea(sideLength);
	        System.out.println("Area using side length: " + area1);

	        
	        double area2 = calculateArea(diagonalLength, "dummy");
	        System.out.println("Area using diagonal length: " + area2);
	    }
	}


