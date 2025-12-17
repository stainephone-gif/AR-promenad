package com.example.arpromenad.utils

/**
 * Константы приложения
 */
object Constants {

    // Настройки камеры
    const val CAMERA_ASPECT_RATIO_16_9 = 16.0 / 9.0
    const val CAMERA_ASPECT_RATIO_4_3 = 4.0 / 3.0

    // Настройки ML модели
    const val ML_MODEL_INPUT_SIZE = 224
    const val ML_CONFIDENCE_THRESHOLD = 0.6f
    const val ML_MAX_RESULTS = 5

    // Названия моделей
    const val MODEL_LANDMARKS = "landmarks_model.tflite"
    const val MODEL_LABELS = "labels.txt"

    // Настройки ARCore
    const val AR_MIN_DISTANCE = 1.0f // метры
    const val AR_MAX_DISTANCE = 100.0f // метры

    // Настройки геолокации
    const val LOCATION_UPDATE_INTERVAL = 5000L // мс
    const val LOCATION_FASTEST_INTERVAL = 2000L // мс
    const val LOCATION_MIN_DISTANCE = 10f // метры

    // Database
    const val DATABASE_NAME = "ar_promenad_db"
    const val DATABASE_VERSION = 1

    // SharedPreferences
    const val PREFS_NAME = "ar_promenad_prefs"
    const val PREF_FIRST_LAUNCH = "first_launch"
    const val PREF_TUTORIAL_SHOWN = "tutorial_shown"

    // Известные достопримечательности Москвы (будут в базе данных)
    object Landmarks {
        const val RED_SQUARE = "Красная площадь"
        const val KREMLIN = "Московский Кремль"
        const val SAINT_BASIL = "Собор Василия Блаженного"
        const val CHRIST_SAVIOR = "Храм Христа Спасителя"
        const val BOLSHOI = "Большой театр"
        const val OSTANKINO = "Останкинская башня"
        const val VDNH = "ВДНХ"
        const val GORKY_PARK = "Парк Горького"
        const val MOSCOW_CITY = "Москва-Сити"
        const val NOVODEVICHY = "Новодевичий монастырь"
    }

    // Типы достопримечательностей
    object LandmarkTypes {
        const val HISTORICAL = "historical"
        const val RELIGIOUS = "religious"
        const val CULTURAL = "cultural"
        const val PARK = "park"
        const val MODERN = "modern"
    }
}
