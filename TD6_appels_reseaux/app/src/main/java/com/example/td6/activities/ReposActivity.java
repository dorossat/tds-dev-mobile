package com.example.td6.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.td6.R;
import com.example.td6.controllers.ReposAdapter;
import com.example.td6.interfaces.GithubService;
import com.example.td6.models.Repos;
import com.example.td6.models.ReposSearch;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ReposActivity extends AppCompatActivity {

    private List<Repos> reposList;
    private RecyclerView recyclerView;
    private ReposAdapter reposAdapter;
    private String query;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repos);
        recyclerView = findViewById(R.id.recycle_view);

        Intent intent = getIntent();
        if (intent.hasExtra("repos")) {
            query = intent.getStringExtra("repos");
        }

        GithubService githubService = new Retrofit.Builder()
                .baseUrl(GithubService.ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GithubService.class);

        githubService.searchReposQuery(query).enqueue(new Callback<ReposSearch>() {
            @Override
            public void onResponse(Call<ReposSearch> call, Response<ReposSearch> response) {
                afficherLesRepos(response.body());
            }

            @Override
            public void onFailure(Call<ReposSearch> call, Throwable t) {
                onFailureGet();
            }
        });
    }

    public void afficherLesRepos(ReposSearch reposSearches) {
        this.reposList = reposSearches.getItems();
        reposAdapter = new ReposAdapter(this.reposList);
        recyclerView.setAdapter(reposAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void onFailureGet() {
        Toast.makeText(this, "Erreur lors de l'appel de service", Toast.LENGTH_LONG).show();
    }


}