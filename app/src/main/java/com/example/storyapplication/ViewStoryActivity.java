package com.example.storyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewStoryActivity extends AppCompatActivity {

    TextView StoryName,Story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_story);
        StoryName = findViewById(R.id.idViewStoryName);
        Story = findViewById(R.id.idViewStory);

        Intent intent2 = getIntent();

        String storyName= intent2.getExtras().getString("key_storyName");
        String stories= intent2.getExtras().getString("key_currentStory");

        StoryName.setText(""+storyName);
        Story.setText(""+stories);

    }
}