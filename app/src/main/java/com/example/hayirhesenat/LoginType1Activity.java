package com.example.hayirhesenat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.hayirhesenat.databinding.ActivityLoginType1Binding;

public class LoginType1Activity extends AppCompatActivity {
    private ActivityLoginType1Binding binding;
    UserManager userManager = UserManager.getUserManager();
    EditText tc;
    Button login;
    EditText password;
    AccountType manager = AccountType.getAccountType();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginType1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        tc = binding.username;
        password = binding.password;
        login = binding.loginbtn;
        if (manager.tur == 2){
            binding.signin.setText("Günüllü Girişi Yap");
        }else if (manager.tur == 3) {
            binding.signin.setText("Bağışlayan Girişi Yap");
        } else if (manager.tur == 4) {
            binding.signin.setText("Yönetici Girişi Yap");
        } else if (manager.tur == 1) {
            binding.signin.setText("Yardım Alan Girişi Yap");
        }
        binding.forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (manager.tur == 1 ) {
                    Intent intent = new Intent(LoginType1Activity.this, SignInType1Activity.class);
                    startActivity(intent);
                } else if (manager.tur == 2) {
                    Intent intent = new Intent(LoginType1Activity.this,activity_sign_in_type2.class);
                    startActivity(intent);
                } else if (manager.tur == 3) {
                    Intent intent = new Intent(LoginType1Activity.this, SignInType3Activity.class);
                    startActivity(intent);
                }
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (manager.tur == 1) {
                    Intent intent = new Intent(LoginType1Activity.this,PoorActivity.class);
                    startActivity(intent);
                } else if (manager.tur == 2) {
                    Intent intent = new Intent(LoginType1Activity.this,PoorActivity.class);
                    startActivity(intent);
                } else if (manager.tur == 3) {
                    Intent intent = new Intent(LoginType1Activity.this,PoorActivity.class);
                    startActivity(intent);
                } else if (manager.tur == 4) {
                    Intent intent = new Intent(LoginType1Activity.this,PoorActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}