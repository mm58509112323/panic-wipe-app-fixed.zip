package com.safe.calculator.ui

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class FakeCalculator : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "0"
        tv.textSize = 48f
        setContentView(tv)
    }
}
