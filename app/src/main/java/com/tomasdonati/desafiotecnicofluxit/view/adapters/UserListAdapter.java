package com.tomasdonati.desafiotecnicofluxit.view.adapters;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.tomasdonati.desafiotecnicofluxit.R;
import com.tomasdonati.desafiotecnicofluxit.controller.UserController;
import com.tomasdonati.desafiotecnicofluxit.model.pojo.User;
import com.tomasdonati.desafiotecnicofluxit.utils.ResultListener;

import java.util.ArrayList;
import java.util.List;

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.UserListViewHolder> {

    private List<User> userList;

    public UserListAdapter(List<User> userList){
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View cellView = layoutInflater.inflate(R.layout.cell_user_list, parent, false);

        UserListViewHolder userListViewHolder = new UserListViewHolder(cellView);

        return userListViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserListViewHolder holder, int position) {
        User userToShow = userList.get(position);
        holder.bindUser(userToShow);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class UserListViewHolder extends RecyclerView.ViewHolder{

        private ImageView userThumbnail;
        private TextView userUsername;
        private ProgressBar thumbnailProgressBar;

        public UserListViewHolder(@NonNull View itemView) {
            super(itemView);

            userUsername = itemView.findViewById(R.id.userListCell_TextView_userUsername);
            userThumbnail = itemView.findViewById(R.id.userListCell_imageView_userThumbnail);
            thumbnailProgressBar = itemView.findViewById(R.id.userListCell_progressBar);
        }

        public void bindUser(User user){
            userUsername.setText(user.getUserLogin().getUserUsername());

            Glide.with(userThumbnail)
                    .load(user.getUserPicture().getUserThumbnailPicture())
                    .listener(new RequestListener<Drawable>() {
                        @Override
                        public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                            thumbnailProgressBar.setVisibility(View.GONE);
                            return false;
                        }

                        @Override
                        public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                            thumbnailProgressBar.setVisibility(View.GONE);
                            return false;
                        }
                    })
                    .into(userThumbnail)
            ;
        }
    }

    public void setUserList(List<User> userList){
        this.userList = userList;
        notifyDataSetChanged();
    }


}
