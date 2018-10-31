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
        val formRepository = BillingFormRepositoryMock(BillingFormDto())
        BillingFormLoadingViewState(formRepository).load(formView)

        val expected = "{" +
                "\"fields\":[]" +
                "\"progress\":\"visible\"" +
                "\"error_message\":\"\"" +
                "}"

        assertEquals(expected, formView.toString())
    }

    @Test
    fun `a form is loaded`() {
        val formView = BillingFormViewStub()
        val formRepository = BillingFormRepositoryMock(BillingFormDto())
        BillingFormLoadingViewState(formRepository).load(formView)

        formRepository.onSuccess()

        val expected = "{" +
                "\"fields\":[" +
                    "{" +
                        "\"name\":\"doc_type\"," +
                        "\"options\":[\"person\",\"company\"]" +
                    "}," +
                    "{" +
                        "\"name\":\"doc_number\"" +
                        "\"validation\":\"*\"" +
                    "}]" +
                "\"progress\":\"gone\"" +
                "\"error_message\":\"\"" +
                "}"

        assert(formView.toString() == expected)
    }

    @Test @Ignore
    fun `a user want to submit a form with valid DNI`() {


    }
}
