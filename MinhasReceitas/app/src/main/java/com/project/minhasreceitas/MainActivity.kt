package com.project.minhasreceitas

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.project.minhasreceitas.adapter.RevenueListAdapter
import com.project.minhasreceitas.dataSource.RevenueDataSource
import com.project.minhasreceitas.databinding.ActivityMainBinding
import com.project.minhasreceitas.ui.NewRevenueActivity

private lateinit var binding : ActivityMainBinding
private val adapter by lazy { RevenueListAdapter() }

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvRevenue.adapter = adapter
        updateList()

        insertListeners()
    }

    private fun insertListeners() {
        binding.fab.setOnClickListener {
            startActivityForResult( Intent(this, NewRevenueActivity::class.java), CREATE_NEW_REVENUE)
        }

        adapter.listenerEdit = {
            val intent = Intent(this, NewRevenueActivity::class.java)
            intent.putExtra(NewRevenueActivity.REVENUE_ID, it.id )
            startActivityForResult( intent, CREATE_NEW_REVENUE)
        }

        adapter.listenerDelete = {
            RevenueDataSource.deleteRevenue(it)
            updateList()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == CREATE_NEW_REVENUE && resultCode == Activity.RESULT_OK) updateList()
    }

    private fun updateList() {
        val list = RevenueDataSource.getList()
        binding.includeEmpty.emptyState.visibility = if (list.isEmpty()) View.VISIBLE
        else View.GONE
        adapter.submitList(list)
    }

    companion object {
        private const val CREATE_NEW_REVENUE = 1000
    }
}

