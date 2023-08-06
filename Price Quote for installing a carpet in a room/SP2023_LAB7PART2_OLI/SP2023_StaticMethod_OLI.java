//SP2023_LAB7PART2_OLI
//SP2023_StaticMethod_OLI

public class SP2023_StaticMethod_OLI {
    public static double squareArea(double side) {
        return side * side;
    }
    
    public static double rectangleArea(double length, double width) {
        return length * width;
    }
    
    public static double triangleArea(double base, double height) {
        return (base * height) / 2;
    }
    
    public static double circleArea(double radius) {
        return (radius * radius) * Math.PI;
    }
    
    public static double trapezoidArea(double base1, double base2, double height) {
        return (base1 + base2) * height / 2;
    }
    
    public static double parallelogramArea(double base, double height) {
        return base * height;
    }
}