package com.improve10x.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

import com.improve10x.myapplication.databinding.ActivitySeekBarBinding;

public class SeekBarActivity extends AppCompatActivity {

    private ActivitySeekBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySeekBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleSeekBar();
    }

    private void handleSeekBar() {
        binding.seekBarSb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int position, boolean b) {
                Toast.makeText(SeekBarActivity.this, "SeekBar Progress : " + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBarActivity.this, "SeekBar Touch Started!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBarActivity.this, "SeekBar Touch Stopped!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}