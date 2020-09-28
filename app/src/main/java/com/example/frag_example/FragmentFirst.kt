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
    private lateinit var mEditText1:TextView
    private lateinit var mEditText2:TextView
    private lateinit var mEditText3:TextView
    private lateinit var mActivity: MainActivity
//    private lateinit var myText: TextModel = TextModel()


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
        mEditText1= view.findViewById(R.id.text1)
        mEditText2= view.findViewById(R.id.text2)
        mEditText3= view.findViewById(R.id.text3)
        mActivity = activity as MainActivity
    }

    private fun initCLicks() {
        //initialising bundle
        mButtonNext.setOnClickListener {
            val bundle = Bundle()
            var textValues : Array<String> = arrayOf(mEditText.text.toString(),mEditText1.text.toString(),mEditText2.text.toString(),mEditText3.text.toString())
            var myText = TextModel(textValues)
            //put strings into bundle with "key" key
//            bundle.putString("key", mEditText.text.toString())
//            bundle.putString(Util.STRING_KEY1, text1.text.toString())
//            bundle.putString(Util.STRING_KEY2, text2.text.toString())
//            bundle.putString(Util.STRING_KEY3, text3.text.toString())
            //bundle put to second fragment
            bundle.putSerializable(Util.TEXT_KEY,myText)
            mActivity.mSecondFragment.arguments = bundle
            mActivity.setFragment(mActivity.mSecondFragment)
        }
    }


}


