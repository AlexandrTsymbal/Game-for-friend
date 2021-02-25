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

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button = findViewById(R.id.button);
        ImageView ruletka = findViewById(R.id.ruletka);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random1 = new Random();
                int igr = random1.nextInt(4);
                ImageView ruletka = findViewById(R.id.ruletka);
                switch (igr) {
                    case 1:
                        ruletka.animate().rotation(100);
                        break;
                    case 2:
                        ruletka.animate().rotation(200);
                        break;
                    case 3:
                        ruletka.animate().rotation(300);
                        break;
                }
                Random random2 = new Random();
                int chislo = random2.nextInt(4);
                chislo = (chislo +igr)/2;
                TextView text = findViewById(R.id.zadanie);
                switch (chislo) {
                    case 1:
                        text.setText("Сделай что-то");
                        break;
                    case 2:
                        text.setText("Салам алекум");
                        break;
                    case 3:
                        text.setText("пиривет");
                        break;
                }


            }
        });
    }
}