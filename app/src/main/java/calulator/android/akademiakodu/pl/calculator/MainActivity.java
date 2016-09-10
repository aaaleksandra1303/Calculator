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

public class MainActivity extends Activity implements OnClickListener{



    public EditText num1;
    public EditText num2;
    public Button plus;
    public Button minus;
    public Button divide;
    public Button multiply;
    public TextView result;
    public int n1,n2;
    private Integer r;

    private boolean isChanged =true;




    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById((R.id.minus));
        multiply = (Button) findViewById((R.id.multiply));
        divide = (Button) findViewById((R.id.divide));
        result = (TextView) findViewById(R.id.result);





        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        divide.setOnClickListener(this);
        multiply.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {



       n1 = Integer.valueOf(num1.getText().toString());
       n2 = Integer.valueOf(num2.getText().toString());


        if(isChanged) {

            if (plus.getId() == v.getId()) {
                r = n1 + n2;


            } else if (minus.getId() == v.getId()) {
                r = n1 - n2;
            } else if (multiply.getId() == v.getId()) {
                r = n1 * n2;
            } else if (divide.getId() == v.getId()) {
                r = n1 / n2;
            }
            result.setText(r.toString());



        }



    }






}
