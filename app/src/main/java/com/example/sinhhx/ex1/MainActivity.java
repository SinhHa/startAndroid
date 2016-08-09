package com.example.sinhhx.ex1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText email ;
    EditText CheckPhone;
    EditText Fname;
    EditText Lname;
    String CheckFname;
    String checkString;
    String checkLname;
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
                Fname = (EditText)findViewById(R.id.Text1);
                Lname = (EditText)findViewById(R.id.Text2);
              checkString = email.getText().toString().trim();
                phone= CheckPhone.getText().toString().trim();
                CheckFname =Fname.getText().toString().trim();
                checkLname =Lname.getText().toString().trim();
                if(CheckFname.equals("First name")) {
                    Fname.setError("Invalid First Name");

                }
                if(CheckFname.equals("")) {
                    Fname.setError("You must enter First Name");

                }
                if(checkLname.equals("Last name") ){
                    Lname.setError("Invalid Last Name");
                }
                if(checkLname.equals("")) {
                    Fname.setError("you must enter Last Name");

                }
                if ((checEmail(checkString)==false)) {
                    email.setError("invalid Email");
                }
                if(checkPhone(phone)==false){
                    CheckPhone.setError("invalid phone number");
                }

                else{
                    CallStep2();
                    finish();
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



