package com.example.td6.interfaces;

import com.example.td6.models.Commit;
import com.example.td6.models.Repos;
import com.example.td6.models.ReposSearch;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GithubService {
    String ENDPOINT = "https://api.github.com";

    @GET("/users/{user}/repos")
    Call<List<Repos>> userRepos(@Path("user") String user);

    @GET("/search/repositories")
    Call<List<Repos>> searchRepos(@Query("q") String query);

    @GET("/search/repositories")
    Call<ReposSearch> searchReposQuery(@Query("q") String query);

    @GET("/repos/{user}/{repos}/commits")
    Call<List<Commit>> getCommits(@Path("user") String user, @Path("repos") String repos);
}
