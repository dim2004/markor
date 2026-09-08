/*#######################################################
 *
 *   Instant Note launcher for the custom Markor build.
 *
 *   License of this file: Apache 2.0
 *
 #########################################################*/
package net.gsantner.markor.activity.openeditor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import net.gsantner.markor.activity.MainActivity;

public class OpenInstantNoteActivity extends Activity {
    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Intent intent = new Intent(this, MainActivity.class);
        intent.setAction(MainActivity.ACTION_CREATE_INSTANT_NOTE);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
        finish();
    }
}
