package com.example.hayirhesenat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.hayirhesenat.databinding.ActivitySignInType3Binding;

public class SignInType3Activity extends AppCompatActivity {
    ActivitySignInType3Binding binding;
    UserManager userManager = UserManager.getUserManager();
    EditText name;
    EditText surname;
    EditText tc;
    EditText password;
    Button login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignInType3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        name = binding.etName;
        surname = binding.etSurname;
        tc = binding.etTc;
        password = binding.etSoru1;
        login = binding.btnRegister;
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Doner doner = new Doner();
                doner.setName(name.getText().toString());
                doner.setSurName(surname.getText().toString());
                doner.setTc(tc.getText().toString());
                doner.setPassword(password.getText().toString());
                User user = new User();
                user.doners.add(doner);
                userManager.addUser(user);
                Intent intent = new Intent(SignInType3Activity.this, LoginType1Activity.class);
                startActivity(intent);
            }
        });
    }
}