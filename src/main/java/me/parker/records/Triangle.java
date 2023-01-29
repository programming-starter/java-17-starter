package me.parker.records;

public record Triangle(PointRecord p1, PointRecord p2, PointRecord p3) {

    public Triangle {
        System.out.println("Parameter p1=" + p1 + ", Field p1=" + this.p1());
        System.out.println("Parameter p2=" + p2 + ", Field p2=" + this.p2());
        System.out.println("Parameter p3=" + p3 + ", Field p3=" + this.p3());
    }
}
