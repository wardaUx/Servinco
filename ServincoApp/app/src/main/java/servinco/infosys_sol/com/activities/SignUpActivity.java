package servinco.infosys_sol.com.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import servinco.infosys_sol.com.R;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSignUpCont,btnSignUp,btnSignIn;
    EditText edtTxtRegEmail,edtTxtRegUsername,edtTxtRegPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initViews();
    }

    private void initViews() {

        btnSignUpCont = findViewById(R.id.btnSignUpContin);
        btnSignUp = findViewById(R.id.btnSignUp);
        btnSignIn = findViewById(R.id.btnSignIn);
        edtTxtRegEmail = findViewById(R.id.edtTxtRegEmail);
        edtTxtRegUsername = findViewById(R.id.edtTxtRegUsername);
        edtTxtRegPassword = findViewById(R.id.edtTxtRegPassword);

    }


    @Override
    public void onClick(View incomingView) {
        switch(incomingView.getId()){

            case R.id.btnSignUpContin:
                Toast.makeText(this, "SignUp Successful", Toast.LENGTH_SHORT).show();
        }
    }
}






































//    public void gotToSignIn(View view) {
//
//        startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
//
//    }