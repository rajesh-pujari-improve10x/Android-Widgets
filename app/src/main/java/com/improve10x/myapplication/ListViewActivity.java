package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.improve10x.myapplication.databinding.ActivityListViewBinding;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    private ActivityListViewBinding binding;
    private ArrayList<String> arrayList;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
        listView();
    }

    private void setData() {
        arrayList = new ArrayList<>();
        arrayList.add("Anupama");
        arrayList.add("Om Prakash");
        arrayList.add("Rajesh");
        arrayList.add("SriHarsha");
        arrayList.add("Suresh");
        arrayList.add("Anupama");
        arrayList.add("Om Prakash");
        arrayList.add("Rajesh");
        arrayList.add("SriHarsha");
        arrayList.add("Suresh");
        arrayList.add("Anupama");
        arrayList.add("Om Prakash");
        arrayList.add("Rajesh");
        arrayList.add("SriHarsha");
        arrayList.add("Suresh");
        arrayList.add("Anupama");
        arrayList.add("Om Prakash");
        arrayList.add("Rajesh");
        arrayList.add("SriHarsha");
        arrayList.add("Suresh");
    }

    private void listView() {
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        binding.listViewLv.setAdapter(arrayAdapter);
        binding.listViewLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(ListViewActivity.this, arrayList.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}