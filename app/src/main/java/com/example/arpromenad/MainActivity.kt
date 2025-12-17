package com.example.arpromenad

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.arpromenad.databinding.ActivityMainBinding

/**
 * Главная активность приложения AR-promenad
 * Приложение для распознавания достопримечательностей Москвы с помощью компьютерного зрения
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Инициализация ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
    }

    private fun setupUI() {
        binding.apply {
            // Настройка заголовка
            tvTitle.text = getString(R.string.app_name)
            tvDescription.text = getString(R.string.app_description)

            // Обработчик кнопки запуска камеры
            btnStartCamera.setOnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    "Камера будет добавлена на следующем этапе",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
