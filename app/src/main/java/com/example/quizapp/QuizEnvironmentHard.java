package com.example.quizapp;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

public class QuizEnvironmentHard extends AppCompatActivity {
    //initialize Tab layout and View pager2
    TabLayout tabLayout;
    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_quiz_environment_hard);

        //binding variables
        tabLayout = findViewById(R.id.tab1);
        viewPager2 = findViewById(R.id.viewpager2);

        //create and add tabs to Tab layout
        //first Tab
        TabLayout.Tab q1Tab = tabLayout.newTab();
        q1Tab.setText("Q1");
        tabLayout.addTab(q1Tab);
        //tab 2
        TabLayout.Tab q2Tab = tabLayout.newTab();
        q2Tab.setText("Q2");
        tabLayout.addTab(q2Tab);
        //tab3
        TabLayout.Tab q3Tab = tabLayout.newTab();
        q3Tab.setText("Q3");
        tabLayout.addTab(q3Tab);
        //tab4
        TabLayout.Tab q4Tab = tabLayout.newTab();
        q4Tab.setText("Q4");
        tabLayout.addTab(q4Tab);
        //tab5
        TabLayout.Tab q5Tab = tabLayout.newTab();
        q5Tab.setText("Q5");
        tabLayout.addTab(q5Tab);

        //Create adapter. Set it for ViewPager2
        HardAdapter hardAdapter = new HardAdapter(getSupportFragmentManager(), getLifecycle());
        viewPager2.setAdapter(hardAdapter);

        //set up listener
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}


