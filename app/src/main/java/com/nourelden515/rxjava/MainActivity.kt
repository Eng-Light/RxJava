package com.nourelden515.rxjava

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nourelden515.rxjava.databinding.ActivityMainBinding
import io.reactivex.rxjava3.subjects.PublishSubject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    val eventSubject = PublishSubject.create<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}