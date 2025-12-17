# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.kts.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Keep ML Kit models
-keep class com.google.mlkit.** { *; }
-keep class com.google.android.gms.** { *; }

# Keep ARCore classes
-keep class com.google.ar.** { *; }

# Keep data classes
-keep class com.example.arpromenad.data.** { *; }
