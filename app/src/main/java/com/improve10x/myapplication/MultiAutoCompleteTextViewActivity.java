package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

import com.improve10x.myapplication.databinding.ActivityMultiAutoCompleteTextViewBinding;

import java.util.ArrayList;

public class MultiAutoCompleteTextViewActivity extends AppCompatActivity {

    private ActivityMultiAutoCompleteTextViewBinding binding;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMultiAutoCompleteTextViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
        multiAutoCompleteTextView();
    }

    private void setData() {
        list = new ArrayList<>();
        list.add("Aestro");
        list.add("Blender");
        list.add("CupCake");
        list.add("Donut");
        list.add("Eclair");
        list.add("Froyo");
        list.add("Gingerbread");
        list.add("HoneyComb");
        list.add("IceCream Sandwich");
        list.add("Kitkat");
        list.add("Lollipop");
        list.add("MarshMallow");
    }

    private void multiAutoCompleteTextView() {
        adapter = new ArrayAdapter<>(this, android.R.layout.select_dialog_item, list);
        binding.multiAutoCompleteTextViewTxt.setAdapter(adapter);
        binding.multiAutoCompleteTextViewTxt.setThreshold(1);
        binding.multiAutoCompleteTextViewTxt.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}