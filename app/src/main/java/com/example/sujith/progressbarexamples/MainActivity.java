package com.example.sujith.progressbarexamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.loadingview.LoadingView;



public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //https://android-arsenal.com/details/1/7424

        LoadingView dialog=(LoadingView) findViewById(R.id.loadingView);
        button=(Button)findViewById(R.id.topage2);

        dialog.start();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(getApplicationContext(),Page2.class);
                startActivity(intent);

            }
        });

    }
}
