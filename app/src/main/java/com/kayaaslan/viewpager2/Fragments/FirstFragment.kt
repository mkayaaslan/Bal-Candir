package com.kayaaslan.viewpager2.Fragments

import android.media.session.MediaController
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isInvisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.kayaaslan.viewpager2.R
import com.kayaaslan.viewpager2.RcyclerAdapter
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.recycler_view_row1.*
import java.io.FileDescriptor
import java.io.PrintWriter


class FirstFragment() : Fragment() {

    var adapter : RcyclerAdapter?=null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        var layouManager = LinearLayoutManager(context)
        recyclerView.layoutManager=layouManager

         adapter = RcyclerAdapter()
        recyclerView.adapter=adapter
        adapter!!.notifyDataSetChanged()







    }


}
