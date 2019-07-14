package com.m0sesa.alc4phase1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setTitle(R.string.my_profile);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        TextView name = findViewById(R.id.name);
        ImageView profilePicture = findViewById(R.id.iv_profile_picture);
        TextView track = findViewById(R.id.tv_track);
        TextView country = findViewById(R.id.tv_country);
        TextView email = findViewById(R.id.tv_email);
        TextView phone = findViewById(R.id.tv_phone);
        TextView slackUsername = findViewById(R.id.tv_slack_username);

        User myDetails = new User(
                "Moses Adewale",
                R.drawable.moses,
                "Android",
                "Nigeria",
                "adewale.moses.b@gmail.com",
                "2347032320477",
                "@m0"
        );

        name.setText(myDetails.getName());
        track.setText(myDetails.getTrack());
        country.setText(myDetails.getCountry());
        email.setText(myDetails.getEmail());
        phone.setText(myDetails.getPhone());
        slackUsername.setText(myDetails.getSlackUsername());
        profilePicture.setImageResource(myDetails.profilePicRes);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home){
            finish();
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
        return super.onOptionsItemSelected(item);
    }

    private class User{
        String name,
                track,
                country,
                email,
                phone,
                slackUsername;

        int profilePicRes;

        User(String name, int profilePicRes, String track, String country, String email, String phone, String slackUsername) {
            this.name = name;
            this.profilePicRes = profilePicRes;
            this.track = track;
            this.country = country;
            this.email = email;
            this.phone = phone;
            this.slackUsername = slackUsername;
        }

        String getName() {
            return name;
        }

        public int getProfilePicRes() {
            return profilePicRes;
        }

        String getTrack() {
            return track;
        }

        String getCountry() {
            return country;
        }

        String getEmail() {
            return email;
        }

        String getPhone() {
            return phone;
        }

        String getSlackUsername() {
            return slackUsername;
        }

    }
}
