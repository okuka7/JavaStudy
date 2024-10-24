package collection.test;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class RectangleTest {
    public static void main(String[] args) {
        HashSet<Rectangle> rectangleSet = new HashSet<>();
        rectangleSet.add(new Rectangle(10,10));
        rectangleSet.add(new Rectangle(20,20));
        rectangleSet.add(new Rectangle(10,10)); //중복

        for (Rectangle rectangle : rectangleSet) {
            System.out.println(rectangle);
        }

    }
}
