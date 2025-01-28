package com.example.quizapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Q1Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_q1, container, false);

        //initialize variables
        CheckBox op1,op2,op3;
        Button btn;

        //binding variables
        op1=view.findViewById(R.id.cb1);
        op2=view.findViewById(R.id.cb2);
        op3=view.findViewById(R.id.cb3);
        btn=view.findViewById(R.id.submit_btn);

        //submit Button setup
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //for this question correct answers are 2,3. both should be checked
                if (op2.isChecked()&&op3.isChecked()&& !(op1.isChecked())){
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