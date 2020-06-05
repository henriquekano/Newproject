package com.newproject;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import com.example.camerabioandroid.camerabiomanager.CallbackCameraBio;
import com.example.camerabioandroid.camerabiomanager.CameraBioManager;
import com.facebook.react.ReactActivity;

import androidx.annotation.Nullable;

public class MainActivity extends ReactActivity implements CallbackCameraBio {
  private static final String LOG_TAG = MainActivity.class.getCanonicalName();

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);

  }

  @Override
  protected void onResume() {
    super.onResume();
    CameraBioManager bm = new CameraBioManager(this);
    bm.startCameraDocument(CameraBioManager.CNH);
  }

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "newproject";
  }

  @Override
  public void onSuccessCapture(String base64) {
    Log.i(LOG_TAG, base64);
  }

  @Override
  public void onSuccessCaptureDocument(String base64) {
    Log.i(LOG_TAG, base64);

  }

  @Override
  public void onFailedCapture(String description) {
    Log.i(LOG_TAG, description);

  }
}
