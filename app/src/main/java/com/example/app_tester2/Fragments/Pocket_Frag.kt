package com.example.app_tester2.Fragments

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat
import androidx.fragment.app.Fragment
import com.example.app_tester2.R

class Pocket_Frag : Fragment(R.layout.fragment_pocket_){
    private lateinit var BackBtnImageView: ImageView
    private lateinit var activateImage: ImageView
    private lateinit var activateTextView: TextView
    private lateinit var selectSoundImage: ImageView

//    private lateinit var soundSwitch: SwitchCompat
//    private lateinit var vibrationSwitch: SwitchCompat
//    private lateinit var flashlightSwitch: SwitchCompat

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        BackBtnImageView = requireView().findViewById(R.id.Back_Button_image)
        activateImage = requireView().findViewById(R.id.activate_image)
        activateTextView = requireView().findViewById(R.id.activate_textView)
        selectSoundImage = requireView().findViewById(R.id.select_sound_box)

//        soundSwitch = requireView().findViewById(R.id.sound_switch)
//        vibrationSwitch = requireView().findViewById(R.id.vibration_switch)
//        flashlightSwitch = requireView().findViewById(R.id.flashlight_switch)


        val dashboardFrag = Dashboard_Fragment()
        //Back to DashBoard
        BackBtnImageView.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().apply {
                replace(R.id.dashboard_framelayout, dashboardFrag)
                addToBackStack(null)
                commit()
            }
        }

        //Activate Button Text
        activateImage.setOnClickListener {
            if (activateTextView.text == "Activate") {
                activateTextView.text = "Deactivate"
            }
            else {
                activateTextView.text = "Activate"
            }
        }
        //Sound Bottom Sheet
        selectSoundImage.setOnClickListener {
            val selectSound = Bottom_Sheet_Frag()
            selectSound.show(requireActivity().supportFragmentManager, selectSound.tag)
        }

    }
}