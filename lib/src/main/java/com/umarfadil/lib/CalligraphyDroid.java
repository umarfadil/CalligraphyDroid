package com.umarfadil.lib;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by umarfadil on 11/28/17.
 */

public class CalligraphyDroid extends AppCompatTextView {

    public CalligraphyDroid(Context context) {
        this(context, null);
    }

    public CalligraphyDroid(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray array = context.obtainStyledAttributes(attrs,
                R.styleable.CalligraphyDroid, 0, 0);
        String path_font = array.getString(R.styleable.CalligraphyDroid_fontPath);

        array.recycle();
        if (path_font != null) {
            setCustomTypeFace(context, path_font);
        } else {
            setCustomTypeFace(context, "fonts/Raleway-Regular.ttf");
        }
    }

    private void setCustomTypeFace(Context context, String path_font) {
        Typeface typeFaces = Typeface.createFromAsset(context.getAssets(), path_font);
        this.setTypeface(typeFaces);
    }
}
