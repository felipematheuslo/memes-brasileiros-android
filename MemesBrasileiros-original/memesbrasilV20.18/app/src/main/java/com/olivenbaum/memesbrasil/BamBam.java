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

public class BamBam extends Activity {

    private FirebaseAnalytics mFirebaseAnalytics;

    private Button bodybuilder;
    private Button birl;
    private Button horadoshow;
    private Button jaula;
    private Button trapeziodescendente;

    private MediaPlayer som;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bambam);

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

        bodybuilder = (Button) findViewById(R.id.bodybuilder);
        birl = (Button) findViewById(R.id.birl);
        horadoshow = (Button) findViewById(R.id.horadoshow);
        jaula = (Button) findViewById(R.id.jaula);
        trapeziodescendente = (Button) findViewById(R.id.trapeziodescendente);

        birl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.birl);
                som.start();
            }
        });
        birl.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayV0N5WWZaUjdxc1E"));
                startActivity(browserIntent);

                return true;
            }
        });
        horadoshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.horadoshow);
                som.start();
            }
        });
        horadoshow.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4aydksxcFVtSENPbHM"));
                startActivity(browserIntent);

                return true;
            }
        });
        trapeziodescendente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.trapezio);
                som.start();
            }
        });
        trapeziodescendente.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayVVFlQW00cHJycEk"));
                startActivity(browserIntent);

                return true;
            }
        });
        jaula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.jaula);
                som.start();
            }
        });
        jaula.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayb0lreC1qblBJUzQ"));
                startActivity(browserIntent);

                return true;
            }
        });
        bodybuilder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.bodybuilder);
                som.start();
            }
        });
        bodybuilder.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayUndFZHVzdFR3eFE"));
                startActivity(browserIntent);

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
            AlertDialog alertDialog = new AlertDialog.Builder(BamBam.this).create();
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