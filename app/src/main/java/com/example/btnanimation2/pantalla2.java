package com.example.btnanimation2;

import android.app.ActionBar;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class pantalla2 extends AppCompatActivity {
    private Button btn;
    private ImageView tv;
    private ImageView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        View decorView2 = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView2.setSystemUiVisibility(uiOptions);

        View decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener
                (new View.OnSystemUiVisibilityChangeListener() {
                    @Override
                    public void onSystemUiVisibilityChange(int visibility) {
                        // Note that system bars will only be "visible" if none of the
                        // LOW_PROFILE, HIDE_NAVIGATION, or FULLSCREEN flags are set.
                        if ((visibility & View.SYSTEM_UI_FLAG_FULLSCREEN) == 0) {
                            // TODO: The system bars are visible. Make any desired
                            // adjustments to your UI, such as showing the action bar or
                            // other navigational controls.
                            View decorView3 = getWindow().getDecorView();
                            int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
                            decorView3.setSystemUiVisibility(uiOptions);
                        } else {
                            // TODO: The system bars are NOT visible. Make any desired
                            // adjustments to your UI, such as hiding the action bar or
                            // other navigational controls.


                        }
                    }
                });

        btn = (Button)findViewById(R.id.button);
        tv =(ImageView)findViewById(R.id.tv);
        tv2 =(ImageView)findViewById(R.id.tv2);
       // tv = (TextView) findViewById(R.id.tv);

        Animation scalacion = AnimationUtils.loadAnimation(this,R.anim.escalacion);
        //scalacion.setFillAfter(true);
        scalacion.setFillBefore(true);
        scalacion.setRepeatMode(Animation.REVERSE);
        scalacion.setRepeatCount(20);

        Animation rotacion = AnimationUtils.loadAnimation(this,R.anim.rotacion);
        rotacion.setFillAfter(true);
        //rotacion.setFillBefore(true);
        rotacion.setRepeatMode(Animation.REVERSE);
        rotacion.setRepeatCount(20);

        btn.startAnimation(rotacion);
        tv.startAnimation(scalacion);
        tv2.startAnimation(scalacion);

    }
}
