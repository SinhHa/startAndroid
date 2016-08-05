package com.example.sinhhx.ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class SignupStep2 extends AppCompatActivity implements OnSeekBarChangeListener {
SeekBar seekbar1;
TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_step2);
        seekbar1 = (SeekBar)findViewById(R.id.SeekerBar);
        textview = (TextView)findViewById(R.id.Textview1);
        seekbar1.setProgress(0);
        seekbar1.setOnSeekBarChangeListener(this);

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
    int value;


        i = ((int)Math.round(i/100))*100;
        seekBar.setProgress(i);
        textview.setText("Your Salary is:"+i);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
