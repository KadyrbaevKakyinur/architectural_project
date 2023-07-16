package com.example.architecturalproject

import com.example.architecturalproject.model.Model
import com.example.architecturalproject.presenter.Presenter


class Injector {

    companion object{
        fun getModel() = Model()
        fun getPresenter(view: CounterView) = Presenter(view)
    }
}