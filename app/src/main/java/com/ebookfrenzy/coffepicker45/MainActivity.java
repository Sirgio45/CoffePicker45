package com.ebookfrenzy.coffepicker45;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] coffeShops={"Cravings Coffe Shop","From the Ground Up","Higher Grounds Backery & Coffee House","Blu Play Cafe"};
        final ListAdapter theAdapter = new MyAdapter(this,coffeShops);
        ListView theListView = (ListView)findViewById(R.id.theListView);
        theListView.setAdapter(theAdapter);
        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {


                setContentView(R.layout.second_screen_layout);
                TextView TextViewTheName=(TextView)findViewById(R.id.nameTextView);
                TextView TextViewTheAddress=(TextView)findViewById(R.id.addressTextView);
                if(theAdapter.getItem(i)==coffeShops[1])
                {
                    TextViewTheName.setText(coffeShops[1]);
                    TextViewTheAddress.setText("250 W Grand Ave,Wisconsin Rapids,WI 54495");
                }
                if(theAdapter.getItem(i)==coffeShops[0])
                {
                    TextViewTheName.setText(coffeShops[0]);
                    TextViewTheAddress.setText(" 312 8th St S,Wisconsin Rapids,WI 54494");
                }
                if(theAdapter.getItem(i)==coffeShops[2])
                {
                    TextViewTheName.setText(coffeShops[2]);
                    TextViewTheAddress.setText("4231 8th St S,Wisconsin Rapids,WI 54494 ");
                }
                if(theAdapter.getItem(i)==coffeShops[3])
                {
                    TextViewTheName.setText(coffeShops[3]);
                    TextViewTheAddress.setText(" 1000 E Riverview Expy #170,Wisconsin Rapids,WI 54494 ");
                }



            }
        });






























                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            DialogFragment myFragment = new MyDialogFragment();
            myFragment.show(getFragmentManager(),"the Dialog");

            return true;
        }
        else if (id== R.id.exit_the_app)
        {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
