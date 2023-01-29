package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.improve10x.myapplication.databinding.ActivityAutoCompleteTextViewBinding;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    private ActivityAutoCompleteTextViewBinding binding;
    private ArrayAdapter<String> adapter;
    String[] languages ={"C","C++","Java",".NET","iPhone","Android","ASP.NET","PHP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAutoCompleteTextViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        autoCompleteTextView();
    }

    private void autoCompleteTextView() {
        adapter = new ArrayAdapter<>(this, android.R.layout.select_dialog_item, languages);
        binding.autoCompleteTextView.setThreshold(1);
        binding.autoCompleteTextView.setAdapter(adapter);
        binding.autoCompleteTextView.setTextColor(Color.RED);
    }
}