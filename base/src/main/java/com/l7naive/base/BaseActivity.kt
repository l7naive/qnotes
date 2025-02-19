package com.l7naive.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId())
        initViews()
        setupListeners()
    }

    protected open fun getLayoutResId() : Int {
        return 0
    }

    protected open fun initViews() {}

    protected open fun setupListeners() {}
}