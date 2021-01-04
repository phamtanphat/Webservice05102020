package com.example.webservice05102020.api;

import com.example.webservice05102020.model.ResponseApi;
import com.example.webservice05102020.model.WordApi;

import java.util.List;

import io.reactivex.Maybe;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
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

    @FormUrlEncoded
    @POST("update.php")
    Maybe<WordApi> update(@Field("id") String id , @Field("ismemorized") boolean ismemorized);
}
