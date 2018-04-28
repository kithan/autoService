package com.sohuott.tv.demo.service_a;

import android.util.Log;

import com.sohuott.tv.demo.lib.INotAutoService;

/**
 * ${DESC}
 *
 * @author pengbinghan
 *         created at 2018/4/28
 */
public class ANoAutoService implements INotAutoService {
    @Override
    public void start() {
        Log.e("ANoAutoService", "start: ");
    }
}
