package com.example.td6.controllers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.td6.R;
import com.example.td6.models.Repos;

import java.util.List;

public class ReposAdapter extends RecyclerView.Adapter<ReposAdapter.ViewHolder> {

    private final List<Repos> reposList;

    public ReposAdapter(List<Repos> repos) {
        this.reposList = repos;
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

        TextView owner = holder.owner;
        owner.setText(repos.getOwner().getLogin());

        TextView repository = holder.repository;
        repository.setText(repos.getName());

        TextView issues = holder.issues;
        issues.setText(repos.getissues());

        TextView commits = holder.commits;

        TextView language = holder.language;
        language.setText(repos.getLanguage());

    }

    @Override
    public int getItemCount() {
        return 0;
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

            avatar = itemView.findViewById(R.id.repos_avatar_owner);
            owner = itemView.findViewById(R.id.repos_nom_owner);
            repository = itemView.findViewById(R.id.repos_nom_repos);
            issues = itemView.findViewById(R.id.repos_issues);
            commits = itemView.findViewById(R.id.repos_commits);
            language = itemView.findViewById(R.id.repos_language);

        }
    }
