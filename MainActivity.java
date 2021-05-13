package com.example.licenseid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.licenseid.dashboard;

public class MainActivity extends AppCompatActivity {

    EditText un;
    EditText pword;

    Button in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        un=(EditText)findViewById(R.id.uname);
        pword=(EditText)findViewById(R.id.pass);

        in = findViewById(R.id.login);

        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Check();
            }
        });
    }
    public void Check(){
        if (un.getText().toString().equals("leey") && pword.getText().toString().equals("022001") ){
            Intent start = new Intent(this, dashboard.class);
            startActivity(start);
        }

        else {
            Toast.makeText(this, "Wrong Username/Password! Please try again!", Toast.LENGTH_LONG).show();
        }
    }
}
