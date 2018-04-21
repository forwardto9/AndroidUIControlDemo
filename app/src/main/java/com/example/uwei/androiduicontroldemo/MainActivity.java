package com.example.uwei.androiduicontroldemo;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button myButton = findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int width = myButton.getWidth();
                int height = myButton.getHeight();
                int x = myButton.getLeft();
                int y = myButton.getTop();

                String frameString = (new Integer(x)).toString() + (new Integer(y)).toString() + (new Integer(width)).toString() + (new Integer(height)).toString() ;

                Toast alert = Toast.makeText(getApplicationContext(),frameString ,Toast.LENGTH_SHORT);
                alert.show();
            }
        });



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void sendFromXML(View v) {
        Toast alert = Toast.makeText(getApplicationContext(),"sendFromXML",Toast.LENGTH_SHORT);
        alert.show();
    }

    public void sendFromXMLFile(View v) {
        Toast alert = Toast.makeText(getApplicationContext(),"sendFromXMLFile",Toast.LENGTH_SHORT);
        alert.show();

    }

}
