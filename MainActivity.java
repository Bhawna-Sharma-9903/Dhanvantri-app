package com.example.ayurveda;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.MediaController;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import com.example.ayurveda.R;

public class MainActivity extends AppCompatActivity {
    VideoView videov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoView = (VideoView) findViewById(R.id.videoView);  //casting to VideoView is not Strictly required above API level 26
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.dhanvantri); //set the path of the video that we need to use in our VideoView
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}