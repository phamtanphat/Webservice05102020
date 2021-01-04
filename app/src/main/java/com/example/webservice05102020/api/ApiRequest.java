package com.example.webservice05102020.api;

import com.example.webservice05102020.model.ResponseApi;
import com.example.webservice05102020.model.WordApi;

import java.util.List;

import io.reactivex.Maybe;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiRequest {

    @GET("word.php")
    Maybe<ResponseApi<List<WordApi>>> fetchWords(
            @Query("page") String page,
            @Query("numitems") String numitems
    );

//    Call<List<Repo>> listRepos(
//            @Path("countpages") String countpages ,
//            @Path("countitems") String countitems
//    );
}
