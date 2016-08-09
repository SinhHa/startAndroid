package com.example.sinhhx.ex1;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class SignupStep2 extends AppCompatActivity implements OnSeekBarChangeListener {
SeekBar seekbar1;
TextView textview;
CheckBox ChkFootball;
    CheckBox ChkTennis;
    CheckBox ChkPingPong;
    CheckBox ChkSwimming;
    CheckBox ChkVolleyBall;
    CheckBox ChkBasketBall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_step2);
        seekbar1 = (SeekBar)findViewById(R.id.SeekerBar);
        textview = (TextView)findViewById(R.id.Textview1);
        seekbar1.setProgress(0);
        seekbar1.setOnSeekBarChangeListener(this);
        final Button finalBtn= (Button)findViewById(R.id.Donebtn);
        finalBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                ChkFootball=(CheckBox)findViewById(R.id.Football);
                ChkTennis=(CheckBox)findViewById(R.id.Tennis);
                ChkPingPong=(CheckBox)findViewById(R.id.PingPong);
                ChkSwimming=(CheckBox)findViewById(R.id.Swimming);
                ChkVolleyBall=(CheckBox)findViewById(R.id.VolleyBall);
                ChkBasketBall=(CheckBox)findViewById(R.id.BasketBall);
                Boolean BoxTicked = false;
                if(ChkFootball.isChecked()){
                    BoxTicked =true;
                }
                if(ChkTennis.isChecked()){
                    BoxTicked =true;
                }

                if(ChkPingPong.isChecked()){
                    BoxTicked =true;
                }

                if(ChkSwimming.isChecked()){
                    BoxTicked =true;
                }

                if(ChkVolleyBall.isChecked()){
                    BoxTicked =true;
                }

                if(ChkBasketBall.isChecked()){
                    BoxTicked =true;
                }
            if(BoxTicked==true){
                finish();
                System.exit(0);
            }
                else{
                Context context = getApplicationContext();
                Toast.makeText(context, "Please Select one kind of sport",
                    Toast.LENGTH_LONG).show();}


            }
        });



    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
    int value;


        i = ((int)Math.round(i/100))*100;
        seekBar.setProgress(i);
        textview.setText("Your Salary is:"+i+"Dollars");
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

}
