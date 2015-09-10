package matcom.dcf.exeswipetab;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity implements ActionBar.TabListener {
    ActionBar actionbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        Log.d("Tabs-df", "Tabs - On tab selected at position -  "+tab.getPosition()+"  name  "+tab.getText());

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        Log.d("Tabs-df", "Tabs - On tab selected at position -  "+tab.getPosition()+"  name  "+tab.getText());

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
        Log.d("Tabs-df", "Tabs - On tab selected at position -  "+tab.getPosition()+"  name  "+tab.getText());

    }
}
