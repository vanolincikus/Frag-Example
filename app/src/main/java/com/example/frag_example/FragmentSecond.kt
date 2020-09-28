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
    private lateinit var svTextView1: TextView
    private lateinit var svTextView2: TextView
    private lateinit var svTextView3: TextView
    private lateinit var mButtonBack: Button
    private lateinit var mActivity: MainActivity

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_second, container, false)
        mTextView = view.findViewById(R.id.svTextView)
        svTextView1 = view.findViewById(R.id.svTextView1)
        svTextView2 = view.findViewById(R.id.svTextView2)
        svTextView3 = view.findViewById(R.id.svTextView3)


       // check argument for nullability
        if (arguments?.getString("key") != null) {
            // adding data from argument to textView
            mTextView.text = arguments?.getString("key")
        }
        if (arguments?.getString(Util.STRING_KEY1) != null) {
            // adding data from argument to textView
            svTextView1.text = arguments?.getString(Util.STRING_KEY1)
        }
        if (arguments?.getString(Util.STRING_KEY2) != null) {
            // adding data from argument to textView
            svTextView2.text = arguments?.getString(Util.STRING_KEY2)
        }
        if (arguments?.getString(Util.STRING_KEY3) != null) {
            // adding data from argument to textView
            svTextView3.text = arguments?.getString(Util.STRING_KEY3)
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