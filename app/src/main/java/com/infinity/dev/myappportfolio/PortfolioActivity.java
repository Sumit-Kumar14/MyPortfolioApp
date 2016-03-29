package com.infinity.dev.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PortfolioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

    public void click(View view){
        switch(view.getId()){
            case R.id.project1:
                Toast.makeText(this, "This button will launch my Spotify Streamer app!", Toast.LENGTH_LONG).show();
                break;
            case R.id.project2:
                Toast.makeText(this, "This button will launch my Football Scores app!", Toast.LENGTH_LONG).show();
                break;
            case R.id.project3:
                Toast.makeText(this, "This button will launch my Library app!", Toast.LENGTH_LONG).show();
                break;
            case R.id.project4:
                Toast.makeText(this, "This button will launch my Build It Bigger app!", Toast.LENGTH_LONG).show();
                break;
            case R.id.project5:
                Toast.makeText(this, "This button will launch my XYZ Reader app!", Toast.LENGTH_LONG).show();
                break;
            case R.id.project6:
                Toast.makeText(this, "This button will launch my Capstone app!", Toast.LENGTH_LONG).show();
        }
    }
}
