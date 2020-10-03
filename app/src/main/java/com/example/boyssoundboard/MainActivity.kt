package com.example.boyssoundboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    public var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun buttonSwitch(boolean: Boolean){
        adjesButton.setEnabled(boolean)
        pukkelpopButton.setEnabled(boolean)
        vlaamsbelangButton.setEnabled(boolean)
    }

    fun playSound(view: View){
        buttonSwitch(false)
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
            else -> return
        }

        mediaPlayer!!.start()
        while (mediaPlayer!!.isPlaying){

        }
        mediaPlayer!!.release()
        buttonSwitch(true)

    }
}