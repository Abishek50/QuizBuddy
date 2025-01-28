package com.example.quizapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Q3HardFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_q3_hard, container, false);

        //initialize variables
        Spinner spinner;
        Button btn;

        //binding variables
        spinner=view.findViewById(R.id.spinner);
        btn=view.findViewById(R.id.submit_btn);

        //btn click listener
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Correct answer to this would be option 1
                //not "select option" which will be in position 0
                int pos;
                pos=spinner.getSelectedItemPosition();
                if (pos==1){
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