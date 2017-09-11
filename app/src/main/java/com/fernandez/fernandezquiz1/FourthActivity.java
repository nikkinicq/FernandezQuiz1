package com.fernandez.fernandezquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends AppCompatActivity {

    Button btn_Home;
    Button btn_CSProgram;
    Button btn_ITProgram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        btn_Home = (Button) findViewById(R.id.btnHome);
        btn_CSProgram = (Button) findViewById(R.id.btnCS);
        btn_ITProgram = (Button) findViewById(R.id.btnIT);
    }



    public void callMainActivity (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void callSecondActivity (View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void callThirdActivity (View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}
