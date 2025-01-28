package com.example.quizapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DifficultyLevelAdapter extends RecyclerView.Adapter<DifficultyLevelAdapter.MyViewHolder> {
    Context context;
    //Array list of type DifficultyModal
    ArrayList<DifficultyModal> arrayList;

    //Constructor
    DifficultyLevelAdapter(Context context, ArrayList<DifficultyModal> arrayList){
        this.context=context;
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.difficulty_level_item,parent,false);
        MyViewHolder myViewHolder= new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.description.setText(arrayList.get(position).description);
        holder.title.setText(arrayList.get(position).title);

        //click listener for whole item
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedPosition= holder.getAdapterPosition();
                Intent i;
                // Different activities for different difficulty levels
                switch (selectedPosition) {
                    //easy
                    case 0:
                        i = new Intent(view.getContext(), QuizEnvironmentEasy.class);
                        view.getContext().startActivity(i);
                        break;

                    //Medium
                    case 1:
                        i = new Intent(view.getContext(), QuizEnvironment.class);
                        view.getContext().startActivity(i);
                        break;

                    //Hard
                    case 2:
                    i = new Intent(view.getContext(), QuizEnvironmentHard.class);
                    view.getContext().startActivity(i);
                    break;}
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    //MyViewHolder
    public class MyViewHolder extends RecyclerView.ViewHolder{
        //create variables
        TextView title, description;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.difficulty_title);
            description=itemView.findViewById(R.id.difficulty_description);
        }
    }
}
