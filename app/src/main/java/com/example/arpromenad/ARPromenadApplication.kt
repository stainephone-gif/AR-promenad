package com.example.arpromenad

import android.app.Application
import android.util.Log

/**
 * Класс приложения для глобальной инициализации
 */
class ARPromenadApplication : Application() {

    companion object {
        private const val TAG = "ARPromenadApp"
        lateinit var instance: ARPromenadApplication
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        Log.d(TAG, "AR-promenad Application started")

        // Здесь можно добавить инициализацию:
        // - Analytics
        // - Crash reporting
        // - ML Models предзагрузка
        // - Database initialization
    }
}
