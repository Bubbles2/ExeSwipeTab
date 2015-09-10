package matcom.dcf.exeswipetab;

import android.app.ActionBar;
import android.app.Activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends FragmentActivity implements ActionBar.TabListener {
    ActionBar actionbar;
    ViewPager viewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        viewpager = (ViewPager) findViewById(R.id.pager);
        viewpager.setAdapter(new MyAdapter(getSupportFragmentManager()));

        actionbar = getActionBar();
        actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        //
        ActionBar.Tab tab1 = actionbar.newTab();
        tab1.setText("Tab1");
        tab1.setTabListener(this);
        //
        ActionBar.Tab tab2 = actionbar.newTab();
        tab2.setText("Tab2");
        tab2.setTabListener(this);
        //
        ActionBar.Tab tab3 = actionbar.newTab();
        tab3.setText("Tab3");
        tab3.setTabListener(this);
        //
        actionbar.addTab(tab1);
        actionbar.addTab(tab2);
        actionbar.addTab(tab3);
    }



    @Override
    public void onTabSelected(ActionBar.Tab tab, android.app.FragmentTransaction ft) {
        Log.d("Tabs-df", "Tabs - On tab selected at position -  " + tab.getPosition() + "  name  " + tab.getText());

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, android.app.FragmentTransaction ft) {
        Log.d("Tabs-df", "Tabs - On tab selected at position -  " + tab.getPosition() + "  name  " + tab.getText());

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, android.app.FragmentTransaction ft) {

    }

    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment frag = null;
            if (position==0){
                frag = new FragmentA();
            }
            if (position==1){
                frag = new FragmentB();
            }
            if (position==2){
                frag = new FragmentC();
            }


            return frag;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}



