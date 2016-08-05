package com.example.sinhhx.ex1;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

/**
 * Created by sinhhx on 8/5/16.
 */
public class Activity2 extends AppCompatActivity {
    EditText email ;
    EditText CheckPhone;
    String checkString;
    String phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}