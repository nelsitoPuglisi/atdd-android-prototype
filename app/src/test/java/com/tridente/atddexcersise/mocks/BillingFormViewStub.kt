package com.tridente.atddexcersise.mocks

import com.google.gson.GsonBuilder
import com.tridente.atddexcersise.BillingFormView

class BillingFormViewStub : BillingFormView {
    override fun showDocType(docTypeOptions: List<String>) {
        this.docTypeOptions = docTypeOptions
    }

    var docTypeOptions = listOf<String>()
    var progress = "gone"
    var errorMessage = ""

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
