package com.ryadar.app.sync.poc

import android.app.Application
import android.util.Log
import android.widget.Toast
import com.amplifyframework.api.aws.AWSApiPlugin
import com.amplifyframework.core.Amplify

class MyApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        try {
            Amplify.addPlugin(AWSApiPlugin())
            Amplify.configure(applicationContext)
            Toast.makeText(applicationContext,"configuration Success",Toast.LENGTH_SHORT).show()
            Log.i("Aws-App-Sync_POC","configuration Success")
        }catch (e :Exception){
            Log.i("Aws-App-Sync_POC","configuration Failure")
            Log.i("Aws-App-Sync_POC","Error Message${e.message}")
            Toast.makeText(applicationContext,"configuration Failure",Toast.LENGTH_SHORT).show()
        }
    }
}