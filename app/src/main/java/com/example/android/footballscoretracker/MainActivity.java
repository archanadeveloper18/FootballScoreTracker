package com.example.android.footballscoretracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //** global vrabile is define for Team 1 and its initialized value is 0 **//
        int scoreTeam1 = 0;
    //** global vrabile is define for Team 2 and its initialized value is 0 **//
        int scoreTeam2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //** Its increase the score of team 1 by 6 points **//
    public void addSixForTeam1(View v){
        scoreTeam1 = scoreTeam1 + 6;
        displayForTeam1(scoreTeam1);
    }

    //** Its increase the score of team 1 by 3 points **//
    public void addThreeForTeam1(View v){
        scoreTeam1 = scoreTeam1 + 3;
        displayForTeam1(scoreTeam1);
    }

    //** Its increase the score of team 1 by 2 points **//
    public void addTwoForTeam1(View v){
        scoreTeam1 = scoreTeam1 + 2;
        displayForTeam1(scoreTeam1);
    }

    //** Its increase the score of team 1 again by 2 points **//
    public void addAgainTwoForTeam1(View v){
        scoreTeam1 = scoreTeam1 + 2;
        displayForTeam1(scoreTeam1);
    }

    //** Its increase the score of team 1 by 1 points **//
    public void addOneForTeam1(View v){
        scoreTeam1 = scoreTeam1 + 1;
        displayForTeam1(scoreTeam1);
    }

    //** Its increase the score of team 2 by 6 points **//
    public void addSixForTeam2(View v){
        scoreTeam2 = scoreTeam2 + 6;
        displayForTeam2(scoreTeam2);
    }

    //** Its increase the score of team 2 by 3 points **//
    public void addThreeForTeam2(View v){
        scoreTeam2 = scoreTeam2 + 3;
        displayForTeam2(scoreTeam2);
    }

    //** Its increase the score of team 2 by 2 points **//
    public void addTwoForTeam2(View v){
        scoreTeam2 = scoreTeam2 + 2;
        displayForTeam2(scoreTeam2);
    }

    //** Its increase the score of team 2 again by 2 points **//
    public void addAgainTwoForTeam2(View v){
        scoreTeam2 = scoreTeam2 + 2;
        displayForTeam2(scoreTeam2);
    }

    //** Its increase the score of team 2 by 1 points **//
    public void addOneForTeam2(View v){
        scoreTeam2 = scoreTeam2 + 1;
        displayForTeam2(scoreTeam2);
    }

//** Its reset the score of both teams to 0 **//
    public void resetScore(View v) {
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        displayForTeam1(scoreTeam1);
        displayForTeam2(scoreTeam2);

    }
    //** Display the given score for Team 1 **//
    public void displayForTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team1_score);
        scoreView.setText(String.valueOf(score));
    }

    //** Display the given score for Team 2 **//
    public void displayForTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team2_score);
        scoreView.setText(String.valueOf(score));
    }
}
