package Week3.Day11;

import java.util.Scanner;

abstract class Shape {
    float area;

    abstract void input();

    abstract void compute();

    void display() {
        System.out.println("Area is: " + area);
    }
}

class Triangle extends Shape {

    float base, height;

    @Override
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base of Triangle:");
        base = sc.nextFloat();
        System.out.println("Enter height of Triangle:");
        height = sc.nextFloat();
    }

    @Override
    void compute() {
        area = 0.5f * base * height;
    }
}

class Rectangle extends Shape {
    float length, breadth;

    @Override
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Rectangle:");
        length = sc.nextFloat();
        System.out.println("Enter breadth of Rectangle:");
        breadth = sc.nextFloat();
    }

    @Override
    void compute() {
        area = length * breadth;
    }
}

class Circle extends Shape {
    float radius;

    @Override
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of Circle:");
        radius = sc.nextFloat();
    }

    @Override
    void compute() {
        area = (float) (Math.PI) * radius * radius;
    }
}

class Geometry {
    void permit(Shape shape) {
        shape.input();
        shape.compute();
        shape.display();
    }
}

public class Tutorial1 {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        Geometry geometry = new Geometry();
        geometry.permit(triangle);
        geometry.permit(rectangle);
        geometry.permit(circle);
    }
}
