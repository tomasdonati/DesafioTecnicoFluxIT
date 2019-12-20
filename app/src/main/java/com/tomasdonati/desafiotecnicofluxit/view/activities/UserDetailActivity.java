package com.tomasdonati.desafiotecnicofluxit.view.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.tomasdonati.desafiotecnicofluxit.R;
import com.tomasdonati.desafiotecnicofluxit.model.pojo.User;

public class UserDetailActivity extends AppCompatActivity {

    public static final String USER_DETAIL = "detailKey";

    private ImageView userImage;
    private TextView userFullName;
    private TextView userUsername;
    private TextView userAge;
    private TextView userEmail;
    private TextView userPhone;
    private ProgressBar userImageProgressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);

        viewFinder();
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        User user = (User) bundle.getSerializable(USER_DETAIL);

        userFullName.setText("Name: " + user.getUserFullName().getUserTitle() + " " + user.getUserFullName().getUserFirstName() + " " + user.getUserFullName().getUserLastName());
        userUsername.setText("Username: " + user.getUserLogin().getUserUsername());
        userAge.setText("Age: " + user.getUserDOB().getUserAge());
        userEmail.setText("Email: " + user.getUserEmail());
        userPhone.setText("Phone Number: " + user.getUserPhoneNumber());
        Glide.with(userImage)
                .load(user.getUserPicture().getUserLargePicture())
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        userImageProgressBar.setVisibility(View.GONE);
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        userImageProgressBar.setVisibility(View.GONE);
                        return false;
                    }
                })
                .into(userImage);


    }

    private void viewFinder() {
        userImage = findViewById(R.id.userDetailActivity_imageView_userImage);
        userFullName = findViewById(R.id.userDetailActivity_textView_userFullName);
        userUsername = findViewById(R.id.userDetailActivity_textView_username);
        userAge = findViewById(R.id.userDetailActivity_textView_userAge);
        userEmail = findViewById(R.id.userDetailActivity_textView_userEmail);
        userPhone = findViewById(R.id.userDetailActivity_textView_userPhone);
        userImageProgressBar = findViewById(R.id.userDetailActivity_progressBar_imageProgressBar);
    }
}
