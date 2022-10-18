package kr.ac.kumoh.s20180094.smart_app_w0702

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20180094.smart_app_w0702.databinding.ActivityImageBinding

class ImageActivity : AppCompatActivity() {

    lateinit var binding : ActivityImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}