package com.example.minesweeperapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class BlockButton extends androidx.appcompat.widget.AppCompatButton {
    int x, y;//자신의 위치
    boolean mine = false;//지뢰인지 아닌지
    boolean flag = false;//깃발이 꽂혀있는지
    int neighborMines; //주변지뢰숫자
    static int flags;//깃발 꽂은 개수
    static int blocks;//남은 블럭 개수
    static int choose = 0;//0은 지뢰선택, 1은 깃발선택


    public BlockButton(Context context, int x, int y) {
        super(context);
        this.x = x;
        this.y = y;
        mine=false;
        flag=false;
        neighborMines= 0;
        this.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(choose==1) {
                    if (flag) {
                        flag = false;
                        setText("");
                        return;
                    } else {
                        flag = true;
                        setText("\uD83C\uDFF4");
                        return;
                    }
                }else{
                    return;
                }
            }
        });

    }

    public void toggleFlag(int x,int y){

    }
    @Override
    public void setLayoutParams(ViewGroup.LayoutParams params) {
        super.setLayoutParams(params);
    }
}
