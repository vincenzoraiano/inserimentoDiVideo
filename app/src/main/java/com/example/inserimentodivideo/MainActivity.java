package com.example.inserimentodivideo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creo una varibile di tipo Videoview, con l'id del video che è un elemento del layout
        VideoView introduzione=findViewById(R.id.videoId);

        //In questo modo cerco il video nella sua cartella resource.
        introduzione.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.demo);
        //Creo il media controller, che permette di controllare la riproduzione del video
        MediaController mediaController=new MediaController(this);

        //al media controller appena creato gli associo la variabile Videoview
        mediaController.setAnchorView(introduzione);
        //alla nostra variabile gli associamo il media controller appena creato.
        introduzione.setMediaController(mediaController);
        //appena l'app viene lanciata il video viene riprodotto.
        introduzione.start();

    }
}
