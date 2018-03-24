//loading screen

package com.threestones.musicplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by PC on 2018-03-24.
 */

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}

//* https://blog.naver.com/hg1286/220528368750