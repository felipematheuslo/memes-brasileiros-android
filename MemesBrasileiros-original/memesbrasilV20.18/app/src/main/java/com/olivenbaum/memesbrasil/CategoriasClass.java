package com.olivenbaum.memesbrasil;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.analytics.FirebaseAnalytics;

public class CategoriasClass extends Activity {

    private FirebaseAnalytics mFirebaseAnalytics;

    private Intent change = new Intent();

    private ImageView item1;
    private ImageView item2;
    private ImageView item3;
    private ImageView item4;
    private ImageView item5;
    private ImageView item6;
    private ImageView item7;
    private ImageView item8;
    private ImageView item9;
    private ImageView item10;

    private MediaPlayer som;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categorias);

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

        if (som != null) {
            if (som.isPlaying()) {
                som.stop();
            }
            som.release();
        }
        som = null;

        item1 = (ImageView) findViewById(R.id.item1);
        item2 = (ImageView) findViewById(R.id.item2);
        item3 = (ImageView) findViewById(R.id.item3);
        item4 = (ImageView) findViewById(R.id.item4);
        item5 = (ImageView) findViewById(R.id.item5);
        item6 = (ImageView) findViewById(R.id.item6);
        item7 = (ImageView) findViewById(R.id.item7);
        item8 = (ImageView) findViewById(R.id.item8);
        item9 = (ImageView) findViewById(R.id.item9);
        item10 = (ImageView) findViewById(R.id.item10);

        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                change.setClass(getApplicationContext(), VinDiesel.class);
                startActivity(change);
            }
        });
        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                change.setClass(getApplicationContext(), BamBam.class);
                startActivity(change);
            }
        });
        item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                change.setClass(getApplicationContext(), Faustao.class);
                startActivity(change);
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                change.setClass(getApplicationContext(), Away.class);
                startActivity(change);
            }
        });
        item5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                change.setClass(getApplicationContext(), Serjao.class);
                startActivity(change);
            }
        });
        item6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                change.setClass(getApplicationContext(), Songs.class);
                startActivity(change);
            }
        });
        item7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                change.setClass(getApplicationContext(), LeoStronda.class);
                startActivity(change);
            }
        });
        item8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                change.setClass(getApplicationContext(), SilvioSantos.class);
                startActivity(change);
            }
        });
        item9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                change.setClass(getApplicationContext(), OutrosMemes.class);
                startActivity(change);
            }
        });
        item10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                change.setClass(getApplicationContext(), Papaco.class);
                startActivity(change);
            }
        });
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
            AlertDialog alertDialog = new AlertDialog.Builder(CategoriasClass.this).create();
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