package com.example.android.americanfootballscorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int team_a_score = 0;
    int team_b_score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById (R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the score for Team A by 6 points.
     */
    public void addSixForTeamA(View view){
        team_a_score = team_a_score + 6;
        displayForTeamA(team_a_score);
    }
    /**
     * Increase the score for Team B by 6 points.
     */
    public void addSixForTeamB(View view){
        team_b_score = team_b_score + 6;
        displayForTeamB(team_b_score);
    }
    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View view){
        team_a_score = team_a_score + 3;
        displayForTeamA(team_a_score);
    }
    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB(View view){
        team_b_score = team_b_score + 3;
        displayForTeamB(team_b_score);
    }
    /**
     * Increase the score for Team A by 2 points.
     */
    public void addExtraTwoForTeamA(View view){
        team_a_score = team_a_score + 2;
        displayForTeamA(team_a_score);
    }
    /**
     * Increase the score for Team B by 2 points.
     */
    public void addExtraTwoForTeamB(View view){
        team_b_score = team_b_score + 2;
        displayForTeamB(team_b_score);
    }
    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View view){
        team_a_score = team_a_score + 2;
        displayForTeamA(team_a_score);
    }
    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View view){
        team_b_score = team_b_score + 2;
        displayForTeamB(team_b_score);
    }

    /**
     * Foul score for Team A by 0 points.
     */
    public void addZeroForTeamA(View view){
        team_a_score = team_a_score + 0;
        displayForTeamA(team_a_score);
    }


    /**
     * Foul score for Team B by 0 points.
     */
    public void addZeroForTeamB(View view){
        team_b_score = team_b_score + 0;
        displayForTeamB(team_b_score);
    }
    /**
     * Reset the scores for both teams to 0 point.
     */
    public void Reset(View view){
        team_a_score = 0;
        team_b_score = 0;
        displayForTeamA(team_a_score);
        displayForTeamB(team_b_score);
    }
}


