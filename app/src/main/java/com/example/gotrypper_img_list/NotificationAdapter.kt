package com.example.gotrypper_img_list

import android.app.Activity
import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.TextView

class MyAdapter(private val context: Context, private val arrayList: java.util.ArrayList<noti_Class>) : BaseAdapter() {
private lateinit var imga: ImageView
private lateinit var City: TextView
private lateinit var act: TextView
override fun getCount(): Int {
    return arrayList.size
}
override fun getItem(position: Int): Any {
    return position
}
override fun getItemId(position: Int): Long {
    return position.toLong()
}
override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
    var convertView = convertView
    convertView = LayoutInflater.from(context).inflate(R.layout.img_data, parent, false)
    imga = convertView.findViewById(R.id.beaitiful_img)
    City = convertView.findViewById(R.id.city)
    act = convertView.findViewById(R.id.act)
    City.text = " " + arrayList[position].City
    act.text = arrayList[position].activi
    imga.setImageResource(arrayList[position].beautiful_img)
    return convertView
}
}

