package com.sohuott.tv.demo.service_a;

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
public class AService implements IService {
    @Override
    public void create() {
        Log.d("AService", "create: AService");
    }
}
