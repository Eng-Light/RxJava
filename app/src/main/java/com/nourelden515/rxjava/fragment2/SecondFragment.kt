package com.nourelden515.rxjava.fragment2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nourelden515.rxjava.MainActivity
import com.nourelden515.rxjava.databinding.FragmentSecondBinding
import io.reactivex.rxjava3.disposables.Disposable

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private var disposable: Disposable? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onResume() {
        super.onResume()

        disposable = (activity as? MainActivity)?.eventSubject
            ?.subscribe { text ->
                binding.textViewChars.text = text
            }
    }

    override fun onPause() {
        super.onPause()
        disposable?.dispose()
    }
}