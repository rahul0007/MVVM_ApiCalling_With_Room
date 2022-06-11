package com.practical.rahul.extentions
import android.accounts.NetworkErrorException
import android.content.Context
import com.practical.rahul.R
import com.practical.rahul.utils.NetworkUtils
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope


fun CoroutineScope.manageNetwork(
    context: Context,
    coroutineExceptionHandler: CoroutineExceptionHandler
): CoroutineScope? {
    if (!NetworkUtils.isOnline(context)) {
        coroutineExceptionHandler.handleException(
            this.coroutineContext, NetworkErrorException(
                context.getString(
                    R.string.no_connection_available
                )
            )
        )
        return null
    }
    return this
}