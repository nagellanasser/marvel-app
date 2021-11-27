package fatec.padroesdeprojeto.io.marvelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fatec.padroesdeprojeto.io.marvelapp.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}