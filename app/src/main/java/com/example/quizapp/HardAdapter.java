package com.example.quizapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class HardAdapter extends FragmentStateAdapter {
    public HardAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager,lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:{
                Q1HardFragment q1HardFragment=new Q1HardFragment();
                return q1HardFragment;
            }
            case 1:{
                Q2HardFragment q2HardFragment=new Q2HardFragment();
                return q2HardFragment;
            }
            case 2:{
                Q3HardFragment q3HardFragment =new Q3HardFragment();
                return q3HardFragment;
            }
            case 3:{
                Q4HardFragment q4HardFragment=new Q4HardFragment();
                return q4HardFragment;
            }
            case 4:{
                Q5HardFragment q5HardFragment=new Q5HardFragment();
                return q5HardFragment;
            }
            default:{
                return null;
            }
        }

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
