package com.example.zuoye;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

public class guanliyuan extends AppCompatActivity implements View.OnClickListener /*implements View.OnClickListener*/ {
    Button chengjiluru,xinwenluru,shangpinluru;
    LinearLayout chaxunlayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guanliyuan);
        intView();
        intevent();

    }



    private void intView() {
        chengjiluru = findViewById(R.id.chengjiluru1);
        xinwenluru =findViewById(R.id.xinwenluru1);
        shangpinluru = findViewById(R.id.shangpinluru1);
        chaxunlayout = findViewById(R.id.chaxunlayout);


    }

    private void intevent() {
       chengjiluru.setOnClickListener(this);
       xinwenluru.setOnClickListener(this);
       shangpinluru.setOnClickListener(this);
       chaxunlayout.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.chengjiluru1:
                Intent i1 =new Intent(this, com.example.zuoye.chengjiluru.class);
                startActivity(i1);
                break;
            case R.id.xinwenluru1:
                Intent i2 =new Intent(this, com.example.zuoye.xinwenluru.class);
                startActivity(i2);
                break;
            case R.id.shangpinluru1:
                Intent i3 =new Intent(this, com.example.zuoye.shangpinluru.class);
                startActivity(i3);
                break;
            case R.id.chaxunlayout:
                Intent i4 =new Intent(this,chaxun.class);
                startActivity(i4);
                break;



        }

    }
}
