package sptech.rxjavabysp.toDoApp_example.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import sptech.rxjavabysp.toDoApp_example.TodolistFragment;


/**
 * Created by SIBAPRASD
 */

public class ToDoPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public ToDoPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        //returns to do list views
        switch (position) {
            case 0:

                TodolistFragment todolistFragment1 = TodolistFragment.newInstance("0", "to do tasks");
                return todolistFragment1;
            case 1:

                TodolistFragment todolistFragment2 = TodolistFragment.newInstance("1", "done tasks");
                return todolistFragment2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
