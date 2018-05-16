package com.example.bob.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity{
    //https://stackoverflow.com/questions/10477375/what-does-classname-class-return
    Intent intent = new Intent(this, SecondActivity.class);
}
