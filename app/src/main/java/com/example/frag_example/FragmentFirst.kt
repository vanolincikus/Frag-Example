package com.example.frag_example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FragmentFirst : Fragment() {

    private lateinit var mButtonNext: Button
    private lateinit var mActivity: MainActivity

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        initView(view)
        initCLicks()
        return view
    }

    private fun initView(view: View){
    mButtonNext = view.findViewById(R.id.nextButton)
    mActivity = activity as MainActivity
}
    private fun initCLicks(){
        mButtonNext.setOnClickListener{mActivity.setFragment(mActivity.mSecondFragment)}
    }

}