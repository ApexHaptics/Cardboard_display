package io.github.apexhaptics.apexhapticsdisplay.datatypes;

import java.util.Date;

/**
 * Created by Jaden on 2017-02-15.
 */

public abstract class BluetoothDataPacket {
    public Date createDate;
    BluetoothDataPacket() {
        createDate = new Date();
    }
}
