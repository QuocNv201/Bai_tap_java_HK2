package MyComplex;
import java.util.Scanner;

public class TestMain {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter complex number 1 (real and imaginary part): ");
	        double real1 = scanner.nextDouble();
	        double imag1 = scanner.nextDouble();
	        MyComplex num1 = new MyComplex(real1, imag1);

	        System.out.print("Enter complex number 2 (real and imaginary part): ");
	        double real2 = scanner.nextDouble();
	        double imag2 = scanner.nextDouble();
	        MyComplex num2 = new MyComplex(real2, imag2);

	        System.out.println("\nNumber 1 is: " + num1);
	        System.out.println(num1.isReal() ? "It is a pure real number." : "It is NOT a pure real number.");
	        System.out.println(num1.isImaginary() ? "It is a pure imaginary number." : "It is NOT a pure imaginary number.");

	        System.out.println("\nNumber 2 is: " + num2);
	        System.out.println(num2.isReal() ? "It is a pure real number." : "It is NOT a pure real number.");
	        System.out.println(num2.isImaginary() ? "It is a pure imaginary number." : "It is NOT a pure imaginary number.");

	        System.out.println("\n" + num1 + " is " + (num1.equals(num2) ? "equal to" : "NOT equal to") + " " + num2);
	        System.out.println(num1 + " + " + num2 + " = " + num1.addNew(num2));
	        System.out.println(num1 + " - " + num2 + " = " + num1.subtractNew(num2));
	        System.out.println(num1 + " * " + num2 + " = " + num1.multiply(new MyComplex(real2, imag2)));
	        System.out.println(num1 + " / " + num2 + " = " + num1.divide(new MyComplex(real2, imag2)));
	        System.out.println("Conjugate of " + num1 + " = " + num1.conjugate());

	        scanner.close();
	    }
	}
