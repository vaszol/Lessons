package ru.vaszol.lessons7;

import android.graphics.Color;
import android.graphics.Typeface;
import android.renderscript.Type;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements CompoundButton.OnCheckedChangeListener {

    RadioGroup radioGroup;
    TextView textView;
    CheckBox checkBoxBold, checkBoxItalic;
    Switch showText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        textView = (TextView) findViewById(R.id.textView);

        checkBoxBold = (CheckBox) findViewById(R.id.bold);
        checkBoxItalic = (CheckBox) findViewById(R.id.italic);
        showText=(Switch) findViewById(R.id.showText);

        showText.setOnCheckedChangeListener(this);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButtonRedColor:
                        textView.setTextColor(Color.RED);
                        break;
                    case R.id.radioButtonBlueColor:
                        textView.setTextColor(Color.BLUE);
                        break;
                    case R.id.radioButtonDefaultColor:
                        textView.setTextColor(Color.GRAY);
                        break;
                }
            }
        });
    }
        public void onCheckBoxChecked(View view){
            boolean isChecked = ((CheckBox)view).isChecked();

            switch (view.getId()){
                case R.id.bold:
                    if(isChecked){
                        textView.setTypeface(null, Typeface.BOLD);
                    }else {
                        textView.setTypeface(null, Typeface.NORMAL);
                    }
                    break;
                case R.id.italic:
                    if(isChecked){
                        textView.setTypeface(null, Typeface.ITALIC);
                    }else {
                        textView.setTypeface(null, Typeface.NORMAL);
                    }
                    break;
            }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked){
            textView.setText(R.string.text);
        }else {
            textView.setText("");
        }
    }
}


