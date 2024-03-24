package com.example.app_tester2.Fragments

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.app_tester2.Fragments.Set_Password_Popup_Frag
import com.example.app_tester2.R
import com.google.android.material.navigation.NavigationView


class Dashboard_Fragment : Fragment(R.layout.fragment_dashboard_) {

    private lateinit var chargerModeImageView: ImageView
    private lateinit var pocketModeImageView: ImageView
    private lateinit var handMotionImageView: ImageView
    private lateinit var batteryImageView: ImageView
    private lateinit var drawerIcon: ImageView
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navView: NavigationView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        chargerModeImageView = requireView().findViewById(R.id.chargerMode_image)
        pocketModeImageView = requireView().findViewById(R.id.pocket_mode_image)
        handMotionImageView = requireView().findViewById(R.id.hand_motion_image)
        batteryImageView = requireView().findViewById(R.id.battery_image)
        drawerIcon = requireView().findViewById(R.id.drawer_icon_image)
        drawerLayout = requireView().findViewById(R.id.drawer)
        navView = requireView().findViewById(R.id.navigation_view)

        // Import the necessary fragments and activities


        // Open Charger Mode Fragment
        chargerModeImageView.setOnClickListener {
            val chargerModeFrag = Charger_Mode_Frag()
            requireActivity().supportFragmentManager.beginTransaction().apply {
                replace(R.id.dashboard_framelayout, chargerModeFrag)
                addToBackStack(null)
                commit()
            }
        }

        pocketModeImageView.setOnClickListener {
            val pocketModeFrag = Pocket_Frag()
            requireActivity().supportFragmentManager.beginTransaction().apply {
                replace(R.id.dashboard_framelayout, pocketModeFrag)
                addToBackStack(null)
                commit()
            }
        }

        handMotionImageView.setOnClickListener {
            val handMotionFrag = Motion_Frag()
            requireActivity().supportFragmentManager.beginTransaction().apply {
                replace(R.id.dashboard_framelayout, handMotionFrag)
                addToBackStack(null)
                commit()
            }
        }

        batteryImageView.setOnClickListener {
            val batteryFullModeFrag = Battery_Frag()
            requireActivity().supportFragmentManager.beginTransaction().apply {
                replace(R.id.dashboard_framelayout, batteryFullModeFrag)
                addToBackStack(null)
                commit()
            }
        }

        // Open the drawer menu
        drawerIcon.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        // To open and close the drawer (commented out for now)
//        val drawerToggle = ActionBarDrawerToggle(
//            requireActivity(),
//            drawerLayout,
//            R.string.nav_open,
//            R.string.nav_close
//        )
//        drawerLayout.addDrawerListener(drawerToggle)
//        drawerToggle.syncState()

//        requireActivity().supportActionBar?.setDisplayHomeAsUpEnabled(true)



        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_passwordSettings -> {
                    // Open Set_Password_Popup_Frag here
                    showSetPasswordPopup()
                    return@setNavigationItemSelectedListener true
                }
                // Handle other menu items...
            }
            return@setNavigationItemSelectedListener false
        }


    }

    private fun showSetPasswordPopup() {
        val setPasswordPopup = Set_Password_Popup_Frag()
        setPasswordPopup.show(requireActivity().supportFragmentManager, "set_password_popup")
    }

}