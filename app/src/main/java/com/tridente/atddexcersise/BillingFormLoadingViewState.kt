package com.tridente.atddexcersise

class BillingFormLoadingViewState(private val formRepository: BillingFormRepository) {
    fun load(formView: BillingFormView) {
        formView.showProgress()
        formRepository.load(object : BillingFormRepository.BillingFormCallback {
            override fun onSuccess(billingFormDto: BillingFormDto) {
                formView.hideProgress()
            }

            override fun onError(error: Exception) {
                formView.hideProgress()
            }
        })

    }
}
