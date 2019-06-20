package com.jianastrero.bindingadaptersexample.binding_adapters;

import android.databinding.BindingAdapter;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class CustomBindingAdapters {
    @BindingAdapter("changeBackgroundAndTextOnTap")
    public static void changeBackgroundAndTextOnTap(final TextView view, boolean shouldChange) {
        Log.d("JIAN", "shouldChange: " + shouldChange);
        if (shouldChange) {
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    view.setBackgroundColor(Color.HSVToColor(new float[]{(int)Math.round(Math.random() * 360), 0.8f, 0.4f}));
                    view.setText("" + (Math.random() * 10000000000L));
                }
            });
        }
    }
}
