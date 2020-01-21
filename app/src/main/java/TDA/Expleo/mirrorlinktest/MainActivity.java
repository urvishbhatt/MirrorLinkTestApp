package TDA.Expleo.mirrorlinktest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar, toolbartab;
    ViewPager viewPager;
    TabLayout tabLayout;

    PageAdapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbartab = (Toolbar) findViewById(R.id.toolbartab);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        tabLayout = (TabLayout)findViewById(R.id.tablyout);

//        setSupportActionBar(toolbar);

        pageAdapter = new PageAdapter(getSupportFragmentManager());
        pageAdapter.addFragment(new OneFragment(),"One");
        pageAdapter.addFragment(new TwoFragment(),"Two");
        pageAdapter.addFragment(new ThreeFragment(),"Three");

        viewPager.setAdapter(pageAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
