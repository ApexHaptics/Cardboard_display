package io.github.apexhaptics.apexhapticsdisplay.datatypes;

import static android.R.attr.x;
import static android.R.attr.y;

/**
 * Created by Jaden on 2017-02-15.
 */

public class Marker {
    /**
     * This enum deals with the types of each marker.
     * The ordinal is the OpenCV value
     */
    public enum MarkerType
    {
        // TODO: ADD markers as they're added in C#
        hammer,         // 0
    }

    public float X;
    public float Y;
    public float Z;
    public float normX;
    public float normY;
    public float normZ;

    public Marker(float x, float y, float z) {
        X=x;
        Y=y;
        Z=z;
    }

    public Marker(float x, float y, float z, float normX, float normY, float normZ) {
        X=x;
        Y=y;
        Z=z;
        this.normX=normX;
        this.normY=normY;
        this.normZ=normZ;
    }
}
