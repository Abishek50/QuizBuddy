package com.example.quizapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class EasyAdapter extends FragmentStateAdapter {
    public EasyAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager,lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:{
                Q1EasyFragment q1EasyFragment=new Q1EasyFragment();
                return q1EasyFragment;
            }
            case 1:{
                Q2EasyFragment q2EasyFragment=new Q2EasyFragment();
                return q2EasyFragment;
            }
            case 2:{
                Q3EasyFragment q3EasyFragment =new Q3EasyFragment();
                return q3EasyFragment;
            }
            case 3:{
                Q4EasyFragment q4EasyFragment=new Q4EasyFragment();
                return q4EasyFragment;
            }
            case 4:{
                Q5EasyFragment q5EasyFragment=new Q5EasyFragment();
                return q5EasyFragment;
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
