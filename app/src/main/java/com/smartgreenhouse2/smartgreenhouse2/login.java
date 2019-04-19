package com.smartgreenhouse2.smartgreenhouse2;

import android.app.Activity;
import android.content.Intent;
import android.database.CursorJoiner;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class login extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );

        Intent i = new Intent( login.this , MainActivity.class );
        startActivity( i );
    }

}
