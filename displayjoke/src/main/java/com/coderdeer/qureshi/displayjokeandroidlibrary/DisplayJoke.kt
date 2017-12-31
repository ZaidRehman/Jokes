package com.coderdeer.qureshi.displayjokeandroidlibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class DisplayJoke : AppCompatActivity() {

    var JOKE_KEY = "joke key"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_joke)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_joke,menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        val id = item?.itemId
        return if (id == R.id.action_settings) {true}
        else super.onOptionsItemSelected(item)

    }
}
