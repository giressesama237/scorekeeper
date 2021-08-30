package com.orange.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mScore1 = 0;
    private int mScore2 = 0;
    TextView mScoreText1;
    TextView mScoreText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScoreText1 = findViewById(R.id.score1);
        mScoreText2 = findViewById(R.id.score2);
    }

    public void decreaseScore(View view) {
     int   id = view.getId();
     switch (id){
         case R.id.decreaseTeam1:
             if (mScore1>0){
                 mScore1--;
                 mScoreText1.setText(String.valueOf(mScore1));
             }

             break;
         case R.id.decreaseTeam2:
             if (mScore2>0){
                 mScore2--;
                 mScoreText2.setText(String.valueOf(mScore2));
             }
             break;
     }
    }
    public void increaseScore(View view) {
        int   id = view.getId();
        switch (id){
            case R.id.increaseTeam1:
                mScore1++;
                mScoreText1.setText(String.valueOf(mScore1));
                break;
            case R.id.increaseTeam2:
                mScore2++;
                mScoreText2.setText(String.valueOf(mScore2));
                break;
        }
    }
}