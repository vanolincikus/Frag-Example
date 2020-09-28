package com.example.frag_example

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_second.*


class FragmentSecond : Fragment() {


    private lateinit var mTextView: TextView
    private lateinit var mButtonBack: Button
    private lateinit var mActivity: MainActivity

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_second, container, false)
        mTextView = view.findViewById(R.id.svTextView)

       // check argument for nullability
        if (arguments?.getString("key") != null) {
            // adding data from argument to textView
            mTextView.text = arguments?.getString("key")
        }
        initView(view)
        initCliks()
        return view
    }

    private fun initView(view: View) {
        mButtonBack = view.findViewById(R.id.buttonBack)
        mActivity = activity as MainActivity


    }

    private fun initCliks() {
        mButtonBack.setOnClickListener { mActivity.setFragment(mActivity.mFirstFragment) }
    }


}