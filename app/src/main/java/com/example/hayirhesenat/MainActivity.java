package com.example.hayirhesenat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hayirhesenat.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    AccountType manager = AccountType.getAccountType();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manager.tur =1;
                Intent intent = new Intent(MainActivity.this, LoginType1Activity.class);
                startActivity(intent);
            }
        });
        binding.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manager.tur = 2;
                Intent intent = new Intent(MainActivity.this, LoginType1Activity.class);
                startActivity(intent);
            }
        });
        binding.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manager.tur = 3;
                Intent intent = new Intent(MainActivity.this, LoginType1Activity.class);
                startActivity(intent);
            }
        });
        binding.btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manager.tur = 4;
                Intent intent = new Intent(MainActivity.this, LoginType1Activity.class);
                startActivity(intent);
            }
        });
    }
}