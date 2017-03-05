package io.github.apexhaptics.apexhapticsdisplay.datatypes;

import java.util.HashMap;

/**
 * Created by Jaden on 2017-02-15.
 */

public class MarkerPacket extends BluetoothDataPacket {
    public static final String packetString = "MLoc";
    public static final String headString = "HED";
    public Head head = null;

    public void addHead(float x, float y, float z, float angle) {
        head = new Head(x,y,z,angle);
    }
}
