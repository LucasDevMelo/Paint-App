package com.example.paintapp

import android.content.Context
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View
import com.example.paintapp.MainActivity.Companion.paintBrush

class PaintView : View {

    companion object{
        var pathList = ArrayList<Path>()
        var colorList = ArrayList<Int>()
        var currentBrush = Color.BLACK
    }

    constructor(context: Context) : this(context, null) {

    }
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0) {

    }
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {

    }

    private fun init(){
        paintBrush.isAntiAlias = true
        paintBrush.color = currentBrush
        paintBrush.style = Paint.Style.STROKE
    }
}