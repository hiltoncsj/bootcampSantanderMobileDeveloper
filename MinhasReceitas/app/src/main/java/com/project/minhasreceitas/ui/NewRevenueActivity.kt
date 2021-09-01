package com.project.minhasreceitas.ui

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import com.project.minhasreceitas.R
import com.project.minhasreceitas.dataSource.RevenueDataSource
import com.project.minhasreceitas.databinding.ActivityNewRevenueBinding
import com.project.minhasreceitas.extensions.format
import com.project.minhasreceitas.extensions.text
import com.project.minhasreceitas.model.Revenue
import java.util.*

private lateinit var binding: ActivityNewRevenueBinding

class NewRevenueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewRevenueBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(intent.hasExtra(REVENUE_ID)) {
            val revenueId = intent.getIntExtra(REVENUE_ID, 0)
            RevenueDataSource.findById(revenueId)?.let {
                binding.tilTitle.text = it.title
                binding.tilDate.text = it.date
                binding.tilHour.text = it.time
            }
        }

        insertListener()
    }

    private fun insertListener() {
        binding.tilDate.editText?.setOnClickListener {
            val datePicker = MaterialDatePicker.Builder.datePicker().build()
            datePicker.addOnPositiveButtonClickListener {
                val timeZone = TimeZone.getDefault()
                val offset = timeZone.getOffset(Date().time * -1)
                binding.tilDate.text = Date(it + offset).format()
            }
            datePicker.show(supportFragmentManager,"DATE_PICKER_TAG")
        }
        
        binding.tilHour.editText?.setOnClickListener { 
            val timerPicker = MaterialTimePicker.Builder().setTimeFormat(TimeFormat.CLOCK_24H).build()
            timerPicker.addOnPositiveButtonClickListener {
                val hour = if(timerPicker.hour in 0..9) "0${timerPicker.hour}" else timerPicker.hour
                val minute = if(timerPicker.minute in 0..9) "0${timerPicker.minute}" else timerPicker.minute
                binding.tilHour.text = "$hour:$minute"
            }
            timerPicker.show(supportFragmentManager,"TIME_PICKER_TAG")
        }

        binding.btnCancel.setOnClickListener {
            finish()
        }

        binding.btnNewRevenue.setOnClickListener {
            val revenue = Revenue(
                title = binding.tilTitle.text,
                date = binding.tilDate.text,
                time = binding.tilHour.text,
                descricao = binding.ettmMultitext.text,
                id = intent.getIntExtra(REVENUE_ID, 0)
            )
            RevenueDataSource.insertRevenue(revenue)
            setResult(Activity.RESULT_OK)
            finish()
        }
    }

    companion object {
        const val REVENUE_ID = "revenue_id"
    }
}