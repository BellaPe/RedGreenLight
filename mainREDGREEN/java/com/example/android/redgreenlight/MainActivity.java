package com.example.android.redgreenlight;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources resources = getResources();
        Button butt = (Button) findViewById(R.id.butt);
        butt.setText("Change Light");
        Button butt2 = (Button) findViewById(R.id.butt2);
        butt2.setText("Set to automatic");
        Button butt3 = (Button) findViewById(R.id.butt3);
        butt3.setText("I liked this background so much, can I set this as my wallpaper?");
        TextView t1 = (TextView) findViewById(R.id.t1);
        t1.setBackgroundResource(R.drawable.circleredob);
        TextView t2 = (TextView) findViewById(R.id.t2);
        t2.setBackgroundResource(R.drawable.circle_red);
        TextView t3 = (TextView) findViewById(R.id.t3);
        t3.setBackgroundResource(R.drawable.circlegreenon);
        TextView t4 = (TextView) findViewById(R.id.t4);
        t4.setBackgroundResource(R.drawable.circle);


    }
    public void onClickButt(View view) {
        Resources resources = getResources();
        TextView t1 = (TextView) findViewById(R.id.t1);
        TextView t2 = (TextView) findViewById(R.id.t2);
        TextView t3 = (TextView) findViewById(R.id.t3);
        TextView t4 = (TextView) findViewById(R.id.t4);
        if (counter % 2 == 0) {
            t1.setBackgroundResource(R.drawable.circle_red);
            t2.setBackgroundResource(R.drawable.circleredob);
            t3.setBackgroundResource(R.drawable.circle);
            t4.setBackgroundResource(R.drawable.circlegreenon);
        } else {
            t1.setBackgroundResource(R.drawable.circleredob);
            t2.setBackgroundResource(R.drawable.circle_red);
            t3.setBackgroundResource(R.drawable.circlegreenon);
            t4.setBackgroundResource(R.drawable.circle);
        }
        counter++;
    }

    public void onClickButt2(View view) {
        TextView t1 = (TextView) findViewById(R.id.t1);
        try {
            WallpaperChanger.changeWallpaper();
        }
        catch (Exception ex) {
            t1.setText("something happend");
        }
    }

    public void onClickButt3(View view) {
        TextView t1 = (TextView) findViewById(R.id.t1);
        try {
            WallpaperChanger.changeWallpaper();
        }
        catch (Exception ex) {
            t1.setText("something happend");
        }
    }
}

