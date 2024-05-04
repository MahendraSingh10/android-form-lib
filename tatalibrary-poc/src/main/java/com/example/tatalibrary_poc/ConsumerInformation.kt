package com.example.tatalibrary_poc

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity


class ConsumerInformation {
    companion object {
        fun generateConsumerForm(context: Context, messageString: String) {
            Toast.makeText(context, messageString, Toast.LENGTH_SHORT).show()
        }
    }

}