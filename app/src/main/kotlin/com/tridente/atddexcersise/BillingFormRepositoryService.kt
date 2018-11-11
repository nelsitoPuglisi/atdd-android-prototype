package com.tridente.atddexcersise

import android.os.Handler

class BillingFormRepositoryService : BillingFormRepository {
    override fun load(callback: BillingFormRepository.BillingFormCallback) {
        Handler().postDelayed({
            callback.onSuccess(BillingFormLoadedViewState(listOf("person", "company")))
        }, 2000)

    }
}
