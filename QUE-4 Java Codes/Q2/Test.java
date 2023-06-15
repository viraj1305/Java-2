
// Name: Viraj R. Patel
// Student ID: 991682709
import java.util.Date;
import java.util.Scanner;

// The GeometricObject class represents a geometric object and contains properties such as color, fill status, and creation date.
class GeometricObject {
    private String color;
    private Date dateCreated;
    private boolean filled;

    // The default constructor sets the color to "red", filled to false, and
    // initializes the creation date to the current date.
    public GeometricObject() {
        this.dateCreated = new Date();
        this.color = "red";
        this.filled = false;
        
    }

    // The parameterized constructor sets the color, fill status, and initializes
    // the creation date to the current date.
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    // Getter for the color property.
    public String getColor() {
        return color;
    }

    // Setter for the color property.
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for the filled property.
    public boolean isFilled() {
        return filled;
    }

    // Setter for the filled property.
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Getter for the dateCreated property.
    public Date getDateCreated() {
        return dateCreated;
    }

    // Returns a string representation of the GeometricObject.
    public String toString() {
        return "GeometricObject[color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + "]";
    }
}

// The Triangle class represents a triangle, which is a subclass of
// GeometricObject.
class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    // The default constructor sets all sides to 1.0.
    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    // The parameterized constructor sets the values of all three sides.
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Getter for side3.
    public double getSide3() {
        return side3;
    }

    // Getter for side2.
    public double getSide2() {
        return side2;
    }

    // Getter for side1.
    public double getSide1() {
        return side1;
    }

     // Calculates and returns the perimeter of the triangle.
     public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Calculates and returns the area of the triangle using Heron's formula.
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Returns a string representation of the Triangle.
    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
    }
}

// The Test class is used to demonstrate the usage of the Triangle class.
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Prompt the user to enter the sides of the triangle.
        System.out.print("Enter three sides of the triangle: ");
        double side1 = in.nextDouble();
        double side2 = in.nextDouble();
        double side3 = in.nextDouble();

        // Prompt the user to enter the color of the triangle.
        System.out.print("Enter the color of the triangle: ");
        String color = in.next();
 
        // Prompt the user to enter the fill status of the triangle.
        System.out.print("Is the triangle filled (true/false)? ");
        boolean filled = in.nextBoolean();

        // Create a Triangle object with the provided sides.
        Triangle triangle = new Triangle(side1, side2, side3);

        // Set the color and fill status of the triangle.
        triangle.setColor(color);
        triangle.setFilled(filled);

        // Print information about the triangle.
        System.out.println("Triangle:");
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Filled: " + triangle.isFilled());
    }
}
