package calulator.android.akademiakodu.pl.calculator;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.nio.BufferUnderflowException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {



    @BindView(R.id.num1)
    public EditText num1;
    @BindView(R.id.num2)
    public EditText num2;

    @BindView(R.id.plus)
    public Button plus;

    @BindView(R.id.minus)
    public Button minus;

    @BindView(R.id.divide)
    public Button divide;

    @BindView(R.id.multiply)
    public Button multiply;

    @BindView(R.id.result)
    TextView result;


    public Double n1;
    public Double n2;
    public double r;


    private boolean isChanged =true;
    private View v;
    public double[] intValues = {0,0};


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    //private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);




       // num1 = (EditText) findViewById(R.id.num1);
     //   num2 = (EditText) findViewById(R.id.num2);


     //   plus = (Button) findViewById(R.id.plus);
    //    minus = (Button) findViewById((R.id.minus));
     //   multiply = (Button) findViewById((R.id.multiply));
      //  divide = (Button) findViewById((R.id.divide));
       // result = (TextView) findViewById(R.id.result);





       // plus.setOnClickListener(this);
       // minus.setOnClickListener(this);
      //  divide.setOnClickListener(this);
      //  multiply.setOnClickListener(this);



    }

   // int[] intValues = {0,0};
    public double[] getValueFromEditText(EditText num1,EditText num2)
    {
        n1 = Double.valueOf(num1.getText().toString());
        n2 = Double.valueOf(num2.getText().toString());

        intValues[0] = n1;
        intValues[1] = n2;

       return intValues;


    }



    @OnClick(R.id.plus) void plus (){
    //   if(plus.getId() == v.getId())
          getValueFromEditText(num1,num2);
         r=intValues[0]+intValues[1];

    }

    @OnClick(R.id.minus) void minus ()
    {
        //if(minus.getId() == v.getId())
            getValueFromEditText(num1,num2);
        r=intValues[0]-intValues[1];



    }

    @OnClick(R.id.divide) void divide() {
        getValueFromEditText(num1, num2);

        if(intValues[0]==0 || intValues[1]==0)
        {
            Toast.makeText(this, " nie mozna dzielic przez zero!!", Toast.LENGTH_LONG).show();
        }
        else
            r = intValues[0] / intValues[1];



    }


        @OnClick(R.id.multiply) void multiply() {

            getValueFromEditText(num1,num2);
            r=intValues[0]*intValues[1];
        }




    @OnClick(R.id.resultButton) void  resultButton()
    {

            result.setText(Double.toString(r));

        }










}
