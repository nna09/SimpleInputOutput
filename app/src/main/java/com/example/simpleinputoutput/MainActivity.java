package com.example.simpleinputoutput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private EditText showEditText;
    private Button showButton;
    private TextView showText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showEditText = (EditText)findViewById(R.id.editText1);
        showButton = (Button)findViewById(R.id.button1);
        showText = (TextView) findViewById(R.id.textView1);

        //showButton.setOnClickListener(this);
    }

    public void ABCD(View v) {
        String str = showEditText.getText().toString();
        showText.setText(str);

    }

    //@Override
    /*public void onClick(View v) {
        String str = showEditText.getText().toString();
        showText.setText(str);
    }*/
}
