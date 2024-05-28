package com.example.hayirhesenat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.hayirhesenat.R;
import com.example.hayirhesenat.databinding.ActivitySignInType1Binding;

public class SignInType1Activity extends AppCompatActivity {
    private ActivitySignInType1Binding binding;
    UserManager userManager = UserManager.getUserManager();
    TextWatcher textWatcher;
    EditText etName;
    EditText etSurName;
    EditText etEmail;
    EditText etPhone;
    EditText etTc;
    EditText etIl;
    EditText etIlce;
    EditText etMahalle;
    EditText etSokak;
    EditText etApartman;
    EditText etKapiNo;
    EditText etOrtalmaGelir;
    EditText etOrtalamaHarcama;
    EditText etAildedekiKisiSayisi;
    EditText etAildekiCocuk;
    EditText cocukEgitim;
    TextView textView;
    Button register;
    RadioButton button1;
    RadioButton button2;
    RadioGroup radioGroup;
    CheckBox checkBox;
    Button ek;
    EditText btnPassword;
    ImageView imageView;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignInType1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        etName = binding.etName;
        etIl = binding.etSehir;
        etEmail = binding.etEmail;
        etApartman = binding.etApt;
        etSurName = binding.etSurname;
        etAildedekiKisiSayisi = binding.etPopulation;
        etPhone = binding.etPhone;
        etTc = binding.etTc;
        etIlce = binding.etIlce;
        etMahalle = binding.etMahalle;
        etSokak = binding.etSokak;
        etKapiNo = binding.etKap;
        etOrtalamaHarcama = binding.etConsume;
        etOrtalmaGelir = binding.etIncome;
        etAildekiCocuk = binding.etChildren;
        cocukEgitim = binding.etEducation;
        radioGroup = binding.radioGroup;
        button1 = binding.radioBtn1;
        button2 = binding.radioBtn2;
        ek = binding.btnEk;
        register = binding.btnRegister;
        btnPassword = binding.etPasswordreal;
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Yoksul yoksul = new Yoksul();
                User user = new User();
                yoksul.setPassword(btnPassword.getText().toString());
                yoksul.setTc(etTc.getText().toString());
                yoksul.setName(etName.getText().toString());
                yoksul.setSurName(etSurName.getText().toString());
                user.yoksuls.add(yoksul);
                userManager.users.add(user);
                Intent intent = new Intent(SignInType1Activity.this, LoginType1Activity.class);
                startActivity(intent);
            }
        });
    }
}