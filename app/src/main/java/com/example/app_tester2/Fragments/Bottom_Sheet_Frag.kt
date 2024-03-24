package com.example.app_tester2.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.app_tester2.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class Bottom_Sheet_Frag : BottomSheetDialogFragment() {
    private lateinit var soundPlay1: ImageView
    private lateinit var soundPlay2: ImageView
    private lateinit var soundPlay3: ImageView
    private lateinit var soundPlay4: ImageView
    private lateinit var soundPlay5: ImageView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bottom__sheet_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        soundPlay1 = requireView().findViewById(R.id.sound_play_image1)
        var isImage1 = true

        soundPlay2 = requireView().findViewById(R.id.sound_play_image2)
        var isImage2 = true

        soundPlay3 = requireView().findViewById(R.id.sound_play_image3)
        var isImage3 = true

        soundPlay4 = requireView().findViewById(R.id.sound_play_image4)
        var isImage4 = true

        soundPlay5 = requireView().findViewById(R.id.sound_play_image5)
        var isImage5 = true

        soundPlay1.setOnClickListener {
            if (isImage1) {
                soundPlay1.setImageResource(R.drawable.sound_pause_icon)
                isImage1 = false
            } else {
                soundPlay1.setImageResource(R.drawable.sound_play_icon)
                isImage1 = true
            }
        }

        soundPlay2.setOnClickListener {
            if (isImage2) {
                soundPlay2.setImageResource(R.drawable.sound_pause_icon)
                isImage2 = false
            } else {
                soundPlay2.setImageResource(R.drawable.sound_play_icon)
                isImage2 = true
            }
        }

        soundPlay3.setOnClickListener {
            if (isImage3) {
                soundPlay3.setImageResource(R.drawable.sound_pause_icon)
                isImage3 = false
            } else {
                soundPlay3.setImageResource(R.drawable.sound_play_icon)
                isImage3 = true
            }
        }

        soundPlay4.setOnClickListener {
            if (isImage4) {
                soundPlay4.setImageResource(R.drawable.sound_pause_icon)
                isImage4 = false
            } else {
                soundPlay4.setImageResource(R.drawable.sound_play_icon)
                isImage4 = true
            }
        }

        soundPlay5.setOnClickListener {
            if (isImage5) {
                soundPlay5.setImageResource(R.drawable.sound_pause_icon)
                isImage5 = false
            } else {
                soundPlay5.setImageResource(R.drawable.sound_play_icon)
                isImage5 = true
            }
        }
    }
}
