package com.example.minesweeperapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TableLayout tableLayout = (TableLayout) findViewById(R.id.table);
        tableLayout.setShrinkAllColumns(true);
        Button[][] buttons = new Button[9][9];
        for (int i = 0; i < 9; i++) {
            final TableRow tableRow = new TableRow(this);
                    for (int j = 0; j < 9; j++) {
                        buttons[i][j]= new BlockButton(this,i,j);
                        buttons[i][j].setLayoutParams
                                (new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT,1.0f));
                        tableRow.addView(buttons[i][j]);

                }
            tableLayout.addView(tableRow);
            }
        ToggleButton toggleButton;
        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    BlockButton.choose = 1;
                }else{
                    BlockButton.choose = 0;
                }
            }
        });



        }
    }













