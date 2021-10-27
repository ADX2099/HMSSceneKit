package com.huawei.adx2099scenekit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceHolder;

import com.huawei.hms.scene.sdk.SceneView;

public class SceneViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_view);
        setContentView(new SceneSample(this));

    }


    public class SceneSample extends SceneView{

        public SceneSample(Context context) {
            super(context);
        }

        @Override
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            super.surfaceCreated(surfaceHolder);
            loadScene("FaceView/scene.gltf");

        }

        @Override
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {
            super.surfaceChanged(surfaceHolder, i, i1, i2);
        }

        @Override
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            super.surfaceDestroyed(surfaceHolder);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
        }
    }
}