package com.example.quizapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MediumAdapter extends FragmentStateAdapter {
    public MediumAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager,lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:{
                Q1Fragment q1Fragment=new Q1Fragment();
                return q1Fragment;
            }
            case 1:{
                Q2Fragment q2Fragment=new Q2Fragment();
                return q2Fragment;
            }
            case 2:{
                Q3Fragment q3Fragment =new Q3Fragment();
                return q3Fragment;
            }
            case 3:{
                Q4Fragment q4Fragment=new Q4Fragment();
                return q4Fragment;
            }
            case 4:{
                Q5Fragment q5Fragment=new Q5Fragment();
                return q5Fragment;
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
