package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = ((TextView) findViewById(R.id.text));

        // User can tap a button to change the text color of the label
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change the text color of the label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.black));
            }
        });
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.teal_200));
            }
        });
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setText("Android is awesome!");
            }
        });
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Hello from Brian!");
                textView.setTextColor(getResources().getColor(R.color.white));
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        });
    findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();
            if (userEnteredText.isEmpty()) {
                textView.setText("Enter your own text!");
            } else {
                textView.setText(userEnteredText);
            }
        }
    });

    }
}