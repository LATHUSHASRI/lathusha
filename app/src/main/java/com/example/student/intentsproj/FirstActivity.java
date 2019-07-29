package com.example.student.intentsproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    public static final String Number_1 = "1";
    public static final String Number_2 = "2";

    private EditText num1,num2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        num1 = findViewById(R.id.editText);
        num2 = findViewById(R.id.editText2);
    }

    public void sentmsg(View view) {
        String no1=num1.getText().toString();
        String no2=num2.getText().toString();

        Intent intent=new Intent(this,SecondActivity.class);
        intent.putExtra(Number_1,no1);
        intent.putExtra(Number_2,no2);

        startActivity(intent);

    }
}
