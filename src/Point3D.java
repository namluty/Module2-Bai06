import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;
    private float b[];

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

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

    public float[] getXYZ() {
        b[0] = super.getX();
        b[1] = super.getY();
        b[2] = z;
        return b;
    }

    @Override
    public String toString() {
        return "Point3D" + '{' + "x=" + this.getX() +
                ", y=" + this.getY() + " " +
                ", z=" + z + " " +
                '}';
    }
}


