package com.example.user.calculator_11609043;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button max,min;
    private TextView result;
    EditText num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        add=(Button)findViewById(R.id.button1);
        sub=(Button)findViewById(R.id.button2);
        mul  =(Button)findViewById(R.id.button3);
        div=(Button)findViewById(R.id.button4);
        max =(Button)findViewById(R.id.button5);
        min=(Button)findViewById(R.id.button6);
        result=(TextView)findViewById(R.id.text);




        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
       div.setOnClickListener(this);
        max.setOnClickListener(this);
        min.setOnClickListener(this);



    }



    @Override
    public void onClick(View v){
        String numb1 = num1.getText().toString();
        String numb2 = num2.getText().toString();
        num1 = Double.parseDouble(numb1);
        num2 = Double.parseDouble(numb2);

        int i = v.getId();
        if (i==R.id.button){
            result = num1 + num2;
        }else if (i==R.id.button2){
            result = num1 - num2;
        }
        else if (i==R.id.button3){
                result = num1/num2;


        }
        else if (i==R.id.button4){
            result = num1 * num2;
        }
        else if (i==R.id.button5){
            result = Math.max(num1,num2);
        }
        else if (i==R.id.button6){
            result = Math.min(num1,mun2);
        }
        result.setText(String.valueOf(result));
    }

}
}
