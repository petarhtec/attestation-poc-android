package com.example.attestationpoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnBtnAtClick(View v) {
        TextView responseBox = (TextView) findViewById(R.id.txtViewResponse);
        responseBox.setText("Button send request with AT was clicked.");
    }

    public void OnBtnNoAtClick(View v) {
        TextView responseBox = (TextView) findViewById(R.id.txtViewResponse);
        responseBox.setText("Button send request without AT was clicked.");
    }

    public void OnBtnFakeAtClick(View v) {
        TextView responseBox = (TextView) findViewById(R.id.txtViewResponse);
        responseBox.setText("Button send request with fake AT was clicked.");
    }
}