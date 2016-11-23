package com.example.admin.boundservice;

import android.app.Service;
import android.bluetooth.BluetoothClass;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

import java.util.Date;
import java.util.Locale;

/**
 * Created by Admin on 23-11-2016.
 */
public class BoundService extends Service {
    private final IBinder myBinder = new MyLocalBinder();
    public BoundService() {
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return myBinder;
    }
    public String getCurrentTime() {
        SimpleDateFormat dateformat = new SimpleDateFormat("HH:mm:ss MM/dd/yyyy", Locale.US);
        return (dateformat.format(new Date()));
    }
    public class MyLocalBinder extends Binder {
        BoundService getService() {
            return BoundService.this;
        }
}}
