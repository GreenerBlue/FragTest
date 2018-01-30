package com.testing.atul.fragtest;

import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.testing.atul.fragtest.dummy.DummyContent;

public class MainActivity extends FragmentActivity implements MenuFragment.OnListFragmentInteractionListener, WaterFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if( findViewById(R.id.frag_container)!=null){
            if(savedInstanceState != null) return;

                MenuFragment firstFrag = new MenuFragment();
                firstFrag.setArguments(getIntent().getExtras());
                getSupportFragmentManager().beginTransaction().add(R.id.frag_container, firstFrag).commit();

        }

    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {
        WaterFragment waterFragment = WaterFragment.newInstance(item.name, item.details);
        if(getResources().getConfiguration().orientation==Configuration.ORIENTATION_LANDSCAPE) {

            getSupportFragmentManager().beginTransaction().replace(R.id.list_static, waterFragment)
                    .commit();
        }
        else {
            getSupportFragmentManager().beginTransaction().replace(R.id.frag_container, waterFragment)
                    .addToBackStack(null).commit();
        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
