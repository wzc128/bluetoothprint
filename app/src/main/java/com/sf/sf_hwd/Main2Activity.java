package com.sf.sf_hwd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String name = getIntent().getStringExtra("name");
        int code = getIntent().getIntExtra("code",-1);
        Data data = (Data)getIntent().getExtras().get("data");

        System.out.println(name+code);
        System.out.println(data.getName());
    }
}
