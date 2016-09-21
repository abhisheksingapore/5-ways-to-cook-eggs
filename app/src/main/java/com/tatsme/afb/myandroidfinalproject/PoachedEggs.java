package com.tatsme.afb.myandroidfinalproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.button;
import static com.tatsme.afb.myandroidfinalproject.R.string.bt_facebook_no;
import static com.tatsme.afb.myandroidfinalproject.R.string.bt_facebook_yes;

public class PoachedEggs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poached_eggs);
    }

    public void clickPoachedFBshare (View view) {
        try {
            Intent intent = new Intent("android.intent.category.LAUNCHER");
            intent.setClassName("com.facebook.katana", "com.facebook.katana.LoginActivity");
            startActivity(intent);
        } catch (Exception e) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
            startActivity(browserIntent);
        }

        Button button =  (Button)findViewById(R.id.bt_poached_fb);
        button.setVisibility(View.GONE);
    }

    public void clickPoachedDecisionYes (View view) {
        clickPoachedDecision("Yes");
    }

    public void clickPoachedDecisionNo (View view) {
        clickPoachedDecision ("No");
    }

    public void clickPoachedDecision (String decision){
        Button button =  (Button)findViewById(R.id.bt_poached_fb);
        button.setVisibility(0);
        button.setFocusable(true);
        button.setFocusableInTouchMode(true);
        button.requestFocus();

        if (decision == "Yes"){
            button.setText(bt_facebook_yes);
        } else {
            button.setText(bt_facebook_no);
        }
    }
}
