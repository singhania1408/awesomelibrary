package com.pramvi.librarytry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.singhania1408.awesomelibrary.AwesomeLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AwesomeLibrary.getInstance().functionToast(this,"Singhania");
    }
}
