package com.hasanbilgin.landmarbookkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hasanbilgin.landmarbookkotlin.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {


    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val intent = getIntent()
        // as Model demek selectedModelda name vs çıkmıyordu
//        val selectedModel=intent.getSerializableExtra("model") as Model
        //bölede alınabilir
        val selectedModel = MySingleton.chosenModel
        selectedModel?.let {


            binding.nameTextview.text = it.name
            binding.countryTextview.text = it.country
//            binding.imageView.setImageResource(selectedModel.image)//yada
            binding.imageView.setImageResource(it.image)
        }

    }
}