package io.github.apexhaptics.apexhapticsdisplay.utilities;

import static android.R.attr.x;
import static android.R.attr.y;
import static android.view.View.X;

/**
 * Created by Jaden on 2017-01-31.
 */

public class Joint {
    private float X;
    private float Y;
    private float Z;

    public Joint() {
        synchronized (this) {
            X=0;
            Y=0;
            Z=0;
        }
    }
    public Joint(float x, float y, float z) {
        setCoords(x,y,z);
    }

    // Setters
    public void setCoords(float x, float y, float z) {
        synchronized (this) {
            X=x;
            Y=y;
            Z=z;
        }
    }
    public void setX(float x) {
        synchronized (this) {
            X=x;
        }
    }
    public void setY(float y) {
        synchronized (this) {
            Y=y;
        }
    }
    public void setZ(float z) {
        synchronized (this) {
            Z=z;
        }
    }

    // Getters
    // Gets a float array {x,y,z}
    public float[] getCoordArray() {
        synchronized (this) {
            return new float[] { X, Y, Z };
        }
    }
    public float getX() {
        synchronized (this) {
            return X;
        }
    }
    public float getY() {
        synchronized (this) {
            return Y;
        }
    }
    public float getZ() {
        synchronized (this) {
            return Z;
        }
    }
}
