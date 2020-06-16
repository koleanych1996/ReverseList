package com.koleanych1996.reverselist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val listToReverse = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Start recursion
        reverseList(listToReverse)

        Log.d("list final: ", listToReverse.toString())
    }

    private fun reverseList(list: MutableList<Int>?) {
        Log.d("process list: ", list.toString())

        if (list == null || list.size <= 1) return

        // remove the first element
        val value = list.removeAt(0)
        Log.d("process list remove: ", list.toString())

        // using method for remaining elements
        reverseList(list)

        // add element after function exit
        list.add(value)
        Log.d("process list add: ", list.toString())
    }
}
