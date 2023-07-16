package com.example.architecturalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.architecturalproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    lateinit var binding : ActivityMainBinding
    private var presenter = Injector.getPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()

    }

    private fun initClickers() {
        with(binding){
            incrementBtn.setOnClickListener {
                presenter.increment()
            }

            deincrementBtn.setOnClickListener {
                presenter.deincrement()
            }
        }
    }

    override fun showCount(count: Int) {
        binding.counterTv.text = count.toString()
    }

    override fun showToast(congratulation: String) {
        Toast.makeText(this, congratulation, Toast.LENGTH_SHORT).show()
    }

    override fun changeTextColor(color: Int) {
        binding.counterTv.setTextColor(color)
    }

}