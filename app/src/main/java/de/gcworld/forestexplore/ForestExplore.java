package de.gcworld.forestexplore;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

public class ForestExplore extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
