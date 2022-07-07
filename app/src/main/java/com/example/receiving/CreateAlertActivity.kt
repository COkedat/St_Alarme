package com.example.receiving

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.nex3z.togglebuttongroup.MultiSelectToggleGroup

class CreateAlertActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_alert)

        val iBBack = findViewById<ImageButton>(R.id.iBBack)

        iBBack.setOnClickListener {
            finish()
        }

        val buttongroup = findViewById<MultiSelectToggleGroup>(R.id.group_weekdays)

        buttongroup.setOnCheckedChangeListener { group, checkedId, isChecked ->
            when (checkedId){
                //
                //R.id.sun ->
            }
        }
    }
}