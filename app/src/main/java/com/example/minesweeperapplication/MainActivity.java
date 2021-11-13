package com.example.minesweeperapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TableLayout tableLayout = (TableLayout) findViewById(R.id.table);
        tableLayout.setShrinkAllColumns(true);

        Button[][] buttons = new Button[9][9];
        for (int i = 0; i < 9; i++) {
            final TableRow tableRow = new TableRow(this);
            // Creation row
                    for (int j = 0; j < 9; j++) {
                        buttons[i][j]= new Button(this);
                        buttons[i][j].setText("");
                        buttons[i][j].setLayoutParams
                                (new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
                        tableRow.addView(buttons[i][j]);
                }
            tableRow.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT));

            tableLayout.addView(tableRow);
            }



        }
    }













