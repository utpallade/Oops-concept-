package oops;

import java.util.Scanner;

public class Complex {
    private double real;
    private double imaginary;

    // Constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public Complex add(Complex num) {
        double realSum = this.real + num.real;
        double imaginarySum = this.imaginary + num.imaginary;
        return new Complex(realSum, imaginarySum);
    }

    // Method to subtract two complex numbers
    public Complex subtract(Complex num) {
        double realDiff = this.real - num.real;
        double imaginaryDiff = this.imaginary - num.imaginary;
        return new Complex(realDiff, imaginaryDiff);
    }

    // Method to multiply two complex numbers
    public Complex multiply(Complex num) {
        double realProduct = (this.real * num.real) - (this.imaginary * num.imaginary);
        double imaginaryProduct = (this.real * num.imaginary) + (this.imaginary * num.real);
        return new Complex(realProduct, imaginaryProduct);
    }

    // Method to display the complex number
    public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the real and imaginary parts of the first complex number
        System.out.println("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number: ");
        double imaginary1 = scanner.nextDouble();
        Complex complex1 = new Complex(real1, imaginary1);

        // Get the real and imaginary parts of the second complex number
        System.out.println("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number: ");
        double imaginary2 = scanner.nextDouble();
        Complex complex2 = new Complex(real2, imaginary2);

        // Perform the operations
        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);

        // Display the results
        System.out.println("Sum: ");
        sum.display();
        System.out.println("Difference: ");
        difference.display();
        System.out.println("Product: ");
        product.display();

        scanner.close();
    }
}

