package com.cloudnote.sync.helper

import android.app.Application
import android.content.Context
import com.cloudnote.sync.helper.common.GlobalState

class AppApplication : Application() {
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        GlobalState.init(this)
    }
}
