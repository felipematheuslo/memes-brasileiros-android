package com.olivenbaum.memesbrasil;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.analytics.FirebaseAnalytics;

public class Serjao extends Activity {

    private FirebaseAnalytics mFirebaseAnalytics;

    private Button naominto;
    private Button duasoumais;
    private Button miau;
    private Button caga;
    private Button pipoco;
    private Button coragem;

    private MediaPlayer som;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.serjao);

        MobileAds.initialize(getApplicationContext(),
                "ca-app-pub-7364145551999763~7109997134");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        mFirebaseAnalytics.setAnalyticsCollectionEnabled(true);

        som = null;

        initialize();
    }

    private void initialize() {

        naominto = (Button) findViewById(R.id.naominto);
        duasoumais = (Button) findViewById(R.id.duasoumais);
        miau = (Button) findViewById(R.id.miau);
        caga = (Button) findViewById(R.id.caga);
        pipoco = (Button) findViewById(R.id.pipoco);
        coragem = (Button) findViewById(R.id.coragem);

        caga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.caga);
                som.start();

            }
        });
        caga.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4aydHhPTS0xbElESDA"));
                startActivity(browserIntent);

                return true;
            }
        });
        pipoco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.pipoco);
                som.start();
            }
        });
        pipoco.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayLVl0bHhVRExRUFk"));
                startActivity(browserIntent);

                return true;
            }
        });
        coragem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.coragem);
                som.start();
            }
        });
        coragem.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayeHcxTjByanRmS3c"));
                startActivity(browserIntent);

                return true;
            }
        });
        naominto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.naominto);
                som.start();
            }
        });
        naominto.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayMnVzb3lRZzRFbTQ"));
                startActivity(browserIntent);

                return true;
            }
        });
        duasoumais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.duasoumais);
                som.start();
            }
        });
        duasoumais.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayek1nRmJyM2IyNE0"));
                startActivity(browserIntent);

                return true;
            }
        });
        miau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.miau);
                som.start();
            }
        });
        miau.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4aycElYVFlWTWJsbUk");
                return true;
            }
        });
    }

    private void share(String link){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
        startActivity(browserIntent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.help) {
            AlertDialog alertDialog = new AlertDialog.Builder(Serjao.this).create();
            alertDialog.setTitle("Como compartilhar um meme: (Método PROVISÓRIO)");
            alertDialog.setMessage(
                    "\n(1) Clique e segure o botão para abrir o arquivo no Google Drive;" +
                            "\n\n(2) Selecione uma conta para abrir o Drive, se necessário;" +
                            "\n\n(3) Clique no ícone com três bolinhas na parte superior direita para abrir o menu;" +
                            "\n\n(4) Clique em 'ENVIAR CÓPIA'."
            );
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                }
            });
            alertDialog.show();
        }
        if (id == R.id.invite) {
            Intent intent2 = new Intent(); intent2.setAction(Intent.ACTION_SEND);
            intent2.setType("text/plain");
            intent2.putExtra(Intent.EXTRA_TEXT,
                    "\nBaixe este app maneirão também! " +
                            "Nele você tem todos os memes para zuar com os amigos, " +
                            "seja no próprio celular ou enviando pelo WhatsApp." +
                            "\n\nhttps://play.google.com/store/apps/details?id=com.olivenbaum.memesbrasil" );
            startActivity(Intent.createChooser(intent2, "Compartilhar com"));
        }
        return super.onOptionsItemSelected(item);
    }
}