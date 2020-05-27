package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<Shape>();
        Shape rectangle = new Rectangle(5, 6);
        Shape rectTriangle = new RectTriangle(6, 2);
        shapeList.add(rectangle);
        shapeList.add(rectTriangle);

        for(int i = 0; i < shapeList.size(); i++) {

            System.out.println("area: " + shapeList.get(i).getArea());
            System.out.println("perimeter: " + shapeList.get(i).getPerimeter());

            if(shapeList.get(i) instanceof Resizeable) {
                ((Resizeable) shapeList.get(i)).resize(0.5);
                System.out.println("new area: " + shapeList.get(i).getArea());
                System.out.println("new perimeter: " + shapeList.get(i).getPerimeter());
            }
        }
    }
}
