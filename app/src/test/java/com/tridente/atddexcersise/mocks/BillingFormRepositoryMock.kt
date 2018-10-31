package com.tridente.atddexcersise.mocks

import com.tridente.atddexcersise.BillingFormDto
import com.tridente.atddexcersise.BillingFormRepository

class BillingFormRepositoryMock(private val billingFormDto: BillingFormDto) : BillingFormRepository {

    private lateinit var callback: BillingFormRepository.BillingFormCallback

    override fun load(callback: BillingFormRepository.BillingFormCallback) {
        this.callback = callback
    }

    fun onSuccess() {
        callback.onSuccess(billingFormDto)
    }
}