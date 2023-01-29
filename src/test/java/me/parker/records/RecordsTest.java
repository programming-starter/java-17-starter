package me.parker.records;

import org.junit.jupiter.api.Test;

import java.util.List;

public class RecordsTest {

    @Test
    void old_style() {
        PointClass point1 = new PointClass(0, 0);
        PointClass point2 = new PointClass(1, 1);
        System.out.println("point1 = " + point1);
        System.out.println("point2 = " + point2);
        System.out.println("Point 1 equals point 2? " + point1.equals(point2));

        PointClass pointCopy = new PointClass(point1.getX(), point1.getY());
        System.out.println("Point 1 equals its copy? " + point1.equals(pointCopy));
    }

    @Test
    void new_style() {
        PointRecord point1 = new PointRecord(0, 0);
        PointRecord point2 = new PointRecord(1, 1);
        System.out.println("point1 = " + point1);
        System.out.println("point2 = " + point2);
        System.out.println("Point 1 equals point 2? " + point1.equals(point2));

        PointRecord pointCopy = new PointRecord(point1.x(), point1.y());
        System.out.println("Point 1 equals its copy? " + point1.equals(pointCopy));
    }

    @Test
    void record_validation_constructor() {
        Triangle triangle = new Triangle(
                new PointRecord(0, 0),
                new PointRecord(5, 5),
                new PointRecord(10, 0)
        );

        System.out.println("triangle = " + triangle);
    }

    @Test
    void local_record_point() {
        List<Integer> xList = List.of(0, 1, 2, 3, 5);
        List<Integer> yList = List.of(0, 1, 2, 3, 5);

        record Point(int x, int y) { }

        for (int i = 0; i < xList.size(); i++) {
            Point point = new Point(xList.get(i), yList.get(i));
            System.out.println("point = " + point);
        }
    }
}
