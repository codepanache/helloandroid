package com.helloandroid
import androidx.appcompat.app.AppCompatActivity
//import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.helloandroid.databinding.ActivityMainBinding
import android.widget.TextView

class MainActivity : AppCompatActivity() {
//private lateinit var binding: ActivityMainBinding
lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view  = binding.root
      //  val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        setContentView(view)

        binding.button.setOnClickListener { textView.setText("Hello World With Kotlin") }
    }
}

