package com.example.frag_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity() {

    var mFirstFragment: FragmentFirst = FragmentFirst()
    var mSecondFragment: FragmentSecond = FragmentSecond()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setFragment(mFirstFragment)
    }

    fun setFragment(fragment:Fragment){
        val fm:FragmentManager = supportFragmentManager
        val ft:FragmentTransaction = fm.beginTransaction()
        ft.replace(R.id.mainFrame,fragment,Util.FRAGMENT_KEY)
        ft.commit()
    }
}