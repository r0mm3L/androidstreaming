package com.example.rommelalastra.streaming2;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.Menu;
import androidx.annotation.RecentlyNullable;
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubePlayer;

public class PlayerActivity extends YouTubeBaseActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

                setContentView(R.layout.youtubeplayer);

        youTubePlayerView playerView = (YoutubePlayerView)findViewById(R.id.youTubePlayerView);
        playerView.initialize("DeveloperKey",this);
    }

    public void onIni

}
