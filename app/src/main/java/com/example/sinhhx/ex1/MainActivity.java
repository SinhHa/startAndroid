package com.example.sinhhx.ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    EditText email ;
    EditText CheckPhone;
    String checkString;
    String phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                email = (EditText)findViewById(R.id.Text3);
                CheckPhone = (EditText)findViewById(R.id.Text4);
              checkString = email.getText().toString().trim();
                phone= CheckPhone.getText().toString().trim();
                if ((checEmail(checkString)==false)) {
                    Toast.makeText(getApplicationContext(),
                            "Wrong Email Format", Toast.LENGTH_SHORT)
                            .show();
                }
                if(checkPhone(phone)==false){
                    Toast.makeText(getApplicationContext(),
                            "Invalid phone number", Toast.LENGTH_SHORT)
                            .show();
                }

                else{
                    Toast.makeText(getApplicationContext(),
                            "success", Toast.LENGTH_SHORT)
                            .show();
                    CallStep2();
                }

            }
        });
    }
    public boolean checEmail(String mail){
        String emailRegex ="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if(mail.matches(emailRegex))
        {
            return true;
        }
        return false;
    }
    public boolean checkPhone(String phone){
        String regix="^[0-9]{10,13}$";
        if(phone.matches(regix)){
            return true;
        }
        else return false;
    }
    public void CallStep2(){

        startActivity(new Intent(MainActivity.this, SignupStep2.class));
    }

        }



