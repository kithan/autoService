package com.sohuott.tv.demo.service_b;

import android.util.Log;

import com.sohuott.tv.demo.lib.INotAutoService;

/**
 * ${DESC}
 *
 * @author pengbinghan
 *         created at 2018/4/28
 */
public class BNoAutoService implements INotAutoService {
    @Override
    public void start() {
        Log.e("BNoAutoService", "start: ");
    }
}
