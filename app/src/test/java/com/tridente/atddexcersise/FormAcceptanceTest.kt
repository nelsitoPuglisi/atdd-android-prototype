package com.tridente.atddexcersise

import com.tridente.atddexcersise.mocks.BillingFormRepositoryMock
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
        BillingForm().load(formView, formRepository)


        val expected = "{" +
                "'fields':[]" +
                "'progress':'visible'" +
                "'error_message':''" +
                "}"

        assert(formView.toString() == expected)
    }

    @Test
    fun `a form is loaded`() {
        val formView = BillingFormViewStub()
        val formRepository = BillingFormRepositoryMock()
        BillingForm().load(formView, formRepository)


        val expected = "{" +
                "'fields':[" +
                    "{" +
                        "'name':'doc_type'," +
                        "'options':['person','company']" +
                    "}," +
                    "{" +
                        "'name':'doc_number'" +
                        "'validation':'*'" +
                    "}]" +
                "'progress':'gone'" +
                "'error_message':''" +
                "}"

        assert(formView.toString() == expected)
    }

    @Test @Ignore
    fun `a user want to submit a form with valid DNI`() {


    }
}
