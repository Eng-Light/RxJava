package com.nourelden515.rxjava.fragment1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nourelden515.rxjava.MainActivity
import com.nourelden515.rxjava.databinding.FragmentFirstBinding
import io.reactivex.rxjava3.disposables.Disposable

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private var disposable: Disposable? = null
    private val activity by lazy { requireActivity() as MainActivity }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var counter = 0
        binding.buttonStart.setOnClickListener {
            activity.eventSubject.onNext((counter++).toString())
        }
    }

    override fun onPause() {
        super.onPause()
        disposable?.dispose()
    }

}