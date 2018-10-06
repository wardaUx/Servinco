package servinco.infosys_sol.com.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import servinco.infosys_sol.com.R;

import static servinco.infosys_sol.com.apihandlers.RequestHandlerClass.RunningQueue;
import static servinco.infosys_sol.com.commons.Constants.BASE_URL;



public class SignInActivity extends AppCompatActivity implements View.OnClickListener {

    //    the views
    Button btnSignIn, btnForgetPassword;

    EditText edtTxtUserEmail, edtTxtUserPassword;


    String apiEndPoint = "users/signin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        initViews();


        signTheUserIn(apiEndPoint);
    }

    private void signTheUserIn(String apiEndPoint) {

        StringRequest mStringRequest = new StringRequest(1, BASE_URL + apiEndPoint, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
// FIXME here take the response and see if its the user

                // FIXME here take the response and see if its the user
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
// TODO    here handle if user is unable to reach the url

                // TODO    here handle if user is unable to reach the url


            }
        });

        RunningQueue(SignInActivity.this, mStringRequest);

    }


//this will handle all the view registration processes

    private void initViews() {
        btnSignIn = findViewById(R.id.btnSignIn);
        edtTxtUserEmail = findViewById(R.id.edtTxtUserEmail);
        edtTxtUserPassword = findViewById(R.id.edtTxtUserPassword);
        btnForgetPassword = findViewById(R.id.btnForgetPassword);

        btnSignIn.setOnClickListener(SignInActivity.this);
        btnForgetPassword.setOnClickListener(SignInActivity.this);


    }


//    this will handle all the click on clickable views

    @Override
    public void onClick(View incomingView) {

        switch (incomingView.getId()) {

            case R.id.btnSignIn: {
                Toast.makeText(this, "hello signin", Toast.LENGTH_SHORT).show();
//                TODO form Validation
//                TODO check if user has internet connection
//                TODO after validation call the api url to check user in DB
                break;
            }
            case R.id.btnForgetPassword:{
                Toast.makeText(this, "Forget Password", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(SignInActivity.this,ForgetPasswordActivity.class));
                break;
            }

        }
    }
}




