package com.example.gotrypper_img_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var arrayList: ArrayList<noti_Class> = ArrayList()
    var adapter: MyAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ap: MyAdapter? = null
        val image: Int = R.drawable.gotrypper
        arrayList.add(noti_Class(image, "Agra","1 Activity"))
        arrayList.add(noti_Class(image,"New Delhi","2 Activity"))

        ap = MyAdapter(this, arrayList)
        list_item.adapter = ap

//        setSupportActionBar(noti_toolbar)
//        val actionbar = supportActionBar
//
//        actionbar?.apply {
//            // Set toolbar title/app title
//            title = "Notifications"
//            actionbar.setDisplayHomeAsUpEnabled(true)
//            actionbar.setDisplayHomeAsUpEnabled(true)
//        }
    }
//    override fun onSupportNavigateUp(): Boolean {
//        onBackPressed()
//        return true
//    }

}
