package com.loginui.desulohith.khannaserver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSignIn;
    TextView txtSlogan;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignIn = (Button)findViewById(R.id.btnSignIn);
        txtSlogan = (TextView)findViewById(R.id.txtSlogan);


     btnSignIn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent signIn = new Intent(MainActivity.this,Home.class);
             startActivity(signIn);
         }
     });
    }
}
