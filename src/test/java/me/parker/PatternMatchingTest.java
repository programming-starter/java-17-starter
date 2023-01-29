package me.parker;

import me.parker.records.PointClass;
import me.parker.records.PointRecord;
import org.junit.jupiter.api.Test;

public class PatternMatchingTest {

    @Test
    void old_style() {
        Object objectPoint = new PointClass(0, 0);
        if (objectPoint instanceof PointClass) {
            PointClass pointClass = (PointClass) objectPoint;
            System.out.println("x=" + pointClass.getX() + ", " + "y=" + pointClass.getY());
        }
    }

    @Test
    void new_style() {
        Object objectPoint = new PointClass(0, 0);
        if (objectPoint instanceof PointClass pointClass) {
            System.out.println("x=" + pointClass.getX() + ", " + "y=" + pointClass.getY());
        }
    }

    @Test
    void new_style_not_matched() {
        Object objectPoint = new PointRecord(0, 0);
        if (objectPoint instanceof PointClass pointClass) {
            System.out.println("x=" + pointClass.getX() + ", " + "y=" + pointClass.getY());
        }
    }

    @Test
    void new_style_local_variable() {
        Object objectPoint = new PointClass(0, 0);
        if (!(objectPoint instanceof PointClass pointClass)) {
            throw new IllegalStateException();
        }

        System.out.println("x=" + pointClass.getX() + ", " + "y=" + pointClass.getY());
    }
}
