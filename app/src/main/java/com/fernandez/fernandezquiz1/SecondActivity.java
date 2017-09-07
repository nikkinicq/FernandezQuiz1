package com.fernandez.fernandezquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button btn_Home;
    Button btn_ITProgram;
    Button btn_ISProgram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn_Home = (Button) findViewById(R.id.btnHome);
        btn_ITProgram = (Button) findViewById(R.id.btnIT);
        btn_ISProgram = (Button) findViewById(R.id.btnIS);
    }

    public void callMainActivity (View view) {
        Intent intent = new Intent(this, MainActivity.class);
    }

    public void callThirdActivity (View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    public void callFourthActivity (View view) {
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }
}
