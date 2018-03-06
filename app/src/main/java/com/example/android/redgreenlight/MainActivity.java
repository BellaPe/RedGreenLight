package com.example.android.redgreenlight;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources resources = getResources();
        Button butt = (Button) findViewById(R.id.butt); butt.setText("Change Light");
        final TextView t1 = (TextView)findViewById(R.id.t1); t1.setBackgroundResource(R.drawable.circleredob);
        TextView t2 = (TextView)findViewById(R.id.t2); t2.setBackgroundResource(R.drawable.circle_red);
        TextView t3 = (TextView)findViewById(R.id.t3); t3.setBackgroundResource(R.drawable.circle);
        TextView t4 = (TextView)findViewById(R.id.t4);t4.setBackgroundResource(R.drawable.circlegreenon);




    }
    public void onClickButt(View view){
        Resources resources = getResources();
        if(counter%2==0)
            t1.setBackgroundResource(R.drawable.circleredob);
        t2.setBackgroundResource(R.drawable.circle_red);
        t3.setBackgroundResource(R.drawable.circle);
        t4.setBackgroundResource(R.drawable.circlegreenon);
    }

}
