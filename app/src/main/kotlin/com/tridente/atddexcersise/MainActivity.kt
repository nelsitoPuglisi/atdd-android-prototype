package com.tridente.atddexcersise

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BillingFormView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BillingFormLoadingViewState(BillingFormRepositoryService()).load(this)
    }

    override fun showProgress() {
        progressBar.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        progressBar.visibility = View.GONE
    }

    override fun showDocType(docTypeOptions: List<String>) {
        spinner2.visibility = View.VISIBLE
        textView.visibility = View.VISIBLE
        editText2.visibility = View.VISIBLE

        val dataAdapter = ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, docTypeOptions);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.adapter = dataAdapter
    }

}
