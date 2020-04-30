package com.example.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView mRandomNum;
    private TextView mNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }


    public void initView() {
        mRandomNum = findViewById(R.id.RandomNum);
        mNum = findViewById(R.id.number);
    }

    public void getRandomNumber(View view) {
        int i = Integer.parseInt(mNum.getText().toString());
        int res = new Random().nextInt(i);
        mRandomNum.setText(Integer.toString(res));
    }
}
