package com.example.easyticket1;

import androidx.annotation.NonNull;
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

public class crear_cuenta_activity extends AppCompatActivity {
    private FirebaseAuth auth;
    Button btn;
    EditText etEmail, etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);

        auth = FirebaseAuth.getInstance();
        btn = findViewById(R.id.btn_crear);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();

                auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(crear_cuenta_activity.this,
                        new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(crear_cuenta_activity.this,
                                        "Usuario creado correctamente", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent (crear_cuenta_activity.this, login_activity.class));
                                finish();
                            }
                            else{
                                Toast.makeText(crear_cuenta_activity.this,
                                        "Error al crear usuario", Toast.LENGTH_SHORT).show();
                            }
                            }
                        });
                //Intent intent = new Intent(getApplicationContext(), menu_activity.class);
                //startActivity(intent);
            }
        });
    }
}