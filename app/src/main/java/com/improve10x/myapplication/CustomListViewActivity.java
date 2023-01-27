package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.myapplication.databinding.ActivityCustomListViewBinding;
import com.improve10x.myapplication.databinding.CustomListViewItemBinding;

import java.util.ArrayList;

public class CustomListViewActivity extends AppCompatActivity {

    private ActivityCustomListViewBinding binding;
    private CustomListViewAdapter adapter;
    private ArrayList<CustomListView> customListViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomListViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
        customListView();
    }

    private void setData() {
        customListViews = new ArrayList<>();

        CustomListView item1 = new CustomListView();
        item1.imageUrl = "https://yt3.ggpht.com/ytc/AL5GRJU5ErI9wT_loUeginp1WMVJq7AwIvD1pWHTHbNpWA=s68-c-k-c0x00ffffff-no-rj";
        item1.title = "Rajesh";
        item1.subTitle = "Pujari";
        customListViews.add(item1);

        CustomListView item2 = new CustomListView();
        item2.imageUrl = "https://yt3.ggpht.com/ytc/AL5GRJU5ErI9wT_loUeginp1WMVJq7AwIvD1pWHTHbNpWA=s68-c-k-c0x00ffffff-no-rj";
        item2.title = "Pujari";
        item2.subTitle = "Rajesh";
        customListViews.add(item2);

        CustomListView item3 = new CustomListView();
        item3.imageUrl = "https://yt3.ggpht.com/ytc/AL5GRJU5ErI9wT_loUeginp1WMVJq7AwIvD1pWHTHbNpWA=s68-c-k-c0x00ffffff-no-rj";
        item3.title = "Pujari";
        item3.subTitle = "Raj";
        customListViews.add(item3);
        customListViews.add(item3);
    }


    private void customListView() {
        adapter = new CustomListViewAdapter(this, R.layout.custom_list_view_item, customListViews);
        binding.customListViewLv.setAdapter(adapter);
        binding.customListViewLv.setOnItemClickListener((adapterView, view, position, l) -> {
            handleClick(position);
        });
    }

    private void handleClick(int position) {
        if(position == 0) {
            Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
        }
        else if(position == 1) {
            Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
        }
        else if(position == 2) {
            Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
        }
        else if(position == 3) {
            Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
        }
        else if(position == 4) {
            Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
        }
    }
}