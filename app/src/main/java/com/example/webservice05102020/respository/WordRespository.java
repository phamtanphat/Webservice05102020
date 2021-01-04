package com.example.webservice05102020.respository;

import com.example.webservice05102020.api.ApiRequest;
import com.example.webservice05102020.api.RetrofitInit;
import com.example.webservice05102020.model.ResponseApi;
import com.example.webservice05102020.model.WordApi;

import java.util.List;

import io.reactivex.Maybe;

public class WordRespository {
    private static WordRespository instance = null;
    private ApiRequest apiRequest = null;

    private WordRespository(){
        apiRequest = RetrofitInit.getInStance();
    }
    public static WordRespository getInstance(){
        if (instance == null){
            instance = new WordRespository();
        }
        return instance;
    }
    public Maybe<ResponseApi<List<WordApi>>> fetchWords(String page , String numitems){
        return  apiRequest.fetchWords(page ,numitems );
    }
}
