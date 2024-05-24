# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

-keepattributes Signature, *Annotation*

-keep class com.google.ads.interactivemedia.** { *; }
-keep class com.google.obf.** { *; }
-keep class * extends java.util.ListResourceBundle {
    protected Object[][] getContents();
}

-keepnames class okhttp3.internal.publicsuffix.PublicSuffixDatabase
-dontwarn org.codehaus.mojo.animal_sniffer.*
-dontwarn okhttp3.internal.platform.ConscryptPlatform
-dontwarn sun.misc.**
-dontwarn javax.annotation.**

-keepclassmembers class com.adsbynimbus.openrtb.request.** {
    public *;
}

-keepclassmembers class com.adsbynimbus.openrtb.response.** {
    public *;
}

-keep class * extends com.adsbynimbus.internal.Component { public *; }
-keepclassmembers class com.adsbynimbus.render.internal.NimbusWebViewClient { *; }

# If using the Nimbus GAM Adapter
-keep class com.adsbynimbus.google.NimbusCustomEvent {
    <methods>;
    !static <methods>;
}