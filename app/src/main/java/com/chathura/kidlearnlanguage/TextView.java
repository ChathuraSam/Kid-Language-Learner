package com.chathura.kidlearnlanguage;

import android.content.Context;
import android.view.View;

public class TextView extends View {

    //String Value
    private String mText;

    //Text Color of the Text
    private int mTextColor;

    //context of the app
    private Context mContext;



    public TextView(Context context){
        super(context);
        mTextColor = 0;
        mText = "";
        mContext = context;
    }

    public void setText(String text){
        mText = text;
    }

    public void  setTextColor(int color){
        mTextColor = color;
    }

    public String getText(){
        return mText;
    }

    public int getmTextColor(){
        return mTextColor;
    }
}
