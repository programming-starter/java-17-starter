package me.parker.sealedclasses;

public abstract sealed class Shape
        permits Circle, Rectangle, Square, WeirdShape {
}
