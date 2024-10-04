package lang.object.test;

import java.awt.*;

public class RectangleMain {
    public static void main(String[] args) {
        rect rect1 = new rect(100,20);
        rect rect2 = new rect(100,20);
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect1 == rect2);
        System.out.println(rect1.equals(rect2));
    }
}
