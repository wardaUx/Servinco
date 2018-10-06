package servinco.infosys_sol.com.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import servinco.infosys_sol.com.R;

public class ResetPasswordActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtTxtNewPassword,edtTxtConfirmPassword;
    Button btnResetDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        initViews();
    }

    private void initViews(){
        edtTxtNewPassword = findViewById(R.id.edtTxtNewPassword);
        edtTxtConfirmPassword = findViewById(R.id.edtTxtConfirmPassword);
        btnResetDone = findViewById(R.id.btnResetDone);

        btnResetDone.setOnClickListener(ResetPasswordActivity.this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnResetDone:{
                Toast.makeText(this, "Reset Password Successfull", Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }
}
