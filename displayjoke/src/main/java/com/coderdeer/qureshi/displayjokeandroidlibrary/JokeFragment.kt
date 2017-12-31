package com.coderdeer.qureshi.displayjokeandroidlibrary

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class JokeFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val root: View = inflater!!.inflate(R.layout.fragment_joke, container, false)
        val joke = activity.intent.getStringExtra(DisplayJoke().JOKE_KEY)
        val textView = root.findViewById<TextView>(R.id.joke_textview)
        if (joke != null && joke.isNotEmpty())
            textView.text = joke

        return root

    }
}// Required empty public constructor
