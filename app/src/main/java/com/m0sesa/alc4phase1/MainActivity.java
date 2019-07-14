package com.m0sesa.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button aboutAlc = findViewById(R.id.btn_about);
        Button profile = findViewById(R.id.btn_profile);

        aboutAlc.setOnClickListener(this);
        profile.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.btn_about){
            startActivity(new Intent(this, AboutALCActivity.class));
        }else if (id == R.id.btn_profile){
            startActivity(new Intent(this, MyProfileActivity.class));
        }
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}
