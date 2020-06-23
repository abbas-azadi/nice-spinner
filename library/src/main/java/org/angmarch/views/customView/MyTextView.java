package org.angmarch.views.customView;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;


public class MyTextView extends AppCompatTextView {
    public MyTextView(Context context) {
        super(context);
        Typeface irSans = Typeface.createFromAsset(context.getAssets(),"iransans.ttf");
        this.setTypeface(irSans);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Typeface irSans = Typeface.createFromAsset(context.getAssets(),"iransans.ttf");
        this.setTypeface(irSans);
    }
}
