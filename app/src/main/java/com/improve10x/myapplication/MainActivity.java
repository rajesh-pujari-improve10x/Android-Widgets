package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.improve10x.myapplication.checkbox.CheckBoxActivity;
import com.improve10x.myapplication.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleAddition();
        handleCustomizeToast();
        handleToggle();
        handleCheckBox();
        handleRadioButton();
        handleRatingBar();
        handleSeekBar();
        handleDatePicker();
        handleTimePicker();
        handleVerticalScrollView();
        handleHorizontalScrollView();
        handleListView();
        handleCustomListView();
        handleImageSwitcher();
        handleImageSlider();
        handleAlertDialog();
        handleProgressDialog();
        handleWebView();
        handleSpinner();
        handleCustomAlertDialog();
        handleSearchView();
        handleTextWatcher();
        handleSearchViewToolBar();
        handleAutoCompleteTextView();
        handleMultiAutoCompleteTextView();
    }


    private void handleAddition() {
        binding.additionBtn.setOnClickListener(view -> {
            intent = new Intent(this, AddActivity.class);
            startActivity(intent);
        });
    }

    private void handleCustomizeToast() {
        binding.customizeToastBtn.setOnClickListener(view -> {
            intent = new Intent(this, CustomizeToastActivity.class);
            startActivity(intent);
        });
    }

    private void handleToggle() {
        binding.toggleBtn.setOnClickListener(view -> {
            intent = new Intent(this, ToggleButtonActivity.class);
            startActivity(intent);
        });
    }

    private void handleCheckBox() {
        binding.checkBoxBtn.setOnClickListener(view -> {
            intent = new Intent(this, CheckBoxActivity.class);
            startActivity(intent);
        });
    }

    private void handleRadioButton() {
        binding.radioBtnRb.setOnClickListener(view -> {
            intent = new Intent(this, RadioButtonActivity.class);
            startActivity(intent);
        });
    }

    private void handleRatingBar() {
        binding.ratingBarBtn.setOnClickListener(view -> {
            intent = new Intent(this, RatingBarActivity.class);
            startActivity(intent);
        });
    }

    private void handleSeekBar() {
        binding.seekBarBtn.setOnClickListener(view -> {
            intent = new Intent(this, SeekBarActivity.class);
            startActivity(intent);
        });
    }

    private void handleDatePicker() {
        binding.datePickerBtn.setOnClickListener(view -> {
            intent = new Intent(this, DatePickerActivity.class);
            startActivity(intent);
        });
    }

    private void handleTimePicker() {
        binding.timePickerBtn.setOnClickListener(view -> {
            intent = new Intent(this, TimePickerActivity.class);
            startActivity(intent);
        });
    }

    private void handleVerticalScrollView() {
        binding.verticalScrollViewBtn.setOnClickListener(view -> {
            intent = new Intent(this, VerticalScrollViewActivity.class);
            startActivity(intent);
        });
    }

    private void handleHorizontalScrollView() {
        binding.horizontalScrollViewBtn.setOnClickListener(view -> {
            intent = new Intent(this, HorizontalScrollViewActivity.class);
            startActivity(intent);
        });
    }

    private void handleListView() {
        binding.listViewBtn.setOnClickListener(view -> {
            intent = new Intent(this, ListViewActivity.class);
            startActivity(intent);
        });
    }

    private void handleCustomListView() {
        binding.customListViewBtn.setOnClickListener(view -> {
            intent = new Intent(this, CustomListViewActivity.class);
            startActivity(intent);
        });
    }

    private void handleImageSwitcher() {
        binding.imageSwitcherBtn.setOnClickListener(view -> {
            intent = new Intent(this, ImageSwitcherActivity.class);
            startActivity(intent);
        });
    }

    private void handleImageSlider() {
        binding.imageSliderBtn.setOnClickListener(view -> {
            intent = new Intent(this, ImageSliderActivity.class);
            startActivity(intent);
        });
    }

    private void handleAlertDialog() {
        binding.alertDialogBtn.setOnClickListener(view -> {
            intent = new Intent(this, AlertDialogBoxActivity.class);
            startActivity(intent);
        });
    }

    private void handleProgressDialog() {
        binding.progressDialogBtn.setOnClickListener(view -> {
            intent = new Intent(this, ProgressDialogActivity.class);
            startActivity(intent);
        });
    }

    private void handleWebView() {
        binding.webViewBtn.setOnClickListener(view -> {
            intent = new Intent(this, WebViewActivity.class);
            startActivity(intent);
        });
    }

    private void handleSpinner() {
        binding.spinnerSpBtn.setOnClickListener(view -> {
            intent = new Intent(this, SpinnerActivity.class);
            startActivity(intent);
        });
    }

    private void handleCustomAlertDialog() {
        binding.customAlertDialogBtn.setOnClickListener(view -> {
            intent = new Intent(this, CustomAlertDialogActivity.class);
            startActivity(intent);
        });
    }

    private void handleSearchView() {
        binding.searchViewBtn.setOnClickListener(view -> {
            intent = new Intent(this, SearchViewActivity.class);
            startActivity(intent);
        });
    }

    private void handleTextWatcher() {
        binding.textWatcherBtn.setOnClickListener(view -> {
            intent = new Intent(this, TextWatcherActivity.class);
            startActivity(intent);
        });
    }

    private void handleSearchViewToolBar() {
        binding.searchViewToolBarBtn.setOnClickListener(view -> {
            intent = new Intent(this, SearchViewToolBarActivity.class);
            startActivity(intent);
        });
    }

    private void handleAutoCompleteTextView() {
        binding.autoCompleteTextViewBtn.setOnClickListener(view -> {
            intent = new Intent(this, AutoCompleteTextViewActivity.class);
            startActivity(intent);
        });
    }

    private void handleMultiAutoCompleteTextView() {
        binding.multiAutoCompleteTextViewBtn.setOnClickListener(view -> {
            intent = new Intent(this, MultiAutoCompleteTextViewActivity.class);
            startActivity(intent);
        });
    }
}