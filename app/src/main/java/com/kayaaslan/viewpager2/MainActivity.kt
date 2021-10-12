package com.kayaaslan.viewpager2

import android.content.Context
import android.media.session.MediaController
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView
import com.google.android.material.tabs.TabLayoutMediator
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.recycler_view_row1.*

class MainActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)

        viewPager.adapter=adapter


        TabLayoutMediator(tabLayout,viewPager){tab, position ->



            if (position==0){
                tab.text="Anasayfa"

            }else {
                tab.text = "İletişim"
            }



        }.attach()

    }


}