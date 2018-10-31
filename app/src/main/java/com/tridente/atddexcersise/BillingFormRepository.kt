package com.tridente.atddexcersise

interface BillingFormRepository {
    fun load(callback: BillingFormCallback)

    interface BillingFormCallback {
        fun onSuccess(billingFormDto: BillingFormDto)
        fun onError(error: Exception)
    }
}
