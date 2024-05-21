package com.example.bagrutmark;

import androidx.appcompat.app.AppCompatActivity;


import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText userName;
    EditText lashonUnits;
    EditText lashonGrade;
    EditText safrutUnits;
    EditText safrutGrade;
    EditText historyUnits;
    EditText historyGrade;
    EditText ezrahutUnits;
    EditText ezrahutGrade;
    EditText tanachUnits;
    EditText tanachGrade;
    Toast ts;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = findViewById(R.id.userName);
        lashonUnits = findViewById(R.id.lashonUnits);
        lashonGrade = findViewById(R.id.lashonGrade);
        safrutUnits = findViewById(R.id.safrut3Units);
        safrutGrade = findViewById(R.id.safrutGrade);
        historyUnits = findViewById(R.id.historyUnits);
        historyGrade = findViewById(R.id.historyGrade);
        ezrahutUnits = findViewById(R.id.ezrahutUnits);
        ezrahutGrade = findViewById(R.id.ezrahutGrade);
        tanachUnits = findViewById(R.id.tanachUnits);
        tanachGrade = findViewById(R.id.tanachGrade);
    }
    public void go(View view) {

        if (userName.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }

        if (lashonUnits.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }

        if (lashonGrade.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }

        if (safrutUnits.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }

        if (safrutGrade.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }

        if (historyUnits.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }

        if (historyGrade.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }

        if (ezrahutUnits.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }

        if (ezrahutGrade.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }

        if (tanachUnits.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }

        if (tanachGrade.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }



        Intent si = new Intent(this,secondActivity.class);

        String UserNameST= userName.getText().toString();

        String luST= lashonUnits.getText().toString();
        int lashonU=Integer.parseInt(luST);
        String lgST= lashonGrade.getText().toString();
        int lashonG=Integer.parseInt(lgST);
        String suST= safrutUnits.getText().toString();
        int safrutU=Integer.parseInt(suST);
        String sgST= safrutGrade.getText().toString();
        int safrutG=Integer.parseInt(sgST);
        String huST= historyUnits.getText().toString();
        int historyU=Integer.parseInt(huST);
        String hgST= historyGrade.getText().toString();
        int historyG=Integer.parseInt(hgST);

        String euST= ezrahutUnits.getText().toString();
        int ezrahutU=Integer.parseInt(euST);
        String egST= ezrahutGrade.getText().toString();
        int ezrahutG=Integer.parseInt(egST);
        String tuST= tanachUnits.getText().toString();
        int tanachU=Integer.parseInt(tuST);
        String tgST= tanachGrade.getText().toString();
        int tanachG=Integer.parseInt(tgST);

        si.putExtra("lashonU",lashonU);
        si.putExtra("lashonG",lashonG);
        si.putExtra("safrutU",safrutU);
        si.putExtra("safrutG",safrutG);
        si.putExtra("historyU",historyU);
        si.putExtra("historyG",historyG);
        si.putExtra("ezrahutU",ezrahutU);
        si.putExtra("ezrahutG",ezrahutG);
        si.putExtra("tanachU",tanachU);
        si.putExtra("tanachG",tanachG);
        si.putExtra("userName",UserNameST);
        startActivity(si);

    }

}