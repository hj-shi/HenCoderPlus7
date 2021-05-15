package com.example.app.entity;

import android.view.View;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class A {
    public static void main(String[] args) {
        View2 view2 = new View2();
        view2.setOnClickListener(new Function1<View, Unit>() {
            @Override
            public Unit invoke(View view) {
                return null;
            }
        });
    }
}
