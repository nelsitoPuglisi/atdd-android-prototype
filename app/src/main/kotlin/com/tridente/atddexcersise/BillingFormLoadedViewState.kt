package com.tridente.atddexcersise

class BillingFormLoadedViewState(private val fields: List<String>) {
    fun render(formView: BillingFormView) {
        formView.hideProgress()
        formView.showDocType(fields)
    }
}
