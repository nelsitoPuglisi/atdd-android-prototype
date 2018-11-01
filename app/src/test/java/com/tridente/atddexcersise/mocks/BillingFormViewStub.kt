package com.tridente.atddexcersise.mocks

import com.tridente.atddexcersise.*

class BillingFormViewStub(private var progress: Progress = NoProgress(), private var docTypeCombo: DocTypeCombo = DocTypeCombo(emptyList()), private var error: NoError = NoError()) : BillingFormView {
    override fun showDocType(docTypeOptions: List<String>) {
        docTypeCombo = DocTypeCombo(docTypeOptions)
    }

    override fun hideProgress() {
        progress = NoProgress()
    }

    override fun showProgress() {
        progress = VisibleProgress()
    }

    override fun equals(other: Any?): Boolean {
        if (other !is BillingFormViewStub) return false

        return other.docTypeCombo == this.docTypeCombo &&
                other.error == this.error &&
                other.progress == this.progress
    }
}
