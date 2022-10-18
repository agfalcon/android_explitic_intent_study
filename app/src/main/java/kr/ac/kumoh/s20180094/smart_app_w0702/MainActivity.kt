package kr.ac.kumoh.s20180094.smart_app_w0702

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20180094.smart_app_w0702.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

     lateinit  var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnExplicitIntent.setOnClickListener{
            val intent = Intent(this, ImageActivity::class.java)
            startActivity(intent)
        }

        binding.btnYoutube.setOnClickListener{
            val uri = Uri.parse("https://www.youtube.com/results?search_query=${binding.editText.text}")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
}