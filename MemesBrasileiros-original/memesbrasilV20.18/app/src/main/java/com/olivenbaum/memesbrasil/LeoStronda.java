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

public class LeoStronda extends Activity {

    private FirebaseAnalytics mFirebaseAnalytics;

    private Button vouchorar;
    private Button naochora;
    private Button paradechorar;
    private Button soconaboca;
    private Button tobemnao;
    private Button vemmonstro;
    private Button han_hein;

    private MediaPlayer som;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leostronda);

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

        han_hein = (Button) findViewById(R.id.han_hein);
        vouchorar = (Button) findViewById(R.id.vouchorar);
        naochora = (Button) findViewById(R.id.naochora);
        paradechorar = (Button) findViewById(R.id.paradechorar);
        soconaboca = (Button) findViewById(R.id.soconaboca);
        tobemnao = (Button) findViewById(R.id.tobemnao);
        vemmonstro = (Button) findViewById(R.id.vemmonstro);

        vemmonstro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.vemmonstro);
                som.start();

            }
        });
        vemmonstro.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayVTE3T0ZsbERpcFU");
                return true;
            }
        });
        tobemnao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.tobemnao);
                som.start();

            }
        });
        tobemnao.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4aycGc1R2t6YnY1VFE");
                return true;
            }
        });
        soconaboca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.soconaboca);
                som.start();

            }
        });
        soconaboca.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayT1RZLUh6cGt0QW8");
                return true;
            }
        });
        paradechorar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.paradechorar);
                som.start();

            }
        });
        paradechorar.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4aybVpqSmdIdGdhTzg");
                return true;
            }
        });
        naochora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.naochora);
                som.start();

            }
        });
        naochora.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayRlhvZ3ZkcFBMT2s");
                return true;
            }
        });
        vouchorar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.vouchorar);
                som.start();

            }
        });
        vouchorar.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayTUZtNmF3dVYwdk0");
                return true;
            }
        });
        han_hein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.hanhein);
                som.start();

            }
        });
        han_hein.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayM21Uc2psNXNKcFk");
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
            AlertDialog alertDialog = new AlertDialog.Builder(LeoStronda.this).create();
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