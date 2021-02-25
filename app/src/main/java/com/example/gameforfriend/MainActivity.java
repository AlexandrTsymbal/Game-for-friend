package com.example.gameforfriend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gameforfriend.AboutActivity1;
import com.example.gameforfriend.R;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup rg = findViewById(R.id.radioGroup);
        TextView how = findViewById(R.id.zadanie);
        RadioButton one = findViewById(R.id.one);
        one.setOnClickListener(radioButtonClickListener);
        RadioButton one2 = findViewById(R.id.one2);
        one2.setOnClickListener(radioButtonClickListener);
        RadioButton one3 = findViewById(R.id.one3);
        one3.setOnClickListener(radioButtonClickListener);
        RadioButton one4 = findViewById(R.id.one4);
        one4.setOnClickListener(radioButtonClickListener);
        RadioButton one5 = findViewById(R.id.one5);
        one5.setOnClickListener(radioButtonClickListener);

    }
    public void PEREHOD1(View v) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
    View.OnClickListener radioButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RadioButton rb = (RadioButton)v;
            switch (rb.getId()) {
                case R.id.one: PEREHOD1(v) ;
                    break;
                case R.id.one2:
                    break;
                case R.id.one3: ;
                    break;
                case R.id.one4: ;
                    break;

                default:
                    break;
            }
        }
    };

}