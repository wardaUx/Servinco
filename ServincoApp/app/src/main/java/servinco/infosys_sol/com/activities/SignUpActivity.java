package servinco.infosys_sol.com.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import servinco.infosys_sol.com.R;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void gotToSignIn(View view) {

        startActivity(new Intent(SignUpActivity.this, SignInActivity.class));

    }
}
