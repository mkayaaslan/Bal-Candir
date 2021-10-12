package com.kayaaslan.viewpager2.Fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.kayaaslan.viewpager2.R
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_second.*


class SecondFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        iletisim1.setOnClickListener {

            var url = "https://www.instagram.com/balcandir/"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
            
        }
        iletisim2.setOnClickListener {

            var url = "https://www.facebook.com/balcandir/"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

        iletisim3.setOnClickListener {
            var url = "https://twitter.com/balcandir"
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))

        }



    }




}
