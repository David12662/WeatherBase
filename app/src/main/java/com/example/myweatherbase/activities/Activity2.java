package com.example.myweatherbase.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;


import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;


import com.example.myweatherbase.R;
import com.example.myweatherbase.base.BaseActivity;

public class Activity2 extends BaseActivity {

    private ImageView iv;

    private Button boton;

    private TextView tv;

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActivityResultLauncher<Intent> resultLauncher=registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),result->{
        });
        iv=findViewById(R.id.ivCiudad);
        tv=findViewById(R.id.tvEleccion);
        boton=findViewById(R.id.pboton);
        spinner=findViewById(R.id.spinner);
        spinner.setAdapter(new ArrayAdapter<>(this,R.layout.spinner_item,R.id.spitem,Ciudad.values()));
        boton.setOnClickListener(view -> {
            Intent intent=new Intent(this, MainActivity.class);
        });
    }
}