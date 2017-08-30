package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int mIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIndex = 1;

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkPath(true);
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkPath(false);
            }
        });
        loadT1();

    }

    private void checkPath(boolean topButton) {
        if(mIndex == 1) {
            if (topButton == true) {
                loadT3();
            } else {
                loadT2();
            }
        } else if(mIndex == 2) {
            if(topButton == true) {
                loadT3();
            } else {
                endT4();
            }
        } else if(mIndex == 3) {
            if(topButton == true) {
                endT6();
            } else {
                endT5();
            }
        }
    }

    private void loadT3() {
        mIndex = 3;
        mStoryTextView.setText(R.string.T3_Story);
        mButtonTop.setText(R.string.T3_Ans1);
        mButtonBottom.setText(R.string.T3_Ans2);
    }

    private void loadT2() {
        mIndex = 2;
        mStoryTextView.setText(R.string.T2_Story);
        mButtonTop.setText(R.string.T2_Ans1);
        mButtonBottom.setText(R.string.T2_Ans2);
    }

    private void loadT1() {
        mIndex = 1;
        mStoryTextView.setText(R.string.T1_Story);
        mButtonTop.setText(R.string.T1_Ans1);
        mButtonBottom.setText(R.string.T1_Ans2);
        mButtonTop.setVisibility(View.VISIBLE);
        mButtonBottom.setVisibility(View.VISIBLE);
    }

    private void endT4() {
        mStoryTextView.setText(R.string.T4_End);
        mButtonTop.setVisibility(View.INVISIBLE);
        mButtonBottom.setVisibility(View.INVISIBLE);

    }
    private void endT5() {
        mStoryTextView.setText(R.string.T5_End);
        mButtonTop.setVisibility(View.INVISIBLE);
        mButtonBottom.setVisibility(View.INVISIBLE);
    }

    private void endT6() {
        mStoryTextView.setText(R.string.T6_End);
        mButtonTop.setVisibility(View.INVISIBLE);
        mButtonBottom.setVisibility(View.INVISIBLE);
    }
}
