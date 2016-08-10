package com.example.sinhhx.ex1;

import android.content.Context;
import android.content.Intent;
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
    Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        extras= getIntent().getExtras();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_step2);
        seekbar1 = (SeekBar) findViewById(R.id.SeekerBar);
        textview = (TextView) findViewById(R.id.Textview1);
        seekbar1.setProgress(0);
        seekbar1.setOnSeekBarChangeListener(this);
        final Button finalBtn = (Button) findViewById(R.id.Donebtn);
        finalBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                ChkFootball = (CheckBox) findViewById(R.id.Football);
                ChkTennis = (CheckBox) findViewById(R.id.Tennis);
                ChkPingPong = (CheckBox) findViewById(R.id.PingPong);
                ChkSwimming = (CheckBox) findViewById(R.id.Swimming);
                ChkVolleyBall = (CheckBox) findViewById(R.id.VolleyBall);
                ChkBasketBall = (CheckBox) findViewById(R.id.BasketBall);
                Boolean BoxTicked = false;
                if (ChkFootball.isChecked()) {
                    BoxTicked = true;
                }
                if (ChkTennis.isChecked()) {
                    BoxTicked = true;
                }

                if (ChkPingPong.isChecked()) {
                    BoxTicked = true;
                }

                if (ChkSwimming.isChecked()) {
                    BoxTicked = true;
                }

                if (ChkVolleyBall.isChecked()) {
                    BoxTicked = true;
                }

                if (ChkBasketBall.isChecked()) {
                    BoxTicked = true;
                }
                if (BoxTicked == true) {
                    Intent i= new Intent(SignupStep2.this,SignUpStep3.class);
                    if(extras!=null){
                        String phone = getIntentValue(extras,"Phone");
                        String firstname = getIntentValue(extras,"FirstName");
                        String lastname = getIntentValue(extras,"LastName");
                        String email = getIntentValue(extras,"Email");
                        i.putExtra("FirstName",firstname);
                        i.putExtra("LastName",lastname);
                        i.putExtra("Email",email);
                        i.putExtra("Phone",phone);
                        i.putExtra("Salary",seekbar1.getProgress()*100);

                    }

                } else {
                    Context context = getApplicationContext();
                    Toast.makeText(context, "Please Select one kind of sport",
                            Toast.LENGTH_LONG).show();
                }


            }
        });


    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        int value;


        i = i * 100;


        textview.setText("Your Salary is:" + i + "Dollars");
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
    public String getIntentValue(Bundle bundle,String key){
        return bundle.getString(key);

    }

}
