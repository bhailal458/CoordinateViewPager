package com.example.sparken02.coordinateviewpager;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.graphics.ColorUtils;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;

public class MainActivity extends AppCompatActivity {
    FragmentPagerAdapter adapterviewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

//        NestedScrollView scrollview = (NestedScrollView)findViewById(R.id.nestscroll);
//        scrollview.setFillViewport(true);


        ViewPager vpager = (ViewPager) findViewById(R.id.viewPager);
        adapterviewpager = new MyPAgerAdapter(getSupportFragmentManager());
        vpager.setAdapter(adapterviewpager);

//        PagerTitleStrip pagestrip = (PagerTitleStrip)findViewById(R.id.pager_title_strip);
//        pagestrip.setTextSize(TypedValue.COMPLEX_UNIT_SP,25);
//        pagestrip.setTextColor(Color.BLUE);

    }


    public static class MyPAgerAdapter extends FragmentPagerAdapter{
        private static int NUM_ITEMS = 2;

        public MyPAgerAdapter(FragmentManager fragmentManager){
            super(fragmentManager);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if(position == 0)
                return "JAVA";
            else
                return "android";
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }
        @Override
        public Fragment getItem(int position) {

            switch (position){
                case 0:
                    return FragmentJaya.newInstance(0);
                case 1:
                    return FragmentAndroid.newInstance(1);
            }
            return null;
        }
    }


}
