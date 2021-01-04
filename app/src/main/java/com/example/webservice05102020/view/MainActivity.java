package com.example.webservice05102020.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;

import com.example.webservice05102020.R;
import com.example.webservice05102020.model.ResponseApi;
import com.example.webservice05102020.model.WordApi;
import com.example.webservice05102020.viewmodel.WordViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    WordViewModel wordViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wordViewModel = new ViewModelProvider(getViewModelStore(), new ViewModelProvider.Factory() {
            @NonNull
            @Override
            public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
                return (T) new WordViewModel();
            }
        }).get(WordViewModel.class);

        wordViewModel.getResultWordsSuccess().observe(this, new Observer<ResponseApi<List<WordApi>>>() {
            @Override
            public void onChanged(ResponseApi<List<WordApi>> listResponseApi) {
                Log.d("BBB",listResponseApi.getData().size() + "");
            }
        });

        wordViewModel.fetchWords("1" , "2");
    }
}