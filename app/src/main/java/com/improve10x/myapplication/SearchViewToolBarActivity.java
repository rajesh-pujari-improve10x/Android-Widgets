package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.SearchView;

import com.improve10x.myapplication.databinding.ActivitySearchViewToolBarBinding;

import java.util.ArrayList;

public class SearchViewToolBarActivity extends AppCompatActivity {

    private ActivitySearchViewToolBarBinding binding;
    private ArrayList<String> list;
    private ArrayAdapter<String> adapter;
    private MenuItem searchViewToolBarItem;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchViewToolBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("SearchView ToolBar");
        setData();
    }

    private void setData() {
        list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Orange");
        list.add("Lychee");
        list.add("Gavava");
        list.add("Peech");
        list.add("Melon");
        list.add("Watermelon");
        list.add("Papaya");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_view_tool_bar_menu, menu);
        searchViewToolBarItem = menu.findItem(R.id.search_view_tool_bar);
        searchView = (SearchView) MenuItemCompat.getActionView(searchViewToolBarItem);
        searchViewToolBar();
        return true;
    }

    private void searchViewToolBar() {
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        binding.listViewLv.setAdapter(adapter);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchView.clearFocus();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}