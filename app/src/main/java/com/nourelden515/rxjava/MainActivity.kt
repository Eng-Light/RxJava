package com.nourelden515.rxjava

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nourelden515.rxjava.databinding.ActivityMainBinding
import org.greenrobot.eventbus.EventBus

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    // Create an event bus
    val eventBus: EventBus = EventBus.getDefault()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}