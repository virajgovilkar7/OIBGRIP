package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView3);
        editText = findViewById(R.id.editText);
    }
    public void calculate(View view){
        Toast.makeText(this, "Calculated", Toast.LENGTH_SHORT).show();
        String s = editText.getText().toString();
        int kg = Integer.parseInt(s);
        float pound = (float) (2.205 * kg);
        textView.setText("The corrsponding value in pounds is: " + pound);
    }
}
