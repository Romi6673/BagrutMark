package com.example.bagrutmark;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;

public class secondActivity extends AppCompatActivity {
    EditText EnglishUnits;
    EditText EnglishGrade;
    EditText MathUnits;
    EditText MathGrade;
    EditText extraSubject1Units;
    EditText extraSubject1Grade;
    EditText extraSubject2Grade;
    EditText extraSubject3Grade;
    EditText extraSubject2Units;
    EditText extraSubject3Units;
    EditText extraSubject1;
    EditText extraSubject2;
    EditText extraSubject3;
    Toast ts;
    Button nextBtn;

    int lashonU, lashonG, safrutU, safrutG, historyU, historyG, ezrahutU, ezrahutG, tanachU, tanachG;
    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EnglishUnits = findViewById(R.id.EnglishUnits);
        EnglishGrade = findViewById(R.id.EnglishGrade);
        MathUnits = findViewById(R.id.MathUnits);
        MathGrade = findViewById(R.id.MathGrade);
        extraSubject1Units = findViewById(R.id.extraSubject1Units);
        extraSubject1Grade = findViewById(R.id.extraSubject1Grade);
        extraSubject2Grade = findViewById(R.id.extraSubject2Grade);
        extraSubject3Grade = findViewById(R.id.extraSubject3Grade);
        extraSubject2Units = findViewById(R.id.extraSubject2Units);
        extraSubject3Units = findViewById(R.id.extraSubject3Units);
        extraSubject1 = findViewById(R.id.extraSubject1);
        extraSubject2 = findViewById(R.id.extraSubject2);
        extraSubject3 = findViewById(R.id.extraSubject3);
        nextBtn = findViewById(R.id.nextBtn);

        Intent gi = getIntent();
        lashonU = gi.getIntExtra("lashonU", 0);
        lashonG = gi.getIntExtra("lashonG", 0);
        safrutU = gi.getIntExtra("safrutU", 0);
        safrutG = gi.getIntExtra("safrutG", 0);
        historyU = gi.getIntExtra("historyU", 0);
        historyG = gi.getIntExtra("historyG", 0);
        ezrahutU = gi.getIntExtra("ezrahutU", 0);
        ezrahutG = gi.getIntExtra("ezrahutG", 0);
        tanachU = gi.getIntExtra("tanachU", 0);
        tanachG = gi.getIntExtra("tanachG", 0);
        userName = gi.getStringExtra("userName");


    }

    public void go(View view) {

        if (EnglishUnits.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }

        if (EnglishGrade.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }


        if (MathUnits.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }

        if (MathGrade.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }

        if (extraSubject1Units.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }

        if (extraSubject1Grade.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }

        if (extraSubject2Grade.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }

        if (extraSubject3Grade.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }

        if (extraSubject2Units.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }

        if (extraSubject3Units.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }

        if (extraSubject1.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }


        if (extraSubject2.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }

        if (extraSubject3.getText().toString().isEmpty()) {
            ts = Toast.makeText(getApplicationContext(), "לא ניתן להשאיר את השדה הזה ריק", Toast.LENGTH_SHORT);
            ts.show();
            return;
        }


        int EnglishUnitsValue = Integer.parseInt(EnglishUnits.getText().toString());
        int EnglishGradeValue = Integer.parseInt(EnglishGrade.getText().toString());
        int MathUnitsValue = Integer.parseInt(MathUnits.getText().toString());
        int MathGradeValue = Integer.parseInt(MathGrade.getText().toString());
        int extraSubject1UnitsValue = Integer.parseInt(extraSubject1Units.getText().toString());
        int extraSubject1GradeValue = Integer.parseInt(extraSubject1Grade.getText().toString());
        int extraSubject2UnitsValue = Integer.parseInt(extraSubject2Units.getText().toString());
        int extraSubject2GradeValue = Integer.parseInt(extraSubject2Grade.getText().toString());
        int extraSubject3UnitsValue = Integer.parseInt(extraSubject3Units.getText().toString());
        int extraSubject3GradeValue = Integer.parseInt(extraSubject3Grade.getText().toString());

        String extraSubject1Value = extraSubject1.getText().toString();
        String extraSubject2Value = extraSubject2.getText().toString();
        String extraSubject3Value = extraSubject3.getText().toString();

        Intent ti = new Intent(this, thirdActivity.class);
        ti.putExtra("EnglishUnits", EnglishUnitsValue);
        ti.putExtra("EnglishGrade", EnglishGradeValue);
        ti.putExtra("MathUnits", MathUnitsValue);
        ti.putExtra("MathGrade", MathGradeValue);
        ti.putExtra("extraSubject1Units", extraSubject1UnitsValue);
        ti.putExtra("extraSubject1Grade", extraSubject1GradeValue);
        ti.putExtra("extraSubject2Units", extraSubject2UnitsValue);
        ti.putExtra("extraSubject2Grade", extraSubject2GradeValue);
        ti.putExtra("extraSubject3Units", extraSubject3UnitsValue);
        ti.putExtra("extraSubject3Grade", extraSubject3GradeValue);
        ti.putExtra("extraSubject1", extraSubject1Value);
        ti.putExtra("extraSubject2", extraSubject2Value);
        ti.putExtra("extraSubject3", extraSubject3Value);
        ti.putExtra("lashonU", lashonU);
        ti.putExtra("lashonG", lashonG);
        ti.putExtra("safrutU", safrutU);
        ti.putExtra("safrutG", safrutG);
        ti.putExtra("historyU", historyU);
        ti.putExtra("historyG", historyG);
        ti.putExtra("ezrahutU", ezrahutU);
        ti.putExtra("ezrahutG", ezrahutG);
        ti.putExtra("tanachU", tanachU);
        ti.putExtra("tanachG", tanachG);
        ti.putExtra("userName", userName);

        startActivity(ti);
    }
}
