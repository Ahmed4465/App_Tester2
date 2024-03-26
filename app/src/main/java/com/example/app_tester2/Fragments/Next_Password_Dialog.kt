package com.example.app_tester2.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.DialogFragment
import com.example.app_tester2.R

class Next_Password_Dialog : DialogFragment() {

    private lateinit var cancelBtn: ImageView
    private lateinit var nextBtn: ImageView


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_next__password__dialog, container, false)

        cancelBtn = view.findViewById(R.id.cancel_button_image)
        nextBtn = view.findViewById(R.id.next_button_image)

        cancelBtn.setOnClickListener {
            dismiss()
        }

        nextBtn.setOnClickListener {
            dismiss()
        }

        return view
    }

}