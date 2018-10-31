package com.tridente.atddexcersise.mocks

import com.google.gson.GsonBuilder
import com.tridente.atddexcersise.BillingFormView

class BillingFormViewStub : BillingFormView {

    val fields = listOf<String>()
    var progress: String = "gone"
    var errorMessage: String = ""

    override fun hideProgress() {
        progress = "gone"
    }

    override fun showProgress() {
        progress = "visible"
    }

    override fun toString(): String {
        return GsonBuilder().create().toJson(this)
    }
}
