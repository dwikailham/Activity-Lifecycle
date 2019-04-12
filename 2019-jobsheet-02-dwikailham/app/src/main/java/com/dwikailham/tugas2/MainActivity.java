package com.dwikailham.tugas2;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constrain_layout);
        TextView tx = (TextView)findViewById(R.id.txt1);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Montserrat-Black.otf");

        tx.setTypeface(custom_font);


        TextView txx = (TextView)findViewById(R.id.txt2);

        Typeface custom_fontt = Typeface.createFromAsset(getAssets(),  "fonts/Montserrat-Medium.otf");

        tx.setTypeface(custom_font);
    }


}
