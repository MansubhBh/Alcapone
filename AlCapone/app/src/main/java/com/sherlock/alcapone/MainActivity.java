package com.sherlock.alcapone;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner1 = (Spinner) findViewById(R.id.countrySpinner);
        Spinner spinner2 = (Spinner) findViewById(R.id.levelSpinner);
        Spinner spinner3 = (Spinner) findViewById(R.id.courseSpinner);


        ArrayAdapter<CharSequence> countryAdapter = ArrayAdapter.createFromResource(this,
                R.array.country_list, android.R.layout.simple_spinner_item);
        countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(countryAdapter);

        ArrayAdapter<CharSequence> levelAdapter = ArrayAdapter.createFromResource(this,
                R.array.level_list, android.R.layout.simple_spinner_item);
        countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(levelAdapter);

        ArrayAdapter<CharSequence> courseAdapter = ArrayAdapter.createFromResource(this,
                R.array.course_list, android.R.layout.simple_spinner_item);
        countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(courseAdapter);






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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
