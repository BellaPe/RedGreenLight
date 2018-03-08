package com.example.android.redgreenlight;

/**
 * Created by Android on 07/03/2018.
 */


import android.app.WallpaperManager;
import java.io.IOException;

public class WallpaperChanger {

    // Note: on newer Android Studio (2.3+) there is a warning for using images from the drawable directory.
    // The solution is to use them from the raw directory.
    // This may solve the crashes of large images resides in the drawable directory.:
    private static int imageIDs = R.raw.beatles;

    public static void changeWallpaper() throws IOException {

        WallpaperManager wallpaperManager = WallpaperManager.getInstance(MyApp.getContext());

        int imageID = imageIDs;

        wallpaperManager.setResource(imageID);
    }
}