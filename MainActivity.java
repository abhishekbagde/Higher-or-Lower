package com.abhi.higherandlower; // your package name

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void makeToast(String string){
        Toast.makeText(MainActivity.this,string, Toast.LENGTH_LONG).show();
    }
    public void guess(View view){
        EditText editText = (EditText) findViewById(R.id.textEditEnterNumber);
        int  number = Integer.parseInt(editText.getText().toString());
        if (randomNumber < number){
            makeToast("Lower!");
        }
        else if (randomNumber > number){
           makeToast("Higher");
        }
        else {
            makeToast("That's right, Try again!");
            Random random = new Random();
            randomNumber = random.nextInt(20) + 1;
        }
        Log.i("info",editText.getText().toString());
        Log.d("random", "Value: " + Integer.toString(randomNumber));
   }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random = new Random();
        randomNumber = random.nextInt(20) + 1;
    }
}
