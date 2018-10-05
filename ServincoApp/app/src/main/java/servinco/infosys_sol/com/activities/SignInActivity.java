package servinco.infosys_sol.com.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import servinco.infosys_sol.com.R;

import static servinco.infosys_sol.com.apihandlers.RequestHandlerClass.RunningQueue;
import static servinco.infosys_sol.com.commons.Constants.BASE_URL;

public class SignInActivity extends AppCompatActivity {

    String apiEndPoint = "users/signin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        signTheUserIn(apiEndPoint);
    }

    private void signTheUserIn(String apiEndPoint) {

        StringRequest mStringRequest = new StringRequest(1, BASE_URL + apiEndPoint, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
// FIXME here take the response and see if its the user
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
// TODO    here handle if user is unable to reach the url

            }
        });

        RunningQueue(SignInActivity.this, mStringRequest);

    }
}
