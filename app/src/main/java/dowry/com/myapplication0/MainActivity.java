package dowry.com.myapplication0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    EditText e2;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View v){
        e1 = (EditText)findViewById(R.id.editText1);
        e2 = (EditText)findViewById(R.id.editText2);
        t1 = (TextView) findViewById(R.id.editText3);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2= Integer.parseInt(e2.getText().toString());
        int sum = num1+num2;
        t1.setText(Integer.toString(sum));

    }

    public void onButtonClick2(View v){
        e1 = (EditText)findViewById(R.id.editText1);
        e2 = (EditText)findViewById(R.id.editText2);
        t1 = (TextView) findViewById(R.id.editText3);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2= Integer.parseInt(e2.getText().toString());
        int sub = num1-num2;
        t1.setText(Integer.toString(sub));

    }

    public void onButtonClick3(View v){
        e1 = (EditText)findViewById(R.id.editText1);
        e2 = (EditText)findViewById(R.id.editText2);
        t1 = (TextView) findViewById(R.id.editText3);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2= Integer.parseInt(e2.getText().toString());
        int mult = num1*num2;
        t1.setText(Integer.toString(mult));

    }


    public void onButtonClick4(View v){
        e1 = (EditText)findViewById(R.id.editText1);
        e2 = (EditText)findViewById(R.id.editText2);
        t1 = (TextView) findViewById(R.id.editText3);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2= Integer.parseInt(e2.getText().toString());
        int div = num1/num2;
        t1.setText(Integer.toString(div));

    }
}
