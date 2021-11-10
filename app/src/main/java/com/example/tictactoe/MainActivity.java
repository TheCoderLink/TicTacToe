package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //This is the 2D Array that will hold the values of the tic-tac-toe board
    int [][]gridArray = new int[3][3];
    int playerTurn = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void topLeftClick(View v)
    {
        gridArray[0][0] = 1;
    }//end function for the Button 1

    public void topMiddleClick(View v)
    {
        gridArray[0][1] = 1;
    }//end function for the Button 2

    public void topRightClick(View v)
    {
        gridArray[0][2] = 1;
    }//end function for the Button 3

    public void middleLeftClick(View v)
    {
        gridArray[0][0] = 1;
    }//end function for the Button 4

    public void middleMiddleClick(View v)
    {
        gridArray[0][0] = 1;
    }//end function for the Button 5

    public void middleRightClick(View v)
    {
        gridArray[0][0] = 1;
    }//end function for the Button 6

    public void bottomLeftClick(View v)
    {
        gridArray[0][0] = 1;
    }//end function for the Button 7

    public void bottomMiddleClick(View v)
    {
        gridArray[0][0] = 1;
    }//end function for the Button 8

    public void bottomRightClick(View v)
    {
        gridArray[0][0] = 1;
    }//end function for the Button 9
}