package com.sohuott.tv.demo.service_b;

import android.util.Log;

import com.google.auto.service.AutoService;
import com.sohuott.tv.demo.lib.IService;

/**
 * ${DESC}
 *
 * @author pengbinghan
 *         created at 2018/4/28
 */
@AutoService(IService.class)
public class BService implements IService {
    @Override
    public void create() {
        Log.d("BService", "create: BService");
    }
}
