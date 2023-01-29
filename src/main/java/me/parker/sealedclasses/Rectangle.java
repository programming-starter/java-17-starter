package me.parker.sealedclasses;

public sealed class Rectangle extends Shape
        permits  TransparentRectangle, FilledRectangle {
}
