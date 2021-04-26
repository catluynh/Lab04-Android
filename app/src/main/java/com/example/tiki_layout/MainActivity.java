package com.example.tiki_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SendingData{
    TextView tvThanhTienMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.save);

        tvThanhTienMain=findViewById(R.id.tvThanhTienMain);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frmContainerBellow,FragmentBelow.newInstance("0"))
                .commit();
    }

    @Override
    public void sendData(String data) {
        tvThanhTienMain.setText(data);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frmContainerBellow,FragmentBelow.newInstance(data))
                .commit();
    }
}