package com.example.boyssoundboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun playSound(view: View){

        mediaPlayer?.release()
        mediaPlayer = when (view.id){
            R.id.adjesButton -> {
                MediaPlayer.create(this, R.raw.adjes)
            }
            R.id.pukkelpopButton -> {
                MediaPlayer.create(this, R.raw.pukkelpop)
            }
            R.id.vlaamsbelangButton ->{
                MediaPlayer.create(this, R.raw.vlaamsbelang)
            }
            R.id.overwatchButton ->{
                MediaPlayer.create(this, R.raw.overwatch)
            }
            R.id.geileseksButton ->{
                MediaPlayer.create(this, R.raw.geileseks)
            }
            R.id.hannesWtfButton ->{
                MediaPlayer.create(this, R.raw.hanneswtf)
            }
            else -> return
        }

        mediaPlayer!!.start()

    }
}