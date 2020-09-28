package com.example.frag_example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class FragmentFirst : Fragment() {

    private lateinit var mButtonNext: Button
    private lateinit var mEditText: TextView
    private lateinit var mActivity: MainActivity


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        initView(view)

        initCLicks()
        return view
    }



    private fun initView(view: View) {
        mButtonNext = view.findViewById(R.id.nextButton)
        mEditText = view.findViewById(R.id.fvTextView)
        mActivity = activity as MainActivity
    }

    private fun initCLicks() {
        //initialising bundle


        mButtonNext.setOnClickListener {
            val bundle = Bundle()
            val string: String = mEditText.text.toString()
            //put string into bundle with "key" key
            bundle.putString("key", string)
            //bundle put to second fragment
            mActivity.mSecondFragment.arguments = bundle
            mActivity.setFragment(mActivity.mSecondFragment)
        }
    }


}


