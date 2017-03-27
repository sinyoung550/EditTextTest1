package com.example.tlsdu.edittexttest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1=(EditText)findViewById(R.id.edit1); //강제 형변환 (EditText)<<이거
        Button butOk=(Button)findViewById(R.id.but_ok);
        textResult=(TextView)findViewById(R.id.text_result);

        butOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=edit1.getText().toString();
                textResult.setText("이번우승"+name+"입니다.");
            }
        });
    }
}
