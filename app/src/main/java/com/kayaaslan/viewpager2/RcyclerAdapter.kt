package com.kayaaslan.viewpager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.squareup.picasso.Picasso


class RcyclerAdapter:RecyclerView.Adapter<RcyclerAdapter.PostHolder>() {

    class PostHolder(view : View):RecyclerView.ViewHolder(view){


        var textView :TextView?=null
        var imageView1 :ImageView?=null
        var imageView2 :ImageView?=null
        init {

            textView=view.findViewById(R.id.textView)
            imageView1=view.findViewById(R.id.imageView1)
            imageView2=view.findViewById(R.id.imageView2)


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        val inflater =LayoutInflater.from(parent.context)
        val view =inflater.inflate(R.layout.recycler_view_row1,parent,false)
        return PostHolder(view)

    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        if (position==0){
            holder.textView!!.text="Ballarımız tamamen doğal olup çiçek poleni ile üretilmektedir. Yozgatın çandır ilçesinde bulunan Hacı Mehmet Kayaaslan babasının tecrübesi ile uzmanların bilgisini birleştirip hiçbir ilac ve benzeri bala geçebilecek kimyasal madde kullanmadan, arının emeklerini sofralarınıza ulaştırmaktadır. "

           Picasso.get().load("https://pbs.twimg.com/media/DoPfOwkWsAA_Bhp?format=jpg&name=900x900").into(holder.imageView1)

            Picasso.get().load("https://pbs.twimg.com/media/EI4II8lX0AA11ht?format=jpg&name=medium").into(holder.imageView2)


        }
    }

    override fun getItemCount(): Int {
        return 1
    }

}