package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.text.TextUtils.isEmpty;

public class MainActivity extends AppCompatActivity {
    Button ebutton;
    EditText etemp;
    TextView eresult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ebutton = findViewById(R.id.ebutton);
        etemp=findViewById(R.id.etemp);
        eresult=findViewById(R.id.eresult);

        ebutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String temp=etemp.getText().toString().trim();
                if(temp.isEmpty()){
                Toast.makeText(MainActivity.this,"Input Not Found",Toast.LENGTH_SHORT).show();
                }
                else{
                    double celsius=0,fahrenheit;
                    fahrenheit=Double.parseDouble(temp);
                    celsius=((fahrenheit-32)*5)/9;
                    String celsius2 = String.format("%.2f",celsius );
                    eresult.setText("You Entered: "+fahrenheit+" °F"+'\n'+"Converted Into "+celsius2+" °C");

                }
            }
        });


    }

}