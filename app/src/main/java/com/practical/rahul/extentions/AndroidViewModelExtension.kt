package com.practical.rahul.extentions
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import com.practical.rahul.lifecycle.SingleLiveData
import com.practical.rahul.utils.MyLoadingDialogUtils

fun <T : ViewModel, L, V> T.manageLoading(activity: FragmentActivity?, lifecycleOwner: LifecycleOwner, liveDataCall: SingleLiveData<L>, liveDataError: SingleLiveData<V>
): T {
    activity?.let { fragmentActivity: FragmentActivity ->
        MyLoadingDialogUtils.showLoadingDialog(fragmentActivity.supportFragmentManager)
        liveDataCall.observe(lifecycleOwner) {
            MyLoadingDialogUtils.dismissLoadingDialog(activity)
        }
        liveDataError.observe(lifecycleOwner) {
            MyLoadingDialogUtils.dismissLoadingDialog(fragmentActivity)
        }
    }
    return this
}

fun <T : ViewModel, L, V> T.manageLoadingWithoutDismiss(activity: FragmentActivity?, lifecycleOwner: LifecycleOwner, liveDataCall: SingleLiveData<L>, liveDataError: SingleLiveData<V>
): T {
    activity?.let { fragmentActivity: FragmentActivity ->
        MyLoadingDialogUtils.showLoadingDialog(fragmentActivity.supportFragmentManager)
        liveDataCall.observe(lifecycleOwner) {
            //  MyLoadingDialogUtils.dismissLoadingDialog(activity)
        }
        liveDataError.observe(lifecycleOwner) {
            MyLoadingDialogUtils.dismissLoadingDialog(fragmentActivity)
        }
    }
    return this
}

