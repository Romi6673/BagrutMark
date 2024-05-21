package com.example.bagrutmark;


import androidx.appcompat.app.AppCompatActivity;


import android.widget.TextView;
import android.content.Intent;


import android.os.Bundle;

public class thirdActivity extends AppCompatActivity {
    TextView englishUnits;
    TextView englishGrade;
    TextView mathUnits;
    TextView mathGrade;
    TextView extraSubject1UnitsTV;
    TextView extraSubject1GradeTV;
    TextView extraSubject2UnitsTV;
    TextView extraSubject2GradeTV;
    TextView extraSubject3UnitsTV;
    TextView extraSubject3GradeTV;
    TextView lashon3Units;
    TextView lashon3Grade;
    TextView safrut3Units;
    TextView safrut3Grade;
    TextView history3Units;
    TextView history3Grade;
    TextView ezrahut3Units;
    TextView ezrahut3Grade;
    TextView tanach3Units;
    TextView tanach3Grade;
    TextView extraSubject1TV;
    TextView extraSubject2TV;
    TextView extraSubject3TV;
    TextView averageTV;
    Intent ti = getIntent();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent ti = getIntent();
        Intent hi=getIntent();

        int EnglishUnitsInt = ti.getIntExtra("EnglishUnits", 0);
        int EnglishGradeInt = ti.getIntExtra("EnglishGrade", 0);
        int MathUnitsInt = ti.getIntExtra("MathUnits", 0);
        int MathGradeInt = ti.getIntExtra("MathGrade", 0);
        int extraSubject1UnitsInt = ti.getIntExtra("extraSubject1Units", 0);
        int extraSubject1GradeInt = ti.getIntExtra("extraSubject1Grade", 0);
        int extraSubject2UnitsInt = ti.getIntExtra("extraSubject2Units", 0);
        int extraSubject2GradeInt = ti.getIntExtra("extraSubject2Grade", 0);
        int extraSubject3UnitsInt = ti.getIntExtra("extraSubject3Units", 0);
        int extraSubject3GradeInt = ti.getIntExtra("extraSubject3Grade", 0);

        int lashonUInt = hi.getIntExtra("lashonU", 0);
        int lashonGInt =hi.getIntExtra("lashonG", 0);
        int safrutUInt = hi.getIntExtra("safrutU", 0);
        int safrutGInt = hi.getIntExtra("safrutG", 0);
        int historyUInt = hi.getIntExtra("historyU", 0);
        int historyGInt = hi.getIntExtra("historyG", 0);
        int ezrahutUInt = hi.getIntExtra("ezrahutU", 0);
        int ezrahutGInt = hi.getIntExtra("ezrahutG", 0);
        int tanachUInt = hi.getIntExtra("tanachU", 0);
        int tanachGInt = hi.getIntExtra("tanachG", 0);
        String userName =hi.getStringExtra("userName");
        String extraSubject1ST =hi.getStringExtra("extraSubject1");
        String extraSubject2ST = hi.getStringExtra("extraSubject2");
        String extraSubject3ST = hi.getStringExtra("extraSubject3");


        englishUnits = findViewById(R.id.englishUnits);
        englishGrade = findViewById(R.id.englishGrade);
        mathUnits = findViewById(R.id.mathUnits);
        mathGrade = findViewById(R.id.mathGrade);
        extraSubject1UnitsTV = findViewById(R.id.extraSubject1UnitsTV);
        extraSubject1GradeTV = findViewById(R.id.extraSubject1GradeTV);
        averageTV =findViewById(R.id.averageTV);
        extraSubject2UnitsTV = findViewById(R.id.extraSubject2UnitsTV);
        extraSubject2GradeTV = findViewById(R.id.extraSubject2GradeTV);
        extraSubject3UnitsTV = findViewById(R.id.extraSubject3UnitsTV);
        extraSubject3GradeTV = findViewById(R.id.extraSubject3GradeTV);
        lashon3Units = findViewById(R.id.lashon3Units);
        lashon3Grade = findViewById(R.id.lashonGrade);
        safrut3Units = findViewById(R.id.safrut3Units);
        safrut3Grade = findViewById(R.id.safrut3Grade);
        history3Units = findViewById(R.id.history3Units);
        history3Grade = findViewById(R.id.history3Grade);
        ezrahut3Units = findViewById(R.id.ezrahut3Units);
        ezrahut3Grade = findViewById(R.id.ezrahut3Grade);
        tanach3Units = findViewById(R.id.tanach3Units);
        tanach3Grade = findViewById(R.id.tanach3Grade);
        extraSubject1TV = findViewById(R.id.extraSubject1TV);
        extraSubject2TV = findViewById(R.id.extraSubject2TV);
        extraSubject3TV = findViewById(R.id.extraSubject3TV);


        if (MathUnitsInt==4){
            MathUnitsInt+=10;
        }else if (MathUnitsInt==5){
            MathUnitsInt+=20;
        }

        int totalUnits = extraSubject1UnitsInt + extraSubject2UnitsInt + extraSubject3UnitsInt + lashonUInt + safrutUInt + ezrahutUInt + tanachUInt + historyUInt + MathUnitsInt + EnglishUnitsInt;

        int sumForEvulatedAverage=(extraSubject1GradeInt*extraSubject1UnitsInt)+(extraSubject2GradeInt*extraSubject2UnitsInt)
               +(lashonGInt*lashonUInt)+(safrutGInt*safrutUInt)+(ezrahutGInt*ezrahutUInt)+
                (tanachGInt*tanachUInt)+(historyGInt*historyUInt)+(MathGradeInt*MathUnitsInt)+(EnglishGradeInt*EnglishUnitsInt);
        int evulatedAverage=sumForEvulatedAverage/totalUnits;



        englishUnits.setText(EnglishUnitsInt+"");
        englishGrade.setText(EnglishGradeInt+"");
        mathUnits.setText(MathUnitsInt+"");
        mathGrade.setText(MathGradeInt+"");
        extraSubject1UnitsTV.setText("" + extraSubject1UnitsInt);
        extraSubject1GradeTV.setText("" + extraSubject1GradeInt);
        extraSubject2UnitsTV.setText("" + extraSubject2UnitsInt);
        extraSubject2GradeTV.setText("" + extraSubject2GradeInt);
        extraSubject3UnitsTV.setText("" + extraSubject3UnitsInt);
        extraSubject3GradeTV.setText("" + extraSubject3GradeInt);

        averageTV.setText("הממוצע המשוכלל שלך הוא : "+evulatedAverage);
        lashon3Units.setText(lashonUInt+"");
            lashon3Grade.setText(lashonGInt+"");
            safrut3Units.setText(safrutUInt+"");
            safrut3Grade.setText(safrutGInt+"");
            history3Units.setText(historyUInt+"");
            history3Grade.setText(historyGInt+"");
            ezrahut3Units.setText(ezrahutUInt+"");
            ezrahut3Grade.setText(ezrahutGInt+"");
            tanach3Units.setText(tanachUInt+"");
            tanach3Grade.setText(tanachGInt+"");
            extraSubject1TV.setText(extraSubject1ST);
            extraSubject2TV.setText(extraSubject2ST);
            extraSubject3TV.setText(extraSubject3ST);


    }
}