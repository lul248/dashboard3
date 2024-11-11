package com.example.dashboard3;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox;
    private ProgressBar progressBar;
    private TextView textViews;
    private FloatingActionButton FloatingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Initialize the checkbox, progress bar, and task category text
        checkBox = findViewById(R.id.checkBox);
        progressBar = findViewById(R.id.progressBar);
        textViews = findViewById(R.id.textViews);
        FloatingButton = findViewById(R.id.fab);

        // Set checkbox listener to update task categories and progress bar
        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            int progress = progressBar.getProgress();

            if (isChecked) {
                // Increase progress and update task categories
                progress += 20;  // Adjust the value based on the task weight
                textViews.setText("Tasks Completed: " + progress + "%");
            } else {
                // Decrease progress if unchecked
                progress -= 20;  // Adjust the value based on the task weight
                textViews.setText("Tasks Completed: " + progress + "%");
            }
            progressBar.setProgress(progress);
        });
    }
}