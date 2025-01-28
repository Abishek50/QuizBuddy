package com.example.quizapp;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    //create ArrayList
    ArrayList<DifficultyModal> arrayList= new ArrayList<>();
    //Create media player for bg music
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        RecyclerView recyclerView;
        recyclerView=findViewById(R.id.recView);

        //setup music
        mediaPlayer=MediaPlayer.create(this,R.raw.demo);
        mediaPlayer.start();

        //arraylist.add( new DifficultyModal(int img, String title, String description) )
        arrayList.add(new DifficultyModal(R.drawable.demo,"EASY!","For the Weak!"));
        arrayList.add(new DifficultyModal(R.drawable.demo,"Medium!!","For the average man!"));
        arrayList.add(new DifficultyModal(R.drawable.demo,"HARD!!!","For the Legends!"));

        //Create instance of adapter
        DifficultyLevelAdapter adapter = new DifficultyLevelAdapter(this,arrayList);
        //set adapter on recycle view
        recyclerView.setAdapter(adapter);
        //layout manager
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}