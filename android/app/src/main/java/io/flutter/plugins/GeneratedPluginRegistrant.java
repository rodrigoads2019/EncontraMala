package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.connectivity.ConnectivityPlugin;
import com.mr.flutter.plugin.filepicker.FilePickerPlugin;
import io.flutter.plugins.firebase.core.FirebaseCorePlugin;
import io.flutter.plugins.firebase.storage.FirebaseStoragePlugin;
import io.flutter.plugins.googlemaps.GoogleMapsPlugin;
import io.flutter.plugins.imagepicker.ImagePickerPlugin;
import com.lyokone.location.LocationPlugin;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
import com.tekartik.sqflite.SqflitePlugin;
import io.flutter.plugins.videoplayer.VideoPlayerPlugin;
import io.flutter.plugins.webviewflutter.WebViewFlutterPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    ConnectivityPlugin.registerWith(registry.registrarFor("io.flutter.plugins.connectivity.ConnectivityPlugin"));
    FilePickerPlugin.registerWith(registry.registrarFor("com.mr.flutter.plugin.filepicker.FilePickerPlugin"));
    FirebaseCorePlugin.registerWith(registry.registrarFor("io.flutter.plugins.firebase.core.FirebaseCorePlugin"));
    FirebaseStoragePlugin.registerWith(registry.registrarFor("io.flutter.plugins.firebase.storage.FirebaseStoragePlugin"));
    GoogleMapsPlugin.registerWith(registry.registrarFor("io.flutter.plugins.googlemaps.GoogleMapsPlugin"));
    ImagePickerPlugin.registerWith(registry.registrarFor("io.flutter.plugins.imagepicker.ImagePickerPlugin"));
    LocationPlugin.registerWith(registry.registrarFor("com.lyokone.location.LocationPlugin"));
    PathProviderPlugin.registerWith(registry.registrarFor("io.flutter.plugins.pathprovider.PathProviderPlugin"));
    SharedPreferencesPlugin.registerWith(registry.registrarFor("io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin"));
    SqflitePlugin.registerWith(registry.registrarFor("com.tekartik.sqflite.SqflitePlugin"));
    VideoPlayerPlugin.registerWith(registry.registrarFor("io.flutter.plugins.videoplayer.VideoPlayerPlugin"));
    WebViewFlutterPlugin.registerWith(registry.registrarFor("io.flutter.plugins.webviewflutter.WebViewFlutterPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
