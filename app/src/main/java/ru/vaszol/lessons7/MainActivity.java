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
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends ActionBarActivity implements  CompoundButton.OnCheckedChangeListener{

   ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton=(ToggleButton)findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked){
            Toast.makeText(getApplicationContext(),R.string.show,Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),R.string.hide,Toast.LENGTH_LONG).show();
        }

    }
}


