package com.example.layout

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.example.layout.databinding.PostBinding
import com.example.layout.databinding.Post2Binding


class Post @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : LinearLayout(context, attrs, defStyleAttr) {
    private val binding = PostBinding.inflate(LayoutInflater.from(context))
    private val binding2 = Post2Binding.inflate(LayoutInflater.from(context))

    private var currentView: View? = null

    init {
        val index = (System.currentTimeMillis() / 1000) % 2
        if (index.toInt() == 0) {
            currentView = binding.root
        addView(currentView)
        } else {
            currentView = binding2.root
        addView(currentView)
        }
    }
    fun setTopText(text: String) {
        currentView?.let {
            (it as ViewGroup).findViewById<TextView>(R.id.top_text).text = text
        }
    }

    fun setBottomText(text: String) {
        currentView?.let {
            (it as ViewGroup).findViewById<TextView>(R.id.bottom_text).text = text
        }
    }
}

