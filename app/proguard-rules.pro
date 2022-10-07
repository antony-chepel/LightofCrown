# Facebook
-keep class com.facebook.** {
   *;
}
-dontwarn kotlinx.coroutines.**
#Lottie
-dontwarn com.airbnb.lottie.**
-keep class com.airbnb.lottie.** {*;}
# Appsflyer
-dontwarn com.appsflyer.AFKeystoreWrapper

-keepnames class * implements android.os.Parcelable
-keepclassmembers class * implements android.os.Parcelable {
  public static final *** CREATOR;
}
# Onesignal
-dontwarn com.onesignal.**

-keep class com.onesignal.ActivityLifecycleListenerCompat** {*;}
#Coroutines
-keep class kotlinx.coroutines.**

