package com.coderdeer.qureshi.jokes

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import android.content.Context
import android.content.Intent
import android.support.annotation.IdRes
import android.view.View
import android.widget.Toast
import com.coderdeer.qureshi.displayjokeandroidlibrary.DisplayJoke
import com.coderdeer.qureshi.joketellinglibrary.Joker


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        val mAdView : AdView by bind(R.id.adView)
        val getJokeButton by bind<Button>(R.id.getjoke)

        val addMobAppId = ""

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this,addMobAppId)

        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        getJokeButton.setOnClickListener {
            val intent = Intent(this,DisplayJoke::class.java)
            intent.putExtra(DisplayJoke().JOKE_KEY,Joker().joke)
            startActivity(intent)
        }


    }
}



fun toast (context:Context ,str : String ) = Toast.makeText(context, str, Toast.LENGTH_SHORT).show()

fun <T : View> Activity.bind(@IdRes idRes: Int): Lazy<T> {
    @Suppress("UNCHECKED_CAST")
    return unsafeLazy { findViewById<T>(idRes) }
}
private fun <T> unsafeLazy(initializer: () -> T) = lazy(LazyThreadSafetyMode.NONE, initializer)