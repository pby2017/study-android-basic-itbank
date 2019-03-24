package com.example.day03.example01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.day03.R;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextId;
    private EditText editTextPw;
    private Button buttonLogin;
    private TextView textPrintId;
    private TextView textPrintPw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();

        setViewOnClickListener();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_login:
                textPrintId.setText("입력하신 아이디는 " + editTextId.getText().toString());
                textPrintPw.setText("입력하신 비밀번호는 " + editTextPw.getText().toString());
                break;
        }
    }

    private void setViewOnClickListener() {
        buttonLogin.setOnClickListener(this);
    }

    private void initView() {
        editTextId = (EditText) findViewById(R.id.edit_text_id);
        editTextPw = (EditText) findViewById(R.id.edit_text_pw);
        buttonLogin = (Button) findViewById(R.id.button_login);
        textPrintId = (TextView) findViewById(R.id.text_print_id);
        textPrintPw = (TextView) findViewById(R.id.text_print_pw);
    }
}
