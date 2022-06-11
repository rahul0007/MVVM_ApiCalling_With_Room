package com.practical.rahul.ui.activity.login
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.practical.rahul.R
import com.practical.rahul.exception.ApplicationException
import com.practical.rahul.extentions.manageLoading
import com.practical.rahul.ui.activity.screenSaver.ScreenSaverActivity
import com.practical.rahul.ui.base.BaseActivity
import com.practical.rahul.viewModel.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_login.*

@AndroidEntryPoint
class LoginActivity : BaseActivity(), View.OnClickListener {
    lateinit var loginViewModel: LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setOnClickListener()
    }

    override fun findFragmentPlaceHolder() = 0

    override fun findContentView() = R.layout.activity_login

    override fun observeViewModel() {
        var ic = Hc()
        Log.e("values","test"+ic.p)
        loginViewModel = ViewModelProvider(this)[LoginViewModel::class.java]
        loginViewModel.delegateLogin.observe(this) {
            if (it?.isSuccess == true) {
                ScreenSaverActivity.start(this)
                Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, it?.message, Toast.LENGTH_SHORT).show()
            }
        }

        loginViewModel.errorLiveData.observe(this) {
            it.messageTitle?.let { it1 ->
                Toast.makeText(this, it1, Toast.LENGTH_SHORT).show()
            }
        }
    }

    class Hc {
        val p = 10;
    }

    private fun setOnClickListener() {
        buttonLogin.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.buttonLogin -> {
                if (isValidate()) {
                    loginViewModel.manageLoading(
                        this, this, loginViewModel.delegateLogin,
                        loginViewModel.errorLiveData
                    ).getLogin(editTextEmail.text.toString(), editTextPassword.text.toString())
                }
            }
        }
    }


    private fun isValidate(): Boolean {
        try {
            validator.submit(editTextEmail).checkEmpty()
                .errorMessage(getString(R.string.validation_empty_email)).checkValidEmail()
                .errorMessage(getString(R.string.validation_valid_email)).check()
            validator.submit(editTextPassword).checkEmpty()
                .errorMessage(getString(R.string.validation_empty_password)).check()
            return true
        } catch (e: ApplicationException) {
            Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
        }
        return false
    }
}
