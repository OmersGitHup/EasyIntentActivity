package com.omerfarukisik.multipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String userName;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName="";
        editText=findViewById(R.id.editText);
    }

    public void changeActivity(View view){
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }
}