package sptech.rxjavabysp.toDoApp_example;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import sptech.rxjavabysp.R;
import sptech.rxjavabysp.toDoApp_example.adapter.ToDoPagerAdapter;

public class ToDoMainActivity extends AppCompatActivity implements TodolistFragment.OnFragmentInteractionListener, UpdateToDoFragment.OnFragmentInteractionListener {

    //define tabs for to do tasks
    TabLayout todoTabs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_main);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("My To Do List");

        todoTabs = findViewById(R.id.tab_layout);


        //set images to tabs
        todoTabs.addTab(todoTabs.newTab().setIcon(R.drawable.ic_todo));

        todoTabs.addTab(todoTabs.newTab().setIcon(R.drawable.ic_done));

        todoTabs.setTabGravity(TabLayout.GRAVITY_FILL);

        //set fragments for tabs

        final ViewPager viewPager = findViewById(R.id.todo_pager);


        final ToDoPagerAdapter adapter = new ToDoPagerAdapter
                (getSupportFragmentManager(), todoTabs.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(todoTabs));
        todoTabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
