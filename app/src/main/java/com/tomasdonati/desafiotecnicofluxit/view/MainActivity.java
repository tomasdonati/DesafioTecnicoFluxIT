package com.tomasdonati.desafiotecnicofluxit.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tomasdonati.desafiotecnicofluxit.R;
import com.tomasdonati.desafiotecnicofluxit.controller.UserController;
import com.tomasdonati.desafiotecnicofluxit.model.User;
import com.tomasdonati.desafiotecnicofluxit.utils.ResultListener;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserController userController = new UserController();
        userController.bringUsers("5000", new ResultListener<List<User>>() {
            @Override
            public void finish(List<User> result) {

            }
        });
    }
}
