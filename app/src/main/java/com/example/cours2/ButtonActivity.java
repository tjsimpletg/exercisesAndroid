package com.example.cours2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {


    private Button mBtn3;
    private TextView mTv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mBtn3=findViewById(R.id.btn_3);
        mBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"Button3 a été cliqué",Toast.LENGTH_SHORT).show();
            }
        });

        mTv1=findViewById(R.id.tv_1);
        mTv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"TextView a été cliqué",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void showToast(View view){
        Toast.makeText(this,"Button4 a été cliqué",Toast.LENGTH_SHORT).show();
    }
}