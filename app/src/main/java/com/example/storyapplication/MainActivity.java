package com.example.storyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {



    String [] StoryNames;

    String [] my_stories;

    ListView StoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StoryNames = getResources().getStringArray(R.array.Story_name);
        my_stories = getResources().getStringArray(R.array.Stories);

        StoryList = findViewById(R.id.idStoryList);

       ArrayAdapter<String> StoryAdapter = new ArrayAdapter<>(MainActivity.this,R.layout.items,R.id.idStoryName,StoryNames);

       StoryList.setAdapter(StoryAdapter);

       StoryList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               String storyName = StoryNames[position];
               String current_story = my_stories[position];


               Intent intent = new Intent(MainActivity.this,ViewStoryActivity.class);
               intent.putExtra("key_currentStory",current_story);
               intent.putExtra("key_storyName",storyName);
               startActivity(intent);

           }
       });

    }
}