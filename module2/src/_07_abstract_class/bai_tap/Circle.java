package _07_abstract_class.bai_tap;

import _06_inheritance.thuc_hanh.Shape;

    public class Circle extends Shape implements Resizeable{
        public double radius = 1.0;

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle() {
        }

        ;

        public Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public void resize(double percent) {

        }
    }
