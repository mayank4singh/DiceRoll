package com.mayank.diceroll;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView btn,btn2;
    private TextView txt,txt2;
    private Button button;
    public Random myrandom = new Random();
    MediaPlayer m1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= findViewById(R.id.imageView);
        btn2=findViewById(R.id.imageView2);
        txt=findViewById(R.id.textView);
        txt2=findViewById(R.id.textView2);
        button=findViewById(R.id.button);
        m1 = MediaPlayer.create(this,R.raw.rolling);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1.start();
                int myRan = myrandom.nextInt(6)+1;
                int myRan2 = myrandom.nextInt(6)+1;
                switch (myRan){
                    case 1:
                        btn.setImageResource(R.drawable.dice_1);
                        txt.setText("One");
                        break;
                    case 2:
                        btn.setImageResource(R.drawable.dice_2);
                        txt.setText("Two");
                        break;
                    case 3:
                        btn.setImageResource(R.drawable.dice_3);
                        txt.setText("Three");
                        break;
                    case 4:
                        btn.setImageResource(R.drawable.dice_4);
                        txt.setText("Four");
                        break;
                    case 5:
                        btn.setImageResource(R.drawable.dice_5);
                        txt.setText("Five");
                        break;
                    case 6:
                        btn.setImageResource(R.drawable.dice_6);
                        txt.setText("Six");
                        break;
                }

                switch (myRan2) {
                    case 1:
                        btn2.setImageResource(R.drawable.dice_1);
                        txt2.setText("One");
                        break;
                    case 2:
                        btn2.setImageResource(R.drawable.dice_2);
                        txt2.setText("Two");
                        break;
                    case 3:
                        btn2.setImageResource(R.drawable.dice_3);
                        txt2.setText("Three");
                        break;
                    case 4:
                        btn2.setImageResource(R.drawable.dice_4);
                        txt2.setText("Four");
                        break;
                    case 5:
                        btn2.setImageResource(R.drawable.dice_5);
                        txt2.setText("Five");
                        break;
                    case 6:
                        btn2.setImageResource(R.drawable.dice_6);
                        txt2.setText("Six");
                        break;

                }



            }
        });
    }
}
