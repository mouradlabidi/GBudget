package com.example.gbudget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class sign_up extends AppCompatActivity {
    Button signup;
    EditText emailup, passwordup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signup = (Button) findViewById(R.id.signup);
        emailup = (EditText) findViewById(R.id.emailup);
        passwordup = (EditText) findViewById(R.id.passwordup);
        signup.setOnClickListener(new View.OnClickListener() {
            public void demarrersignin(View view){
                Intent intent=new Intent(sign_up.this, sign_in.class);
                startActivity(intent);
            }
            public void signup(final View view) {
                String user = emailup.getText().toString().trim();
                String pass = passwordup.getText().toString().trim();
                if ((user.isEmpty())) {
                    Toast.makeText(sign_up.this, "Entrer une @ email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (pass.isEmpty()) {
                    Toast.makeText(sign_up.this, "Entrer une password", Toast.LENGTH_SHORT).show();
                    return;
                }
                FirebaseAuth auth = FirebaseAuth.getInstance();
                auth.createUserWithEmailAndPassword(user, pass).addOnCompleteListener(
                        new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(sign_up.this, "compte creer avec succes, " +
                                            "Login pour continuer", Toast.LENGTH_SHORT).show();
                                    demarrersignin(view);

                                }
                                else {
                                    Toast.makeText(sign_up.this, "Echec " + task.getException(), Toast.LENGTH_SHORT).show();
                                }
                            }

                        }
                );
            }

            @Override
            public void onClick(View v) {
                signup(v);

            }

        });
    }
}