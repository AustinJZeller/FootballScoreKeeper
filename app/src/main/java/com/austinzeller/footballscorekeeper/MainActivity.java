package com.austinzeller.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamB = 0;
    int scoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}

    //adds a 3 point score for team B
    public void addSevenForTeamB(View v) {

        scoreTeamB = scoreTeamB +7;
        displayForTeamB(scoreTeamB);

    }

    //adds a 2 point score for team B
    public void addThreeForTeamB(View v) {

        scoreTeamB = scoreTeamB +3;
        displayForTeamB(scoreTeamB);

    }

    //adds a 1 point score for team B
    public void addTwoForTeamB(View v) {

        scoreTeamB = scoreTeamB +2;
        displayForTeamB(scoreTeamB);

    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));


    }

    //-----------------------------------------------------

    public void addSevenForTeamA(View v) {

        scoreTeamA = scoreTeamA +7;
        displayForTeamA(scoreTeamA);

    }

    //adds a 2 point score for team B
    public void addThreeForTeamA(View v) {

        scoreTeamA = scoreTeamA +3;
        displayForTeamA(scoreTeamA);

    }

    //adds a 1 point score for team B
    public void addTwoForTeamA(View v) {

        scoreTeamA = scoreTeamA +2;
        displayForTeamA(scoreTeamA);

    }

    //Resets the score for both teams back to 0.
    public void resetScore(View v) {

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        scoreTeamA = 0;
        scoreTeamB = 0;

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));


    }
}
