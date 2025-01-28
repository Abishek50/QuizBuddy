package com.example.quizapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;


public class Q2HardFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_q2_hard, container, false);

        //initialize variables
        RadioButton rb1,rb2,rb3;
        Button btn;
        //bind variables
        rb1=view.findViewById(R.id.rb1);
        rb2=view.findViewById(R.id.rb2);
        rb3=view.findViewById(R.id.rb3);
        btn=view.findViewById(R.id.submit_btn);

        //btn click listener
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //only option 2 is the correct answer
                //since only one option can be chosen from a radio group,
                if (rb2.isChecked()){
                    Toast.makeText(getContext(),"Correct!",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getContext(),"Incorrect",Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }
}