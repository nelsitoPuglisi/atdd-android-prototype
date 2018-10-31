package com.tridente.atddexcersise.mocks

import com.tridente.atddexcersise.BillingFormDto
import com.tridente.atddexcersise.BillingFormLoadedViewState
import com.tridente.atddexcersise.BillingFormRepository

class BillingFormRepositoryMock() : BillingFormRepository {

    private lateinit var callback: BillingFormRepository.BillingFormCallback

    override fun load(callback: BillingFormRepository.BillingFormCallback) {
        this.callback = callback
    }

    fun onSuccess() {
        callback.onSuccess(BillingFormLoadedViewState(listOf("person","company")))
    }
}