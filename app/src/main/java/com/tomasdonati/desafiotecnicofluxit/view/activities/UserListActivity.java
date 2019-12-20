package com.tomasdonati.desafiotecnicofluxit.view.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.tomasdonati.desafiotecnicofluxit.R;
import com.tomasdonati.desafiotecnicofluxit.controller.UserController;
import com.tomasdonati.desafiotecnicofluxit.model.pojo.User;
import com.tomasdonati.desafiotecnicofluxit.utils.ResultListener;
import com.tomasdonati.desafiotecnicofluxit.view.adapters.UserListAdapter;

import java.util.ArrayList;
import java.util.List;

public class UserListActivity extends AppCompatActivity implements UserListAdapter.UserListAdapterListener {

    public static final String USER_KEY = "userKey";

    private RecyclerView userListRecycler;
    private UserListAdapter userListAdapter;
    private UserController userController;
    private SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        viewFinder();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        userListAdapter = new UserListAdapter(new ArrayList<User>(), this);

        userController = new UserController();
        requestUser();

        userListRecycler.setLayoutManager(linearLayoutManager);
        userListRecycler.setAdapter(userListAdapter);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                requestUser();
                swipeRefreshLayout.setRefreshing(false);
            }
        });

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
        swipeRefreshLayout = findViewById(R.id.userListActivity_swipeRefreshLayout);
    }


    @Override
    public void listenToUser(User user) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(UserDetailActivity.USER_DETAIL, user);
        Intent intent = new Intent(UserListActivity.this, UserDetailActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
