package com.example.gameforfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class AboutActivity1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about1);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random1 = new Random();
                int igr = random1.nextInt(3);
                ImageView ruletka = findViewById(R.id.ruletka);
                switch (igr) {
                    case 1:
                        ruletka.animate().rotation(100);
                    case 2:
                        ruletka.animate().rotation(200);
                    case 3:
                        ruletka.animate().rotation(300);
                }
                Random random2 = new Random();
                int chislo = random2.nextInt(3);
                TextView text = findViewById(R.id.zadanie);
                switch (chislo) {
                    case 1:
                        text.setText("задание 1");
                        break;
                    case 2:
                        text.setText("задание 2");
                        break;
                    case 3:
                        text.setText("задание 3");
                        break;
                }


            }
        });
    }
}