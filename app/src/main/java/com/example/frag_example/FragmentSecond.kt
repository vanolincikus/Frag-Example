package com.example.frag_example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class FragmentSecond : Fragment() {
    private lateinit var mButtonBack:Button
    private lateinit var mActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        initView(view)
        initCliks()

        return view
    }

    fun initView(view: View){
        mButtonBack = view.findViewById(R.id.buttonBack)
        mActivity = activity as MainActivity


    }
    fun initCliks(){
        mButtonBack.setOnClickListener{mActivity.setFragment(mActivity.mFirstFragment)}
    }


}