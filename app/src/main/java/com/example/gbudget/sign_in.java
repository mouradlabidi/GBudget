package com.example.gbudget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class sign_in extends AppCompatActivity {
    Button signin;
    EditText user_email,user_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        signin=(Button)findViewById(R.id.signin);
        user_email= (EditText) findViewById(R.id.email);
        user_pass= (EditText) findViewById(R.id.password);
        signin.setOnClickListener(new View.OnClickListener() {
            public void login(View view) {
                String user = user_email.getText().toString().trim();
                String pass = user_pass.getText().toString().trim();
                if ((user.isEmpty())) {
                    Toast.makeText(sign_in.this, "Entrer une @ email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (pass.isEmpty()) {
                    Toast.makeText(sign_in.this, "Entrer une password", Toast.LENGTH_SHORT).show();
                    return;
                }
                FirebaseAuth auth = FirebaseAuth.getInstance();
                auth.signInWithEmailAndPassword(user, pass).addOnCompleteListener(
                        task -> {
                            if (task.isSuccessful()) {
                                startActivity(new Intent(getApplicationContext(), Home.class));
                                finish();
                            } else {
                                Toast.makeText(sign_in.this, "Echec " + task.getException(), Toast.LENGTH_SHORT).show();
                            }
                        }
                );
            }

            @Override
            public void onClick(View v) {
                login(v);
            }
        });
    }
}