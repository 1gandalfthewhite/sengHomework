package com.example.hayirhesenat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import com.example.hayirhesenat.databinding.ActivitySignInType2Binding;

public class activity_sign_in_type2 extends AppCompatActivity {
    private ActivitySignInType2Binding binding;
    UserManager userManager = UserManager.getUserManager();
    CheckBox box1;
    CheckBox box2;
    CheckBox box3;
    CheckBox box4;
    CheckBox box5;
    CheckBox box6;
    CheckBox box7;
    EditText edtPass;
    EditText edtTc;
    EditText gun1;
    EditText gun2;
    EditText gun3;
    EditText gun4;
    EditText gun5;
    EditText gun6;
    EditText gun7;
    EditText name;
    EditText surName;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignInType2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        box1 =  binding.check1;
        box2 = binding.check2;
        box3 = binding.check3;
        box4 = binding.check4;
        box5 = binding.check5;
        box6 = binding.check6;
        box7 = binding.check7;
        gun1 = binding.et1;
        gun2 = binding.et2;
        gun3 = binding.et3;
        gun4 = binding.et4;
        gun5 = binding.et5;
        gun6 = binding.et6;
        gun7 = binding.et7;
        edtPass = binding.etSoru1;
        edtTc = binding.etTc;
        name = binding.etName;
        surName = binding.etSurName;
        register = binding.btnRegister;
        box1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    gun1.setVisibility(View.VISIBLE);
                }else{
                    gun1.setVisibility(View.GONE);
                }
            }
        });
        box2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    gun2.setVisibility(View.VISIBLE);
                }else{
                    gun2.setVisibility(View.GONE);
                }
            }
        });
        box3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    gun3.setVisibility(View.VISIBLE);
                }else{
                    gun3.setVisibility(View.GONE);
                }
            }
        });
        box4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    gun4.setVisibility(View.VISIBLE);
                }else{
                    gun4.setVisibility(View.GONE);
                }
            }
        });
        box5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    gun5.setVisibility(View.VISIBLE);
                }else{
                    gun5.setVisibility(View.GONE);
                }
            }
        });
        box6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    gun6.setVisibility(View.VISIBLE);
                }else{
                    gun6.setVisibility(View.GONE);
                }
            }
        });
        box7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    gun7.setVisibility(View.VISIBLE);
                }else{
                    gun7.setVisibility(View.GONE);
                }
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gonullu gonullu = new Gonullu();
                gonullu.setTc(edtTc.getText().toString());
                gonullu.setPassword(edtPass.getText().toString());
                gonullu.setName(name.getText().toString());
                gonullu.setSurName(surName.getText().toString());
                User user = new User();
                user.gonullus.add(gonullu);
                userManager.users.add(user);
                Intent intent = new Intent(activity_sign_in_type2.this, LoginType1Activity.class);
                startActivity(intent);
            }
        });


    }
}