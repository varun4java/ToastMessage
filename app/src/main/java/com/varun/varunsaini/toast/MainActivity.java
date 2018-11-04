package com.varun.varunsaini.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt=(EditText)findViewById(R.id.editText);

    }

    public void ok(View view) {
        str=edt.getText().toString();
        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();
    }
}
