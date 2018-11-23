package com.example.wardauzair.favrioutesdatabase;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText etPassword, etEmail;
    boolean b;

    DBMS dbms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = findViewById(R.id.btnLogin);
        etEmail = findViewById(R.id.eTEmail);
        etPassword = findViewById(R.id.etPassword);
        dbms = new DBMS(this);
        b=false;
        checkSignIn();

    }

    public void checkSignIn(){

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String emailET = etEmail.getText().toString();
//                String passwordET = etPassword.getText().toString();
//                boolean  b = dbms.loginCheck(emailET, passwordET);
//                if(b)
//                    {
//                        Intent i = new Intent(getApplicationContext(), Signup.class);
//                        startActivity(i);
//                             return;
//                    }else {
//                        Toast.makeText(MainActivity.this, "Email or password is wrong", Toast.LENGTH_SHORT).show();
//
//                    }


                                Cursor cursor = dbms.getData();
                String emailET = etEmail.getText().toString();
                String passwordET = etPassword.getText().toString();
                while (cursor.moveToNext()) {
                    String emailDB = cursor.getString(1);
                    String passwordDB = cursor.getString(3);
                    if (emailET.equals(emailDB) && passwordET.equals(passwordDB)) {
                        Intent i = new Intent(getApplicationContext(), Signup.class);
                        startActivity(i);
                        b = true;
                        break;
                    }
                }
                if (b==false){
                        Toast.makeText(MainActivity.this, "Email or password is wrong", Toast.LENGTH_SHORT).show();
                    }

                    
            }
        });

    }
}
