package me.parker;

import me.parker.records.PointClass;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class NullPointerExceptionTest {

    @Test
    void throw_NullPointerException() {
        Map<String, PointClass> points = new HashMap<>();
        points.put("p1", new PointClass(0, 0));
        points.put("p2", new PointClass(1, 1));
        points.put("p3", null);  // 강제 NullPointerException 만들기

        for (Map.Entry<String, PointClass> entry : points.entrySet()) {
            System.out.println(entry.getKey() + ": " + "x=" + entry.getValue().getX() + "y=" + entry.getValue().getY());
        }
    }
}
