package com.tatsme.afb.myandroidfinalproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.button;

public class ScrambledEggs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrambled_eggs);
    }

    public void clickScrambledFBshare (View view) {
        try {
            Intent intent = new Intent("android.intent.category.LAUNCHER");
            intent.setClassName("com.facebook.katana", "com.facebook.katana.LoginActivity");
            startActivity(intent);
        } catch (Exception e) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
            startActivity(browserIntent);
        }

        Button button =  (Button)findViewById(R.id.bt_scrambled_fb);
        button.setVisibility(View.GONE);
    }

    public void clickDecisionYes (View view) {
        clickDecision("Yes");
    }

    public void clickDecisionNo (View view) {
        clickDecision ("No");
    }

    public void clickDecision (String decision){
        Button button =  (Button)findViewById(R.id.bt_scrambled_fb);
        button.setVisibility(0);
        button.setFocusable(true);
        button.setFocusableInTouchMode(true);
        button.requestFocus();
        
        if (decision == "Yes"){
            button.setText(R.string.bt_facebook_yes);
        } else {
            button.setText(R.string.bt_facebook_no);
        }
    }
}
