package com.example.android.huskerscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

import com.example.android.huskerscore.R;

public class MainActivity extends AppCompatActivity {
    //tracks score for team A
    int scoreHuskers = 0;
    //tracks score for team B
    int scoreVisitors = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Displays the given score for Huskers.
     */
    public void displayForHuskers(int score) {
        TextView scoreView = (TextView) findViewById(R.id.husker_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Visitors.
     */
    public void displayForVisitor(int score) {
        TextView scoreView = (TextView) findViewById(R.id.visitor_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * TEAM  ***************Huskers*******************!
     * Method that is called when Touchdown is clicked for Huskers
     */
    public void touchdownH(View v) {
        scoreHuskers = scoreHuskers + 6;
        displayForHuskers(scoreHuskers);
    }

    /**
     * Method that is called when Field Goal is clicked for Huskers
     */
    public void fieldGoalH(View v) {
        scoreHuskers = scoreHuskers + 3;
        displayForHuskers(scoreHuskers);
    }
    /**
     * Method that is called when Two Point Conversion/Safety is clicked for Huskers
     */
    public void twoPointConversionSafetyH(View v) {
        scoreHuskers = scoreHuskers + 2;
        displayForHuskers(scoreHuskers);
    }

    /**
     * Method that is called when Extra Point is clicked for Huskers.
     */
    public void extraPointH(View v){
        scoreHuskers = scoreHuskers + 1;
        displayForHuskers(scoreHuskers);
    }
    /**
     * TEAM  *******************VISITOR******************************!
     * Method that is called when Touchdown is clicked for Visitor
     */
    public void touchdownV(View v) {
        scoreVisitors = scoreVisitors + 6;
        displayForVisitor(scoreVisitors);
    }

    /**
     * Method that is called when Field Goal is clicked for Visitor
     */
    public void fieldGoalV(View v) {
        scoreVisitors = scoreVisitors + 3;
        displayForVisitor(scoreVisitors);
    }
    /**
     * Method that is called when Two Point Conversion/Safety is clicked for Visitor
     */
    public void twoPointConversionSafetyV(View v) {
        scoreVisitors = scoreVisitors + 2;
        displayForVisitor(scoreVisitors);
    }

    /**
     * Method that is called when Extra Point is clicked for Visitor.
     */
    public void extraPointV(View v){
        scoreVisitors = scoreVisitors + 1;
        displayForVisitor(scoreVisitors);
    }
    /**
     * Method that is called to reset scores to 0.
     */
    public void resetToZero(View v){
        scoreHuskers = 0;
        scoreVisitors = 0;
        displayForHuskers(scoreHuskers);
        displayForVisitor(scoreVisitors);
    }
}
