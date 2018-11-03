package com.tridente.atddexcersise

interface BillingFormView {
    fun showProgress()
    fun hideProgress()
    fun showDocType(docTypeOptions: List<String>)
    fun render(billingFormLoadedViewState: BillingFormLoadedViewState) {
        billingFormLoadedViewState.render(this)
    }
}
