package com.example.wardauzair.favrioutesdatabase;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ShowableListMenu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    EditText editTextMail, editTextPassword, editTextUsername;
    Button btnSignUp, btnShow, btnGoLogin;
   DBMS dbms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        dbms = new DBMS(this);
                editTextMail = findViewById(R.id.editTextMail);
        btnGoLogin = findViewById(R.id.btnGoLogin);
                editTextPassword = findViewById(R.id.editTextPassword);
                editTextUsername = findViewById(R.id.editTextUsername);
                btnSignUp = findViewById(R.id.btnSignUp);
                btnShow = findViewById(R.id.btnShow);
        addData();
        show();
        btnGoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }

    public void show(){
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View  v) {
                Cursor ress = dbms.getData();
                 int counttt = ress.getCount();
                Toast.makeText(Signup.this, "int "+counttt, Toast.LENGTH_SHORT).show();
                 if(ress.getCount() == 0 ){
                     showData("ERROR 4004","no data found");
                     return;
                 }



                StringBuffer stringBuffer = new StringBuffer();
                while (ress.moveToNext()){
                    stringBuffer.append("ID "+ ress.getString(0)+"\n");
                    stringBuffer.append("Email "+ ress.getString(1)+"\n");
                    stringBuffer.append("Username "+ress.getString(2)+"\n");
                    stringBuffer.append("Password "+ress.getString(3)+"\n\n");

                }

                showData("DATA", stringBuffer.toString());

            }
        });
    }
    public void showData(String title, String message){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();

    }

    public void addData(){

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View  v) {
                final String  name = editTextMail.getText().toString();
                final String email = editTextPassword.getText().toString();
                final String password = editTextUsername.getText().toString();
                boolean isInserted  = dbms.inserData( name, email, password);
                if(isInserted = true){
                    Toast.makeText(Signup.this, "DATA IS INSERTED", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Signup.this, "NOT", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
