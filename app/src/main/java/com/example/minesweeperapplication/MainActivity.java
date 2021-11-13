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
       // setContentView(R.layout.activity_main);

        LinearLayout l = new LinearLayout(this);
        l.setOrientation(LinearLayout.VERTICAL);

        TableLayout table;
        table = (TableLayout) findViewById(R.id.tableLayout);

        TableRow tableRow[] = new TableRow[9];
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT,
                TableRow.LayoutParams.WRAP_CONTENT, 1.0f);

        setContentView(l, layoutParams);

        for (int k = 0; k < 9; k++) {
            tableRow[k] = new TableRow(this);
            tableRow[k].setLayoutParams(layoutParams);

            Button[][] buttons = new Button[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    buttons[i][j] = new Button(this);
                    buttons[i][j].setLayoutParams(layoutParams);
                    buttons[i][j].setBackgroundColor(Color.GRAY);
                    tableRow[k].addView(buttons[i][j]);
                    l.addView(buttons[i][j]);

                }

            }


        }
        table.addView(table, layoutParams);

    }

}