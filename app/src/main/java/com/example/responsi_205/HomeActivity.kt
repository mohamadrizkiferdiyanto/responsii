package com.example.responsi_205

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.*

class HomeActivity : AppCompatActivity() {

    private var motors: ArrayList<Motor> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val rvMotor = findViewById<RecyclerView>(R.id.rv_motor)
        rvMotor.setHasFixedSize(true)
        motors.addAll(DataMotor().getListMotor())

        rvMotor.layoutManager = LinearLayoutManager(this)
        rvMotor.adapter = MotorListViewAdapter(this, motors)

    }
}
