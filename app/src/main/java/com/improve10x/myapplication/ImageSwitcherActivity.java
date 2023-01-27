package com.improve10x.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import com.improve10x.myapplication.databinding.ActivityImageSwitcherBinding;

public class ImageSwitcherActivity extends AppCompatActivity {

    private ActivityImageSwitcherBinding binding;
    int counter = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImageSwitcherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        imageSwitcher();
        handleNext();
    }

    private void handleNext() {
        Animation aniOut = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        Animation aniIn = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        binding.imageSwitcherIs.setOutAnimation(aniOut);
        binding.imageSwitcherIs.setInAnimation(aniIn);
        binding.nextBtn.setOnClickListener(view -> {
            setDrawableImages();
        });
    }
    private void imageSwitcher() {
        binding.imageSwitcherIs.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT
                ));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageResource(R.drawable.improve10x_logo__1_);
                return imageView;
            }
        });
    }

    private void setDrawableImages() {
        int[] switcherImageDrawables = {R.drawable.forest, R.drawable.improve10x_logo__1_, R.drawable.awasome};
        int switcherImageLength = switcherImageDrawables.length;
        counter++;
        if (counter == switcherImageLength){
            counter = 0;
            binding.imageSwitcherIs.setImageResource(switcherImageDrawables[counter]);
        }
        else{
            binding.imageSwitcherIs.setImageResource(switcherImageDrawables[counter]);
        }
    }
}