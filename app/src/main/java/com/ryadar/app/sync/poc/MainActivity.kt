package com.ryadar.app.sync.poc

import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.amplifyframework.api.graphql.model.ModelMutation
import com.amplifyframework.api.graphql.model.ModelQuery
import com.amplifyframework.core.Amplify
import com.ryadar.app.sync.poc.ui.theme.AWSAppSyncPOCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AWSAppSyncPOCTheme {
                // A surface container using the 'background' color from the theme
                Column() {
                    Column() {
                        Button(onClick = {
        Amplify.API.query(
            ModelQuery.get(Profile::class.java,"1"),
            {
               // Toast.makeText(applicationContext,"Query results = ${(it)}",Toast.LENGTH_SHORT).show()
                Log.i("MyAmplifyApp", "Query results = ${(it)}")
            },
            {
               //Toast.makeText(applicationContext,"Query failed = $it",Toast.LENGTH_SHORT).show()
                Log.e("MyAmplifyApp", "Query failed", it)
            }
        )
                        }) {
                            Text(text = "Query ")
                        }
                    }
                    Column {
                        Button(onClick = {
                            Amplify.API.query(
                                ModelQuery.list(Profile::class.java),
                                {
                                   // Toast.makeText(applicationContext,"Query results = ${(it)}",Toast.LENGTH_SHORT).show()
                                    Log.i("MyAmplifyApp", "Query results = ${(it)}")
                                },
                                {
                                  //  Toast.makeText(applicationContext,"Query failed = $it",Toast.LENGTH_SHORT).show()
                                    Log.e("MyAmplifyApp", "Query failed", it)
                                }
                            )

                        }) {
                            Text(text = "Query List")
                        }
                    }
                    Column {
                        Button(onClick = {
                            val todo = Profile.builder()
            .name("Raja").id("1").email("r@2.com").phoneNumber("210-123-4567")
            .build()

        Amplify.API.mutate(ModelMutation.create(todo),{
             Log.i("Test","Success")
           // Toast.makeText(applicationContext,"mutation success",Toast.LENGTH_SHORT).show()
        },{
            Log.i("Test","Failure")
           // Toast.makeText(applicationContext,"mutation failed",Toast.LENGTH_SHORT).show()
        })


                        }) {
                            Text(text = "Query Mutation")
                        }
                    }
                    Column {
                        Button(onClick = {}) {
                            Text(text = "Query Subscription")
                        }
                    }

                }
            }
        }
    }
}
