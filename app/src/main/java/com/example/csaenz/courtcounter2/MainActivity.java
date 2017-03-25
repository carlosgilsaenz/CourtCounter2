package com.example.csaenz.courtcounter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointsTeamA = 0;
    int pointsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayTeamA(pointsTeamA);
    }

    public void displayTeamA(int score){
        TextView teamA = (TextView) findViewById(R.id.team_a_score);
        teamA.setText("" + score);
    }

    public void threePointsTeamA (View view){
        pointsTeamA += 3;
        displayTeamA(pointsTeamA);
    }

    public void twoPointsTeamA (View view){
        pointsTeamA += 2;
        displayTeamA(pointsTeamA);
    }

    public void freePointsTeamA (View view){
        pointsTeamA++;
        displayTeamA(pointsTeamA);
    }

    public void displayTeamB(int score){
        TextView teamB = (TextView) findViewById(R.id.team_b_score);
        teamB.setText("" + score);
    }

    public void threePointsTeamB (View view){
        pointsTeamB += 3;
        displayTeamB(pointsTeamB);
    }

    public void twoPointsTeamB (View view){
        pointsTeamB += 2;
        displayTeamB(pointsTeamB);
    }

    public void freePointsTeamB (View view){
        pointsTeamB++;
        displayTeamB(pointsTeamB);
    }

    public void resetScores(View view){
        pointsTeamA = 0;
        pointsTeamB = 0;
        displayTeamA(pointsTeamA);
        displayTeamB(pointsTeamB);
    }
}
