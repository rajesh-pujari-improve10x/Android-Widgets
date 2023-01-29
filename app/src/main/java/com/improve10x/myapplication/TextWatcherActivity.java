package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.improve10x.myapplication.databinding.ActivityTextWatcherBinding;

public class TextWatcherActivity extends AppCompatActivity {

    private ActivityTextWatcherBinding binding;
    private ArrayAdapter<String> adapter;
    private String products[] = {"Apple", "Banana","Pinapple", "Orange", "Papaya", "Melon",
            "Grapes", "Water Melon","Lychee", "Guava", "Mango", "Kivi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTextWatcherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        editTextWithTextWatcher();
    }

    private void editTextWithTextWatcher() {
        adapter = new ArrayAdapter<>(this, R.layout.text_watcher_item, R.id.text_view_txt, products);
        binding.listViewLv.setAdapter(adapter);
        binding.productTextTxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Toast.makeText(TextWatcherActivity.this, "before text change", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Toast.makeText(TextWatcherActivity.this, "after text change", Toast.LENGTH_SHORT).show();
            }
        });
    }
}