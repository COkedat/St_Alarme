package com.example.receiving

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Switch
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvDate = findViewById<TextView>(R.id.tv_date)

        // 최상위 부모에서 카드뷰로 연결
        val cardAlert = findViewById<CardView>(R.id.card_alert)

        //카드뷰에서 ConstraintLayout으로 연결
        val cardCL = findViewById<ConstraintLayout>(R.id.card_cl)

        // ConstraintLayout에서 스위치에 연결
        val swCard = cardCL.findViewById<Switch>(R.id.swAlert)

        val fabAdd = findViewById<FloatingActionButton>(R.id.fabAdd)

        val tvTime = cardCL.findViewById<TextView>(R.id.tvTime)
        val tvDay = cardCL.findViewById<TextView>(R.id.tvDay)
        val tv_Date = findViewById<TextView>(R.id.tvDate)


        if (swCard.isChecked){
            tvTime.setTextColor(ContextCompat.getColor(this,R.color.black))
            tvDay.setTextColor(ContextCompat.getColor(this,R.color.black))
            tv_Date.setTextColor(ContextCompat.getColor(this,R.color.black))
            tvDate.text="3일 후에 알람이 울려요"
        }
        else{
            tvTime.setTextColor(ContextCompat.getColor(this,R.color.gray))
            tvDay.setTextColor(ContextCompat.getColor(this,R.color.gray))
            tv_Date.setTextColor(ContextCompat.getColor(this,R.color.gray))
            tvDate.text="예정된 알람 없음"
        }

        swCard.setOnCheckedChangeListener { compoundButton, b ->
            if (b){ // 활성화
                tvTime.setTextColor(ContextCompat.getColor(this,R.color.black))
                tvDay.setTextColor(ContextCompat.getColor(this,R.color.black))
                tv_Date.setTextColor(ContextCompat.getColor(this,R.color.black))
                tvDate.text="3일 후에 알람이 울려요"
            }
            else{ // 비활성화
                tvTime.setTextColor(ContextCompat.getColor(this,R.color.gray))
                tvDay.setTextColor(ContextCompat.getColor(this,R.color.gray))
                tv_Date.setTextColor(ContextCompat.getColor(this,R.color.gray))
                tvDate.text="예정된 알람 없음"
            }
        }


        fabAdd.setOnClickListener{
            val intent = Intent(this, CreateAlertActivity::class.java)
            startActivity(intent)

        }

        //getter
        val tvDateStr= tvDate.text
        //setter
        //tvDate.text = "3일 후에 알람이 울려요"
    }
}