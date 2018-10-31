package com.tridente.atddexcersise

class BillingForm {
    fun load(formView: BillingFormView, formRepository: BillingFormRepository) {
        formView.showProgress()
        formRepository.load(object : BillingFormRepository.BillingFormCallback {
            override fun onSuccess(form: BillingForm) {
                formView.hideProgress()
            }

            override fun onError(error: Exception) {

            }
        })

    }
}
