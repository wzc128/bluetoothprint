package com.sf.sf_hwd;

import android.bluetooth.BluetoothAdapter;

public class BlueToothUtil {


    public static boolean isBluetoothSupported() {
        return BluetoothAdapter.getDefaultAdapter() != null ? true : false;
    }


    public static boolean isBluetoothEnabled() {
        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.isEnabled();
        }
        return false;
    }


    public static boolean turnOnBluetooth() {
        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.enable();
        }
        return false;
    }
}
