package com.example.td6.controllers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.td6.R;
import com.example.td6.interfaces.GithubService;
import com.example.td6.models.Commit;
import com.example.td6.models.Repos;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ReposAdapter extends RecyclerView.Adapter<ReposAdapter.ViewHolder> {

    private final List<Repos> reposList;
    private final GithubService githubService;

    public ReposAdapter(List<Repos> repos, GithubService githubService) {
        this.reposList = repos;
        this.githubService = githubService;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View reposView = inflater.inflate(R.layout.repos_item, parent, false);
        return new ViewHolder(reposView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Repos repos = reposList.get(position);

        ImageView avatar = holder.avatar;

        Glide.with(holder.itemView)
                .load(repos.getOwner().getAvatar_url())
                .centerCrop()
                .placeholder(R.mipmap.github)
                .into(avatar);

        TextView owner = holder.owner;
        owner.setText(repos.getOwner().getLogin());

        TextView repository = holder.repository;
        repository.setText(repos.getName());

        TextView issues = holder.issues;
        issues.setText(String.valueOf(repos.getissues()));

        TextView commits = holder.commits;

        githubService.getCommits(repos.getOwner().getLogin(), repos.getName()).enqueue(new Callback<List<Commit>>() {
            @Override
            public void onResponse(Call<List<Commit>> call, Response<List<Commit>> response) {
                if (response.body() != null) {
                    commits.setText(String.valueOf(getNbCommits(response.body())));
                } else {
                    commits.setText("0");
                }
            }

            @Override
            public void onFailure(Call<List<Commit>> call, Throwable t) { }
        });

        TextView language = holder.language;
        language.setText(repos.getLanguage());

    }

    @Override
    public int getItemCount() {

        return this.reposList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView avatar;
        public TextView owner;
        public TextView repository;
        public TextView issues;
        public TextView commits;
        public TextView language;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            avatar = itemView.findViewById(R.id.avatar);
            owner = itemView.findViewById(R.id.owner_name);
            repository = itemView.findViewById(R.id.repos_name);
            issues = itemView.findViewById(R.id.issues);
            commits = itemView.findViewById(R.id.commits);
            language = itemView.findViewById(R.id.language);

        }
    }

    private int getNbCommits(List<Commit> commits) {
        return commits.size();
    }
}

