package com.example.minesweeperapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TableLayout tableLayout = (TableLayout) findViewById(R.id.table);
        tableLayout.setShrinkAllColumns(true);

        for (int i = 0; i < 9; i++) {
            // Creation row
            final TableRow tableRow[] = new TableRow[i];
                    tableRow[i] = new TableRow(this);
                    for (int j = 0; j < 9; j++) {
                        final Button tb [][]= new Button[i][j];
                        tb [i][j] = new Button(this);
                        tb[i][j].setText("");
                        tb[i][j].setLayoutParams
                                (new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));

                        tableRow[i].addView(tb[i][j]);
                }
            tableRow[i].setLayoutParams(new TableLayout.LayoutParams
                    (TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT));
            tableLayout.addView(tableRow[i]);
            }

        }
    }













