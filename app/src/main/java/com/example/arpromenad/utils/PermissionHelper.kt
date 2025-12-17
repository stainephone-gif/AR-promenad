package com.example.arpromenad.utils

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

/**
 * Вспомогательный класс для работы с разрешениями
 */
object PermissionHelper {

    // Константы для запросов разрешений
    const val CAMERA_PERMISSION_CODE = 1001
    const val LOCATION_PERMISSION_CODE = 1002
    const val ALL_PERMISSIONS_CODE = 1003

    // Необходимые разрешения
    val CAMERA_PERMISSIONS = arrayOf(
        Manifest.permission.CAMERA
    )

    val LOCATION_PERMISSIONS = arrayOf(
        Manifest.permission.ACCESS_FINE_LOCATION,
        Manifest.permission.ACCESS_COARSE_LOCATION
    )

    val ALL_REQUIRED_PERMISSIONS = CAMERA_PERMISSIONS + LOCATION_PERMISSIONS

    /**
     * Проверяет, предоставлено ли разрешение на камеру
     */
    fun hasCameraPermission(context: Context): Boolean {
        return ContextCompat.checkSelfPermission(
            context,
            Manifest.permission.CAMERA
        ) == PackageManager.PERMISSION_GRANTED
    }

    /**
     * Проверяет, предоставлены ли разрешения на геолокацию
     */
    fun hasLocationPermission(context: Context): Boolean {
        return ContextCompat.checkSelfPermission(
            context,
            Manifest.permission.ACCESS_FINE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED
    }

    /**
     * Проверяет, предоставлены ли все необходимые разрешения
     */
    fun hasAllPermissions(context: Context): Boolean {
        return ALL_REQUIRED_PERMISSIONS.all {
            ContextCompat.checkSelfPermission(context, it) == PackageManager.PERMISSION_GRANTED
        }
    }

    /**
     * Запрашивает разрешение на камеру
     */
    fun requestCameraPermission(activity: Activity) {
        ActivityCompat.requestPermissions(
            activity,
            CAMERA_PERMISSIONS,
            CAMERA_PERMISSION_CODE
        )
    }

    /**
     * Запрашивает разрешения на геолокацию
     */
    fun requestLocationPermission(activity: Activity) {
        ActivityCompat.requestPermissions(
            activity,
            LOCATION_PERMISSIONS,
            LOCATION_PERMISSION_CODE
        )
    }

    /**
     * Запрашивает все необходимые разрешения
     */
    fun requestAllPermissions(activity: Activity) {
        ActivityCompat.requestPermissions(
            activity,
            ALL_REQUIRED_PERMISSIONS,
            ALL_PERMISSIONS_CODE
        )
    }

    /**
     * Проверяет результат запроса разрешений
     */
    fun isPermissionGranted(
        grantResults: IntArray
    ): Boolean {
        return grantResults.isNotEmpty() &&
                grantResults.all { it == PackageManager.PERMISSION_GRANTED }
    }
}
