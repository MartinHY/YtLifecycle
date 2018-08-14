package com.yingt.lifecycle;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import yingt.core.base.lifecycle.Lifecycle;
import yingt.core.base.lifecycle.YtLifecycle;
import yingt.core.base.lifecycle.YtLifecycleObserver;
import yingt.core.base.lifecycle.YtLifecycleOwner;

public class MainActivity extends AppCompatActivity implements YtLifecycleOwner{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getYtLifecycle().addObserver(new YtLifecycleObserver() {
            public static final String TAG = "YtLifecycle";
            @Override
            protected void onCreat() {
                Log.d(TAG , "onCreat1");
            }

            @Override
            protected void onResume() {
                Log.d(TAG , "onResume1");
            }

            @Override
            protected void onPause() {
                Log.d(TAG , "onPause1");
            }

            @Override
            protected void onDestory() {
                Log.d(TAG , "onDestory1");
            }
        });

        getYtLifecycle().addObserver(new YtLifecycleObserver() {
            public static final String TAG = "YtLifecycle";
            @Override
            protected void onCreat() {
                Log.d(TAG , "onCreat2");
            }

            @Override
            protected void onResume() {
                Log.d(TAG , "onResume2");
            }

            @Override
            protected void onPause() {
                Log.d(TAG , "onPause2");
            }

            @Override
            protected void onDestory() {
                Log.d(TAG , "onDestory2");
            }
        });
        getYtLifecycle().onNext(Lifecycle.ON_CREATE);
    }

    @Override
    protected void onPause() {
        super.onPause();
        getYtLifecycle().onNext(Lifecycle.ON_PAUSE);
    }

    @Override
    protected void onResume() {
        super.onResume();
        getYtLifecycle().onNext(Lifecycle.ON_RESUME);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getYtLifecycle().onNext(Lifecycle.ON_DESTROY);
    }

    private YtLifecycle ytLifecycle = new YtLifecycle();

    @NonNull
    @Override
    public YtLifecycle getYtLifecycle() {
        return ytLifecycle;
    }
}
