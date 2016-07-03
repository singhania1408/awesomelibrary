package com.example.awesomelibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by mrsinghania on 3/7/16.
 */
public class AwesomeLibrary
{
    private static AwesomeLibrary ourInstance = new AwesomeLibrary();

    public static AwesomeLibrary getInstance() {
        return ourInstance;
    }

    private AwesomeLibrary() {
    }

    public void functionToast(Context context,String data)
    {
        Toast.makeText(context, "Awesome "+data, Toast.LENGTH_LONG).show();
    }
}
