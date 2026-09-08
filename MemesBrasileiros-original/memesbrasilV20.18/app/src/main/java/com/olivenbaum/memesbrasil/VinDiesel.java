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

public class VinDiesel extends Activity {

    private FirebaseAnalytics mFirebaseAnalytics;

    private Button what;
    private Button yes;
    private Button no;
    private Button nospeak;
    private Button canhug;
    private Button canhug2;

    private MediaPlayer som;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vindiesel);

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

        what = (Button) findViewById(R.id.what);
        yes = (Button) findViewById(R.id.yes);
        no = (Button) findViewById(R.id.no);
        nospeak = (Button) findViewById(R.id.nospeak);
        canhug = (Button) findViewById(R.id.canhug);
        canhug2 = (Button) findViewById(R.id.canhug2);

        canhug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.canhug);
                som.start();

            }
        });
        canhug.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayU3ExQ2lJU0tnUlE");
                return true;
            }
        });
        canhug2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.canhug2);
                som.start();


            }
        });
        canhug2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {

                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayalpWRm0tNFFLdGM"));
                startActivity(browserIntent);

                return true;
            }
        });
        nospeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.nospeak);
                som.start();

            }
        });
        nospeak.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {

                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4aya2NCbGtEVi0tWUE"));
                startActivity(browserIntent);

                return true;
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.no);
                som.start();

            }
        });
        no.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {

                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayeW1Kd01GU0pqZ3M"));
                startActivity(browserIntent);

                return true;
            }
        });
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.yes);
                som.start();

            }
        });
        yes.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {

                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4aycnh4WWN0QmhodHc"));
                startActivity(browserIntent);

                return true;
            }
        });
        what.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.what);
                som.start();

            }
        });
        what.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {

                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayNkw0VnBidnd4MzA"));
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
            AlertDialog alertDialog = new AlertDialog.Builder(VinDiesel.this).create();
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