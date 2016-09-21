package com.tatsme.afb.myandroidfinalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainMenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void clickBoiledEggs (View view) {
        Intent intent = new Intent(this, BoiledEggs.class);
        this.startActivity(intent);
    }

    public void clickPoachedEggs (View view) {
        Intent intent = new Intent(this, PoachedEggs.class);
        this.startActivity(intent);
    }

    public void clickBullsEye (View view) {
        Intent intent = new Intent(this, BullsEyeEggs.class);
        this.startActivity(intent);
    }

    public void clickScrambledEggs (View view) {
        Intent intent = new Intent(this, ScrambledEggs.class);
        this.startActivity(intent);
    }

    public void clickOmelette (View view) {
        Intent intent = new Intent(this, OmeletteEggs.class);
        this.startActivity(intent);
    }

}
