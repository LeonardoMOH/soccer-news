package me.dio.soccernews.data.remote;

import java.util.List;

import me.dio.soccernews.domain.News;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface soccernewsAPI {

    @GET("news.json")
    Call<List<News>> getNews();

}
