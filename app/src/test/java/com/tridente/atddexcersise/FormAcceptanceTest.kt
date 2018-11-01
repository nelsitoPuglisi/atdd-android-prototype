package com.tridente.atddexcersise

import com.tridente.atddexcersise.mocks.BillingFormRepositoryMock
import com.tridente.atddexcersise.mocks.BillingFormViewStub
import junit.framework.Assert.assertEquals
import org.junit.Test

import org.junit.Ignore

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class FormAcceptanceTest {

    @Test
    fun `a user wants to load a form`() {
        val formView = BillingFormViewStub()
        val formRepository = BillingFormRepositoryMock()
        BillingFormLoadingViewState(formRepository).load(formView)

        val expected = BillingFormViewStub(VisibleProgress(), DocTypeCombo(emptyList()), NoError())

        assertEquals(expected, formView)
    }

    @Test
    fun `a form is loaded`() {
        val formView = BillingFormViewStub(NoProgress(), DocTypeCombo(listOf("person", "company")), NoError())
        val formRepository = BillingFormRepositoryMock()
        BillingFormLoadingViewState(formRepository).load(formView)
        formRepository.onSuccess()

        val expected = BillingFormViewStub(NoProgress(), DocTypeCombo(listOf("person", "company")), NoError())

        assertEquals(expected, formView)
    }

    @Test @Ignore
    fun `a user want to submit a form with valid DNI`() {


    }
}

class NoError {
    override fun equals(other: Any?): Boolean {
        return other is NoError
    }
}

class DocTypeCombo(private var docTypeOptions: List<String>) {
    override fun equals(other: Any?): Boolean {
        if (other is DocTypeCombo) {
            return this.docTypeOptions.toTypedArray().contentDeepEquals(other.docTypeOptions.toTypedArray())
        }
        return false
    }
}

class NoProgress : Progress {
    override fun equals(other: Any?): Boolean {
        return other is NoProgress
    }
}

class VisibleProgress : Progress {
    override fun equals(other: Any?): Boolean {
        return other is VisibleProgress
    }
}

interface Progress
