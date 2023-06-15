// Name: Viraj R. Patel
// Student ID: 991682709

import java.util.Date;

// A geometric object with colour, fill status, and creation date is represented by the GeometricObject class.
class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    // Default constructor sets color to "white", filled to false, and initializes
    // dateCreated to the current date
    public GeometricObject() {
        this.color = "white";
        this.filled = false;
        this.dateCreated = new Date();
    }

    // Parameterized constructor sets color, filled, and initializes dateCreated to
    // the current date.
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    // Getter for color.
    public String getColor() {
        return color;
    }

    // Setter for color.
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for filled.
    public boolean isFilled() {
        return filled;
    }

    // Setter for filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Getter for dateCreated.
    public Date getDateCreated() {
        return dateCreated;
    }

    // Returns a string representation.
    public String toString() {
        return "GeometricObject[color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + "]";
    }
}

// is a subclass of GeometricObject
class Circle extends GeometricObject {
    private double radius;

    // Default constructor sets radius to 0 and calls the superclass constructor.
    public Circle() {
        super();
        this.radius = 0;
    }

    // Parameterized constructor sets radius to the given value and calls the
    // superclass constructor.
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Parameterized constructor sets radius, color, and filled status and calls the
    // superclass constructor.
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter for radius.
    public double getRadius() {
        return radius;
    }

    // Setter for radius.
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // returns the area of the circle.
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // returns the perimeter of the circle.
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // returns the diameter of the circle.
    public double getDiameter() {
        return 2 * radius;
    }

    // Prints information about the circle.
    public void printCircle() {
        System.out.println("Circle: " + toString());
    }
}

// Rectangle class represents a rectangle, which is a subclass of
// GeometricObject
class Rectangle extends GeometricObject {
    private double width;
    private double height;

    // Default constructor sets width and height to 0 and calls the superclass
    // constructor.
    public Rectangle() {
        super();
        this.width = 0;
        this.height = 0;
    }

    // Parameterized constructor sets width and height to the given values and calls
    // the superclass constructor
    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    // Parameterized constructor sets width, height, color, and filled status and
    // calls the superclass constructor.
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    // Getter for width.
    public double getWidth() {
        return width;
    }

    // Setter for width.
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter for height.
    public double getHeight() {
        return height;
    }

    // Setter for height.
    public void setHeight(double height) {
        this.height = height;
    }

    // returns the area of the rectangle.
    public double getArea() {
        return width * height;
    }

    // returns the perimeter of the rectangle.
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

// Test class to test the usage of Circle and Rectangle classes.
public class Test {
    public static void main(String[] args) {
        // Create a Circle object with radius 20, color "Red", and filled status false.
        Circle c = new Circle(20, "Red", false);

        // Create a Rectangle object with width 20, height 30, color "Blue", and filled
        // status true.
        Rectangle r = new Rectangle(20, 30, "Blue", true);

        // Print information about the Circle object.
        System.out.println("Circle radius: " + c.getRadius());
        System.out.println("Circle area: " + c.getArea());
        System.out.println("Circle perimeter: " + c.getPerimeter());
        System.out.println("Circle color: " + c.getColor());
        System.out.println("Circle filled: " + c.isFilled());
        System.out.println("Date created on: " + c.getDateCreated());

        System.out.println(); // Print a blank line

        // Print information about the Rectangle object.
        System.out.println("Rectangle width: " + r.getWidth());
        System.out.println("Rectangle height: " + r.getHeight());
        System.out.println("Rectangle area: " + r.getArea());
        System.out.println("Rectangle perimeter: " + r.getPerimeter());
        System.out.println("Rectangle color: " + r.getColor());
        System.out.println("Rectangle filled: " + r.isFilled());
        System.out.println("Date created on: " + r.getDateCreated());
    }
}
