package io.github.apexhaptics.apexhapticsdisplay.datatypes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jaden on 2017-02-15.
 */

public class MarkerPacket extends BluetoothDataPacket {
    public static final String packetString = "MLoc";
    public static final String separator = "MKR";
    public static final String normalString = "MKR";
    private HashMap<Marker.MarkerType, Marker> markerMap = new HashMap<>();

    public void addMarker(Marker.MarkerType type, float x, float y, float z) {
        Marker marker = new Marker(x,y,z);
        markerMap.put(type, marker);
    }

    public void addMarker(Marker.MarkerType type, float x, float y, float z,
                          float normX, float normY, float normZ) {
        Marker marker = new Marker(x,y,z,normX,normY,normZ);
        markerMap.put(type, marker);
    }

    public Marker getMarker(Marker.MarkerType type) {
        return markerMap.get(type);
    }
}
