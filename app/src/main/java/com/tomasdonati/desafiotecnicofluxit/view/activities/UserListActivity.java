package com.tomasdonati.desafiotecnicofluxit.view.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.tomasdonati.desafiotecnicofluxit.R;
import com.tomasdonati.desafiotecnicofluxit.controller.UserController;
import com.tomasdonati.desafiotecnicofluxit.model.pojo.User;
import com.tomasdonati.desafiotecnicofluxit.utils.ResultListener;
import com.tomasdonati.desafiotecnicofluxit.view.adapters.UserListAdapter;

import java.util.ArrayList;
import java.util.List;

public class UserListActivity extends AppCompatActivity {

    private RecyclerView userListRecycler;
    private UserListAdapter userListAdapter;
    private UserController userController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        viewFinder();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        userListAdapter = new UserListAdapter(new ArrayList<User>());

        userController = new UserController();
        requestUser();

        userListRecycler.setLayoutManager(linearLayoutManager);
        userListRecycler.setAdapter(userListAdapter);

    }

    private void requestUser() {
        userController.bringUsers(new ResultListener<List<User>>() {
            @Override
            public void finish(List<User> result) {
                userListAdapter.setUserList(result);
            }
        });
    }

    public void viewFinder(){
        userListRecycler = findViewById(R.id.userListActivity_recyclerView_productList);
    }
}
