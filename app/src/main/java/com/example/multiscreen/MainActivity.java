package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button click;
    public static TextView data;


    public static final String MSG = "com.codewithkurt.multiscreen.LOGIN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = (Button) findViewById(R.id.ShowButton);
        data = (TextView) findViewById(R.id.Data);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                    fetchData process = new fetchData();
                    process.execute();
            }
        });
    }

    public void Login(View view){

        Intent intent = new Intent(this, LoginActivity.class);
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        String message = editText1.getText().toString() + " " + editText2.getText().toString() + " Checked.";
        intent.putExtra(MSG, message);
        startActivity(intent);
    }
}