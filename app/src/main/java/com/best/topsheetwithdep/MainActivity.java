package com.best.topsheetwithdep;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.androidbolts.topsheet.TopSheetBehavior;
import com.best.topsheetwithdep.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private TopSheetBehavior<View> topSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        topSheetBehavior = TopSheetBehavior.from(findViewById(R.id.topSheetContainer));
        // topSheetBehavior.setPeekHeight(0);
        /// topSheetBehavior.setState(TopSheetBehavior.STATE_EXPANDED);

        topSheetBehavior.setTopSheetCallback(new TopSheetBehavior.TopSheetCallback() {
            @Override
            public void onSlide(View bottomSheet, float slideOffset, Boolean isOpening) {
                // Implement the onSlide method
            }

            @Override
            public void onStateChanged(View bottomSheet, int newState) {
                // Implement the onStateChanged method
            }
        });

        binding.btnOpenTopSheet.setOnClickListener(view ->
                topSheetBehavior.setState(TopSheetBehavior.STATE_EXPANDED));

        binding.topSheetContainer.btnClose.setOnClickListener(view ->
                topSheetBehavior.setState(TopSheetBehavior.STATE_COLLAPSED));
    }
}