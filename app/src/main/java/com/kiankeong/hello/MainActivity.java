package com.kiankeong.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView textViewMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate() = main() function
        super.onCreate(savedInstanceState);
        //super is  call super class
        //Display UI
        //R = respurce
        //layout = folder
        setContentView(R.layout.activity_main);

       // TextView textViewMsg; //textField = class, textViewMSG = instance
        //Link UI to program
        textViewMsg = findViewById(R.id.textViewMessage);
        //textViewMsg.setText("Hello, <Lee Kian Keong>");

    }

    public void showMessage(View view){
    textViewMsg.setText("Hello, Lee Kian Keong");
    }

    public void clearMessage(View view){
        textViewMsg.clearComposingText();
    }
}
