package com.innovitics.app.instabugproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.instabug.library.Instabug;
import com.instabug.library.invocation.InstabugInvocationEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Instabug bugSquad = new Instabug.Builder(this.getApplication(), "b8a856e6363c8dc815ed0902e0cbc024")
                .setInvocationEvents(InstabugInvocationEvent.SHAKE, InstabugInvocationEvent.SCREENSHOT)
                .build();
        bugSquad.setDebugEnabled(true);
    }
}
