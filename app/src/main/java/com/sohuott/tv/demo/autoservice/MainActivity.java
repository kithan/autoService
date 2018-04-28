package com.sohuott.tv.demo.autoservice;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.sohuott.tv.demo.lib.INotAutoService;
import com.sohuott.tv.demo.lib.IService;

import java.util.ServiceLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        ServiceLoader<IService> serviceLoader=ServiceLoader.load(IService.class);
        for(IService service:serviceLoader){
            Log.e("MainActivity", "onCreate: "+service.getClass().getSimpleName());
            service.create();
        }
        ServiceLoader<INotAutoService>serviceLoader1=ServiceLoader.load(INotAutoService.class);

        for(INotAutoService service:serviceLoader1){
            Log.e("MainActivity", "onCreate: "+service.getClass().getSimpleName());
            service.start();
        }
    }
}
