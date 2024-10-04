package lang.object.test;

import java.util.Objects;

public class rect {
    private int width;
    private int height;

    public rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        rect rect = (rect) o;
        return width == rect.width && height == rect.height;
    }

    @Override
    public String toString() {
        return "rect{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
