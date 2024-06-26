package com.kamikaze.smkcodingproject2.adapter

import android.content.Context
import com.kamikaze.smkcodingproject2.R
import com.kamikaze.smkcodingproject2.dataclass.Home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.home_item.*

class HomeAdapter (private val context: Context, private val items :ArrayList<Home>):
    RecyclerView.Adapter<HomeAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent:ViewGroup, viewType:Int) = ViewHolder (
        LayoutInflater.from(context).inflate(R.layout.home_item, parent,false)
    )

    override fun getItemCount(): Int{
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position:Int){
        holder.bindItem(items.get(position))
    }

    class ViewHolder(override val containerView:View):
        RecyclerView.ViewHolder(containerView),LayoutContainer{
        fun bindItem(item: Home){
        homeName.text = item.judul
            homeDeskripsi.text = item.deskripsi
            homeList1.text = item.list1
            homeList2.text = item.list2
            homeList3.text = item.list3
            homeList4.text = item.list4

        }
    }

}