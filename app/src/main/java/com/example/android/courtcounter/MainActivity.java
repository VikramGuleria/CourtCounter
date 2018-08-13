package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void points(View view) {
        if(scoreTeamA>=30){
            Toast.makeText(this ,"Game Over & WINNER IS TEAM-A ", Toast.LENGTH_SHORT).show();
            return;
        }

        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);

    }
    public void point(View view) {
        if(scoreTeamA>=30){
        Toast.makeText(this ,"Game Over & WINNER IS TEAM-A ", Toast.LENGTH_SHORT).show();
        return;
    }

        scoreTeamA= scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }
    public void freeThrow(View score){
        if(scoreTeamA>=30){
            Toast.makeText(this ,"Game Over & WINNER IS TEAM-A ", Toast.LENGTH_SHORT).show();
            return;
        }

        scoreTeamA= scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }
    public void bpoints(View view) {
        if(scoreTeamB>=30){
            Toast.makeText(this ,"Game Over & WINNER IS TEAM-B ", Toast.LENGTH_SHORT).show();
            return;
        }

        scoreTeamB= scoreTeamB+3;
        displayForTeamB(scoreTeamB);

    }
    public void bpoint(View view) {
        if(scoreTeamB>=30){
            Toast.makeText(this ,"Game Over & WINNER IS TEAM-B ", Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamB= scoreTeamB+2;
        displayForTeamB(scoreTeamB);


    }
    public void bfreeThrow(View score){
        if(scoreTeamB>=30){
            Toast.makeText(this ,"Game Over & WINNER IS TEAM-A ", Toast.LENGTH_SHORT).show();
            return;
        }

        scoreTeamB= scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }
    public void reset(View view){
        scoreTeamB= 0;
        displayForTeamB(scoreTeamB);
        scoreTeamA= 0;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *
     * DISPLAY the given score for team B
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
