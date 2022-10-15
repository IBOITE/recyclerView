package com.ibo.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class InfoActivity extends AppCompatActivity {
    TextView textView,textView1,textView2;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        textView=findViewById(R.id.nameID);
        textView1=findViewById(R.id.DescID);
        textView2=findViewById(R.id.ageID);

        bundle=getIntent().getExtras();

        textView.setText(bundle.getString("name"));
        textView1.setText(bundle.getString("description"));
        textView2.setText(bundle.getString("age"));

    }
}