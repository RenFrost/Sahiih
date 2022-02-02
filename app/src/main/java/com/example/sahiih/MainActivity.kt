package com.example.sahiih

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.util.Log
import android.view.Menu
import android.widget.Adapter
import android.widget.TextView
import android.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.viewpager2.widget.ViewPager2
import com.example.sahiih.adapter.ImageSliderAdapter
import com.example.sahiih.data.ImageData
import com.example.sahiih.data.Products
import com.example.sahiih.databinding.MainActivityBinding
import com.example.sahiih.ui.main.HomeFragment

const val LOG_TAG = "lifecycle_monitor"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding
    private lateinit var adapter: ImageSliderAdapter
    private val list = ArrayList<ImageData>()
    private lateinit var  dots: ArrayList<TextView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list.add(
            ImageData(
                "https://i.imgur.com/OZObONF.jpg"
            )
        )

        list.add(
            ImageData(
                "https://i.imgur.com/idZADu9.jpg"
            )
        )

        list.add(
            ImageData(
                "https://i.imgur.com/M2VvXlw.jpg"
            )
        )

        adapter = ImageSliderAdapter(list)
        binding.viewPager.adapter = adapter
        dots = ArrayList()
        setIndicator()

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                selectedDot(position)
                super.onPageSelected(position)
            }
        })


        if (savedInstanceState != null) return

        supportFragmentManager.commit {
            add<HomeFragment>(R.id.container, null)
        }
    }

    private fun selectedDot(position: Int) {

        for(i in 0 until list.size){
            if(i == position)
                dots[i].setTextColor(ContextCompat.getColor(this, R.color.design_default_color_on_primary))
            else
                dots[i].setTextColor(ContextCompat.getColor(this, R.color.design_default_color_on_secondary))
        }

    }

    private fun setIndicator() {
        for(i in 0 until list.size){
            dots.add(TextView(this))
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                dots[i].text = Html.fromHtml("&#9679", Html.FROM_HTML_MODE_LEGACY).toString()
            }else{
                dots[i].text = Html.fromHtml("&#9679")
            }
            dots[i].textSize = 18f
            binding.dotsIndicator.addView(dots[i])
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }
}