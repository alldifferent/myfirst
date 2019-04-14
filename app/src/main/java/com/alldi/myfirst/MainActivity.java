package com.alldi.myfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userIdEdt;
    EditText passwordEdt;
    Button loginBtn;
    TextView wasaviTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userIdEdt = findViewById(R.id.userIdEdt);
        passwordEdt = findViewById(R.id.passwordEdt);
        loginBtn = findViewById(R.id.loginBtn);
        wasaviTxt = findViewById(R.id.wasaviTxt);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userId = userIdEdt.getText().toString();
                String password = passwordEdt.getText().toString();

                Toast.makeText(MainActivity.this, "ID : "+ userId, Toast.LENGTH_SHORT).show();

                wasaviTxt.setText(String.format("ID : %s, PW : %s", userId, password));



            }
        });
    }
}
