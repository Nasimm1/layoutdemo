package com.smartgreenhouse2.smartgreenhouse2;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class menu extends ListActivity {
    String myClass[] = {"MainActivity", "splash", "login"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setListAdapter( new ArrayAdapter<String>( menu.this, R.layout.support_simple_spinner_dropdown_item, myClass ) );
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick( l, v, position, id );
        String whichClass = myClass[position];
        try {

            Class ourClass = Class.forName( "com.smartgreenhouse2.smartgreenhouse2." + whichClass );
            Intent openActivity = new Intent();
            startActivity( openActivity );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
