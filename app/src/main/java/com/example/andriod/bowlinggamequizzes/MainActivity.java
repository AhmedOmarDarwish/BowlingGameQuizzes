package com.example.andriod.bowlinggamequizzes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.security.acl.Group;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    int Score = 0;
    RadioGroup RadioGroup1, RadioGroup2, RadioGroup3, RadioGroup4, RadioGroup5, RadioGroup6, RadioGroup7, RadioGroup8, RadioGroup9;
    CheckBox checkbox1, checkbox2, checkbox3, checkbox4;

    public void Submit(View view) {
        G1( view );
        G2( view );
        G3( view );
        G4( view );
        G5( view );
        G6( view );
        G7( view );
        G8( view );
        G9( view );
        CheckBoxes( view );
        displayScore( Score );
        EditText name = (EditText) findViewById( R.id.name_field );
        Toast toast = Toast.makeText( getApplicationContext(), "Welcome " + name.getText() + ",Your Score Is " + Score, Toast.LENGTH_LONG );
        toast.show();
        Score = 0;

    }

    public void Clear(View v) {
        RadioGroup1.clearCheck();
        RadioGroup2.clearCheck();
        RadioGroup3.clearCheck();
        RadioGroup4.clearCheck();
        RadioGroup5.clearCheck();
        RadioGroup6.clearCheck();
        RadioGroup7.clearCheck();
        RadioGroup8.clearCheck();
        RadioGroup9.clearCheck();
        checkbox1.setChecked( false );
        checkbox2.setChecked( false );
        checkbox3.setChecked( false );
        checkbox4.setChecked( false );
        EditText name = (EditText) findViewById( R.id.name_field );
        name.setText( "" );

        Score = 0;
        displayScore( Score );

    }

    private void displayScore(int score) {
        TextView Score = (TextView) findViewById( R.id.ScoreText );
        Score.setText( "Your Score Is " + score );
    }

    public void G1(View v) {
        RadioGroup1 = (RadioGroup) findViewById( R.id.Group1 );
        RadioButton RGroup1 = (RadioButton) RadioGroup1.findViewById( RadioGroup1.getCheckedRadioButtonId() );
        if (RGroup1 == findViewById( R.id.G1R3 )) {
            Score = Score + 1;
        }

    }

    public void G2(View v) {
        RadioGroup2 = (RadioGroup) findViewById( R.id.Group2 );
        RadioButton RGroup2 = (RadioButton) RadioGroup2.findViewById( RadioGroup2.getCheckedRadioButtonId() );
        if (RGroup2 == findViewById( R.id.G2R2 )) {
            Score = Score + 1;
        }
    }

    public void G3(View v) {
        RadioGroup3 = (RadioGroup) findViewById( R.id.Group3 );
        RadioButton RGroup3 = (RadioButton) RadioGroup3.findViewById( RadioGroup3.getCheckedRadioButtonId() );
        if (RGroup3 == findViewById( R.id.G3R1 )) {
            Score = Score + 1;
        }
    }

    public void G4(View v) {
        RadioGroup4 = (RadioGroup) findViewById( R.id.Group4 );
        RadioButton RGroup4 = (RadioButton) RadioGroup4.findViewById( RadioGroup4.getCheckedRadioButtonId() );
        if (RGroup4 == findViewById( R.id.G4R2 )) {
            Score = Score + 1;
        }
    }

    public void G5(View v) {
        RadioGroup5 = (RadioGroup) findViewById( R.id.Group5 );
        RadioButton RGroup5 = (RadioButton) RadioGroup5.findViewById( RadioGroup5.getCheckedRadioButtonId() );
        if (RGroup5 == findViewById( R.id.G5R2 )) {
            Score = Score + 1;
        }
    }

    public void G6(View v) {
        RadioGroup6 = (RadioGroup) findViewById( R.id.Group6 );
        RadioButton RGroup6 = (RadioButton) RadioGroup6.findViewById( RadioGroup6.getCheckedRadioButtonId() );
        if (RGroup6 == findViewById( R.id.G6R1 )) {
            Score = Score + 1;
        }
    }

    public void G7(View v) {
        RadioGroup7 = (RadioGroup) findViewById( R.id.Group7 );
        RadioButton RGroup7 = (RadioButton) RadioGroup7.findViewById( RadioGroup7.getCheckedRadioButtonId() );
        if (RGroup7 == findViewById( R.id.G7R1 )) {
            Score = Score + 1;
        }
    }

    public void G8(View v) {
        RadioGroup8 = (RadioGroup) findViewById( R.id.Group8 );
        RadioButton RGroup8 = (RadioButton) RadioGroup8.findViewById( RadioGroup8.getCheckedRadioButtonId() );
        if (RGroup8 == findViewById( R.id.G8R2 )) {
            Score = Score + 1;
        }
    }

    public void G9(View v) {
        RadioGroup9 = (RadioGroup) findViewById( R.id.Group9 );
        RadioButton RGroup9 = (RadioButton) RadioGroup9.findViewById( RadioGroup9.getCheckedRadioButtonId() );
        if (RGroup9 == findViewById( R.id.G9R3 )) {
            Score = Score + 1;
        }
    }

    public void CheckBoxes(View v) {
        checkbox1 = (CheckBox) findViewById( R.id.G10R1 );
        checkbox2 = (CheckBox) findViewById( R.id.G10R2 );
        checkbox3 = (CheckBox) findViewById( R.id.G10R3 );
        checkbox4 = (CheckBox) findViewById( R.id.G10R4 );
        if (checkbox2.isChecked() && checkbox4.isChecked() && !checkbox1.isChecked() && !checkbox3.isChecked()) {
            Score = Score + 1;
        }
    }

}
