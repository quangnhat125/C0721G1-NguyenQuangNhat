package _06_inheritance.bai_tap;

import java.awt.*;
import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D(){}
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float[] getXYZ(){
        float[] Array = new float[3];
        Array[0] = x;
        Array[1] = y;
        Array[2] = z;
        return Array;
    }

    @Override
    public String toString() {
        return "Point3D has information is: " + Arrays.toString(getXYZ()) + ", which is a subclass of " + super.toString();
    }
}
