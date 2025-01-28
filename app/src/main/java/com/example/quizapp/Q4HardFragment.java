package com.example.quizapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Q4HardFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_q4_hard, container, false);

        //initialize variables
        CheckBox op1,op2,op3;
        Button btn;

        //binding variables
        op1=view.findViewById(R.id.cb1_4);
        op2=view.findViewById(R.id.cb2_4);
        op3=view.findViewById(R.id.cb3_4);
        btn=view.findViewById(R.id.submit_btn);

        //submit Button setup
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //for this question correct answers are 1,3. both should be checked
                if (op1.isChecked()&&op3.isChecked()&& !(op2.isChecked())){
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