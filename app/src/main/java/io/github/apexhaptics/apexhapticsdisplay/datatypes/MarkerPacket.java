package io.github.apexhaptics.apexhapticsdisplay.datatypes;

import static android.R.attr.angle;

/**
 * Created by Jaden on 2017-02-15.
 */

public class MarkerPacket extends BluetoothDataPacket {
    public static final String packetString = "MLoc";
    public static final String headString = "HED";
    public static final String eefString = "EEF";
    public MarkerHead markerHead = null;
    public MarkerEndEffector markerEndEffector = null;

    public void addHead(float x, float y, float z, float angle) {
        markerHead = new MarkerHead(x,y,z,angle);
    }

    public void addEndEffector(float x, float y, float z) {
        markerEndEffector = new MarkerEndEffector(x,y,z);
    }
}
