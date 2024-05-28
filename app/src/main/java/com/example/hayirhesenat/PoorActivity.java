package com.example.hayirhesenat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.hayirhesenat.databinding.ActivityPoorBinding;

public class PoorActivity extends AppCompatActivity {
    ActivityPoorBinding binding;
    AccountType type = AccountType.getAccountType();
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPoorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        t1 = binding.text;
        if (type.tur == 1) {
            t1.setText("Yardım Alan Menüsü");
        } else if (type.tur == 2) {
            t1.setText("Gönüllü Menüsü");
        } else if (type.tur == 3) {
            t1.setText("Bağışlayan Girişi");
        } else if (type.tur == 4) {
            t1.setText("Yönetici Girişi");
        }
    }
}