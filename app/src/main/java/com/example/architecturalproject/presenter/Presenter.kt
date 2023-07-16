package com.example.architecturalproject.presenter

import android.graphics.Color
import com.example.architecturalproject.CounterView
import com.example.architecturalproject.Injector

class Presenter constructor(var view : CounterView) {

    private var model = Injector.getModel()

    fun increment(){
        model.increment()
        view.showCount(model.count)
        showToast()
        setTextColor()
    }

    fun deincrement(){
        model.deincrement()
        view.showCount(model.count)
        showToast()
        setTextColor()
    }

    private fun showToast() {
        if (model.count == 10)
            view.showToast("Поздравляем")
    }

    private fun setTextColor() {
        if (model.count >= 15){
            view.changeTextColor(Color.GREEN)
        }else {
            view.changeTextColor(Color.BLACK)
        }
    }

}