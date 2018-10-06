package servinco.infosys_sol.com.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import servinco.infosys_sol.com.R;

public class ForgetPasswordActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnForgetPassword;
    EditText edtTxtForgetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        initViews();
    }

    private void initViews(){

        btnForgetPassword =  findViewById(R.id.btnForgetPassword);
        edtTxtForgetPassword =  findViewById(R.id.edtTxtForgetPassword);

        btnForgetPassword.setOnClickListener(ForgetPasswordActivity.this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btnForgetPassword:{
                Toast.makeText(this, "Reset Your password now ", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(ForgetPasswordActivity.this,ResetPasswordActivity.class));
                break;
            }
        }
    }
}
