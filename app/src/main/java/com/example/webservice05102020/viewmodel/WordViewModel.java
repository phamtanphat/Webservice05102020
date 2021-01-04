package com.example.webservice05102020.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.webservice05102020.model.ResponseApi;
import com.example.webservice05102020.model.WordApi;
import com.example.webservice05102020.respository.WordRespository;

import java.util.List;

import io.reactivex.MaybeObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class WordViewModel {
    private WordRespository wordRespository = null;
    private MutableLiveData<ResponseApi<List<WordApi>>> responseWords = null;

    public WordViewModel(MutableLiveData<ResponseApi<List<WordApi>>> responseWords) {
        this.responseWords = responseWords;
        wordRespository = WordRespository.getInstance();
    }

    public void fetchWords(String page , String numitems){
        wordRespository
                .fetchWords(page ,numitems)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MaybeObserver<ResponseApi<List<WordApi>>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onSuccess(@NonNull ResponseApi<List<WordApi>> listResponseApi) {
                        responseWords.setValue(listResponseApi);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
    public LiveData<ResponseApi<List<WordApi>>> getResultWordsSuccess(){
        return responseWords;
    }

}
