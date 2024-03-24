package com.example.app_tester2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.app_tester2.Fragments.Dashboard_Fragment

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboard)


//        val drawerFragment = Drawer_Fragment()
        val dashboardFragment  = Dashboard_Fragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.dashboard_framelayout, dashboardFragment)
            commit()
        }
    }
}