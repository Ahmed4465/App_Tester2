package com.example.app_tester2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {

    private lateinit var chargerModeImageView: ImageView
    private lateinit var pocketModeImageView: ImageView
    private lateinit var handMotionImageView: ImageView
    private lateinit var batteryImageView: ImageView
    private lateinit var drawerIcon: ImageView
    private lateinit var drawer: DrawerLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        chargerModeImageView = findViewById(R.id.chargerMode_image)
        pocketModeImageView = findViewById(R.id.pocket_mode_image)
        handMotionImageView = findViewById(R.id.hand_motion_image)
        batteryImageView = findViewById(R.id.battery_image)
        drawerIcon = findViewById(R.id.drawer_icon_image)
        drawer = findViewById(R.id.drawer)


        //To open the drawer menu
        drawerIcon.setOnClickListener {
            drawer.openDrawer(GravityCompat.START)
        }

        //To open and clode drawer
//        val drawerToggle = ActionBarDrawerToggle(this, drawer, R.string.nav_open, R.string.nav_close)
//        drawer.addDrawerListener(drawerToggle)
//        drawerToggle.syncState()
//
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when (item.itemId) {
//            android.R.id.home -> {
//                drawer.openDrawer(GravityCompat.START)
//                true
//            }
//            else -> super.onOptionsItemSelected(item)
//        }
//    }
}