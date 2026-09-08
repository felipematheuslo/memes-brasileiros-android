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

public class OutrosMemes extends Activity {

    private FirebaseAnalytics mFirebaseAnalytics;

    private Button fei;
    private Button dougras;
    private Button irineu;
    private Button kevinhoacredita;
    private Button seubuceta;
    private Button vamofecha;
    private Button maisoumenos;
    private Button masoq;
    private Button tedououtra;
    private Button mizeravi;
    private Button aspalavra;
    private Button burro;
    private Button carlosalberto;
    private Button legal;
    private Button mintira;
    private Button oqelefalou;
    private Button porcaria;
    private Button querocafe;
    private Button cachoeira;
    private Button gemendo;
    private Button demencia;
    private Button nadaver;
    private Button naotolouco;
    private Button vaamerda;
    private Button sefoda;
    private Button morrediabo;
    private Button naointeressa;
    private Button bixona;
    private Button hardcore;
    private Button asideia;
    private Button bichao;
    private Button cagado;
    private Button cepo;
    private Button cepobemduro;
    private Button choque;
    private Button delicia;
    private Button olamarilene;
    private Button sabianao;
    private Button taumaporra;
    private Button piruleta;
    private Button berg;
    private Button sourica;
    private Button rolezeira;
    private Button souumafoca;
    private Button caraiborracha;
    private Button ahva;
    private Button ne;
    private Button viadaobonito;
    private Button mederrubaram;
    private Button ai_meu_cu;
    private Button cachorro;
    private Button pesadao;
    private Button coe_rapaziada;
    private Button dormir;
    private Button eso;
    private Button voucair;
    private Button falafiote;
    private Button miauovo;
    private Button nuncanemvi;
    private Button souummerda;
    private Button vocequefuma;
    private Button devolvernao;
    private Button ehmeu;
    private Button vaifazeroq;

    private MediaPlayer som;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.outrosmemes);

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

        gemendo = (Button) findViewById(R.id.gemendo);
        cachoeira = (Button) findViewById(R.id.cachoeira);
        tedououtra = (Button) findViewById(R.id.tedououtra);
        masoq = (Button) findViewById(R.id.masoq);
        fei = (Button) findViewById(R.id.fei);
        dougras = (Button) findViewById(R.id.dougras);
        irineu = (Button) findViewById(R.id.irineu);
        kevinhoacredita = (Button) findViewById(R.id.kevinhoacredita);
        seubuceta = (Button) findViewById(R.id.seubuceta);
        vamofecha = (Button) findViewById(R.id.vamofecha);
        maisoumenos = (Button) findViewById(R.id.maisoumenos);
        mizeravi = (Button) findViewById(R.id.mizeravi);
        aspalavra = (Button) findViewById(R.id.aspalavra);
        burro = (Button) findViewById(R.id.burro);
        carlosalberto = (Button) findViewById(R.id.carlosalberto);
        legal = (Button) findViewById(R.id.legal);
        mintira = (Button) findViewById(R.id.mintira);
        oqelefalou = (Button) findViewById(R.id.oqelefalou);
        porcaria = (Button) findViewById(R.id.porcaria);
        querocafe = (Button) findViewById(R.id.querocafe);
        demencia = (Button) findViewById(R.id.demencia);
        nadaver = (Button) findViewById(R.id.nadaver);
        naotolouco = (Button) findViewById(R.id.naotolouco);
        vaamerda = (Button) findViewById(R.id.vaamerda);
        sefoda = (Button) findViewById(R.id.sefoda);
        morrediabo = (Button) findViewById(R.id.morrediabo);
        naointeressa = (Button) findViewById(R.id.naointeressa);
        bixona = (Button) findViewById(R.id.bixona);
        hardcore = (Button) findViewById(R.id.hardcore);
        asideia = (Button) findViewById(R.id.asideia);
        bichao = (Button) findViewById(R.id.bichao);
        cagado = (Button) findViewById(R.id.cagado);
        cepo = (Button) findViewById(R.id.cepo);
        cepobemduro = (Button) findViewById(R.id.cepobemduro);
        choque = (Button) findViewById(R.id.choque);
        delicia = (Button) findViewById(R.id.delicia);
        olamarilene = (Button) findViewById(R.id.olamarilene);
        sabianao = (Button) findViewById(R.id.sabianao);
        taumaporra = (Button) findViewById(R.id.taumaporra);
        piruleta = (Button) findViewById(R.id.piruleta);
        berg = (Button) findViewById(R.id.berg);
        sourica = (Button) findViewById(R.id.sourica);
        rolezeira = (Button) findViewById(R.id.rolezeira);
        souumafoca = (Button) findViewById(R.id.souumafoca);
        caraiborracha = (Button) findViewById(R.id.caraiborracha);
        ahva = (Button) findViewById(R.id.ahva);
        ne = (Button) findViewById(R.id.ne);
        viadaobonito = (Button) findViewById(R.id.viadaobonito);
        mederrubaram = (Button) findViewById(R.id.mederrubaram);
        ai_meu_cu = (Button) findViewById(R.id.ai_meu_cu);
        cachorro = (Button) findViewById(R.id.cachorro);
        pesadao = (Button) findViewById(R.id.pesadao);
        coe_rapaziada = (Button) findViewById(R.id.coe_rapaziada);
        dormir = (Button) findViewById(R.id.dormir);
        eso = (Button) findViewById(R.id.eso);
        voucair = (Button) findViewById(R.id.voucair);
        falafiote = (Button) findViewById(R.id.falafiote);
        miauovo = (Button) findViewById(R.id.miauovo);
        nuncanemvi = (Button) findViewById(R.id.nuncanemvi);
        souummerda = (Button) findViewById(R.id.souummerda);
        vocequefuma = (Button) findViewById(R.id.vocequefuma);
        devolvernao = (Button) findViewById(R.id.devolvernao);
        ehmeu = (Button) findViewById(R.id.ehmeu);
        vaifazeroq = (Button) findViewById(R.id.vaifazeroq);

        vaifazeroq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.vaifazeroq);
                som.start();

            }
        });
        vaifazeroq.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=136je3SXR1fvg6MtAoEe9_Q0hRl0a-EgU");
                return true;
            }
        });
        ehmeu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.ehmeu);
                som.start();

            }
        });
        ehmeu.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=1KNomymiJ4RxacPHvbeWNlfaWXnkZm0JU");
                return true;
            }
        });
        devolvernao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.devolvernao);
                som.start();

            }
        });
        devolvernao.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=1Qg0U5atWiy-0t7cwxfO33REMjY9OdOsL");
                return true;
            }
        });
        vocequefuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.vocequefuma);
                som.start();

            }
        });
        vocequefuma.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=1cb3FSLeH9ZgzCbHERJDj93_ZqNwpWydv");
                return true;
            }
        });
        souummerda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.souummerda);
                som.start();

            }
        });
        souummerda.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=1BguNWxbdfEIib2o6m2nhc-vpgRE0DYml");
                return true;
            }
        });
        nuncanemvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.nuncanemvi);
                som.start();

            }
        });
        nuncanemvi.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=1QUvizozWpBLqhYtK-2hpX_plrYSfGC2R");
                return true;
            }
        });
        miauovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.miauovo);
                som.start();

            }
        });
        miauovo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=1so6veFrNV1_UmfyQR2-356PbMVQ8heeq");
                return true;
            }
        });
        falafiote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.falafiote);
                som.start();

            }
        });
        falafiote.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=1Ypx3w7V0_Fv9uxwm9UQWliB9wtZ9vfp3");
                return true;
            }
        });
        voucair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.voucair);
                som.start();

            }
        });
        voucair.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4aySnJSaFhEbEZXaU0");
                return true;
            }
        });
        eso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.eso);
                som.start();

            }
        });
        eso.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayT3NNcXVWWnlmTVE");
                return true;
            }
        });
        dormir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.dormir);
                som.start();

            }
        });
        dormir.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayekdrTXEyZENEdjQ");
                return true;
            }
        });
        coe_rapaziada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.coe_rapaziada);
                som.start();

            }
        });
        coe_rapaziada.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayMk1ObFhkZzBwcm8");
                return true;
            }
        });
        pesadao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.pesadao);
                som.start();

            }
        });
        pesadao.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayNllHeFZwNWk0TU0");
                return true;
            }
        });
        cachorro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.cachorro);
                som.start();

            }
        });
        cachorro.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayclM5eEdDWUN5aGs");
                return true;
            }
        });
        ai_meu_cu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.ai_meu_cu);
                som.start();

            }
        });
        ai_meu_cu.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayYUhkQ3JoUUFNcWc");
                return true;
            }
        });
        piruleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.piruleta);
                som.start();
            }
        });
        piruleta.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayLXhiR1BQUGVXYm8");
                return true;
            }
        });
        berg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.berg);
                som.start();
            }
        });
        berg.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayWWtzWnNWZ2loYmM");
                return true;
            }
        });
        sourica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.sourica);
                som.start();
            }
        });
        sourica.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayOENCMDQ0ZXZwckE");
                return true;
            }
        });
        rolezeira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.rolezeira);
                som.start();
            }
        });
        rolezeira.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayd2RlcXJpQnNlaUU");
                return true;
            }
        });
        souumafoca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.souumafoca);
                som.start();
            }
        });
        souumafoca.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayOFk5ZDRZbE16bW8");
                return true;
            }
        });
        caraiborracha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.caraiborracha);
                som.start();
            }
        });
        caraiborracha.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayZkNxTW94X0xNRlk");
                return true;
            }
        });
        ahva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.ahva);
                som.start();
            }
        });
        ahva.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4aybEpZbjY2LUV4bUk");
                return true;
            }
        });
        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.ne);
                som.start();
            }
        });
        ne.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayeVF6a2YtazlMNVU");
                return true;
            }
        });
        viadaobonito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.viadaobonito);
                som.start();
            }
        });
        viadaobonito.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4aydHl0VEZfdFgxeGc");
                return true;
            }
        });
        mederrubaram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.mederrubaram);
                som.start();
            }
        });
        mederrubaram.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4aySi11eE8tYV9BdjA");
                return true;
            }
        });
        taumaporra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.taumaporra);
                som.start();
            }
        });
        taumaporra.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayZlAyc20xLWNBdE0");
                return true;
            }
        });
        sabianao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.sabianao);
                som.start();
            }
        });
        sabianao.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayYUFUb0FfWjY5ME0");
                return true;
            }
        });
        olamarilene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.olamarilene);
                som.start();
            }
        });
        olamarilene.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayb2ppNW9GYkxndzQ");
                return true;
            }
        });
        delicia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.delicia);
                som.start();
            }
        });
        delicia.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayVi1Vc0o1bnJyalk");
                return true;
            }
        });
        choque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.choque);
                som.start();
            }
        });
        choque.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayX29jNkNpV2hIOHc");
                return true;
            }
        });
        cepobemduro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.cepobemduro);
                som.start();
            }
        });
        cepobemduro.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayOVp5TE15S0xFdmc");
                return true;
            }
        });
        cepo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.cepo);
                som.start();
            }
        });
        cepo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4aySlNZRUFzZlNDQkU");
                return true;
            }
        });
        cagado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.cagado);
                som.start();
            }
        });
        cagado.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayTTl1NzJ5ZzlFVzA");
                return true;
            }
        });
        bichao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.bichao);
                som.start();
            }
        });
        bichao.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayMjFVb1M2cDlwejQ");
                return true;
            }
        });
        asideia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.asideia);
                som.start();
            }
        });
        asideia.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayV0pMZTBaUFFiZDA");
                return true;
            }
        });
        hardcore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.harcore);
                som.start();
            }
        });
        hardcore.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayOU1Ud3BocEQ2LWM");
                return true;
            }
        });
        bixona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.bixona);
                som.start();
            }
        });
        bixona.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayWnpHSHBoQXdlT00");
                return true;
            }
        });
        naointeressa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.naointeressa);
                som.start();
            }
        });
        naointeressa.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {

                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayM21lOHE3ZmRmX0U");
                return true;
            }
        });
        morrediabo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.morrediabo);
                som.start();
            }
        });
        morrediabo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {

                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayYW1lMjdIcHVrRW8");
                return true;
            }
        });
        sefoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.sefoda);
                som.start();
            }
        });
        sefoda.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {

                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4ayTlRDcmpyQ2NaYVk");
                return true;
            }
        });
        vaamerda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.vaamerda);
                som.start();
            }
        });
        vaamerda.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {

                som = null;
                share("https://drive.google.com/open?id=0B6ow71d2y4aybTRDWkJoNUQzdjg");
                return true;
            }
        });
        naotolouco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.naotolouco);
                som.start();


            }
        });
        naotolouco.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {

                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayTUxXVWdUWDZ6RWc"));
                startActivity(browserIntent);

                return true;
            }
        });
        nadaver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.nadaver);
                som.start();

            }
        });
        nadaver.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {

                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayenlTZ3JCemk3Z2c"));
                startActivity(browserIntent);

                return true;
            }
        });
        demencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.demencia);
                som.start();

            }
        });
        demencia.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {

                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayZkN4SGRXcmZ6U28"));
                startActivity(browserIntent);

                return true;
            }
        });
        gemendo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.gemendo);
                som.start();

            }
        });
        gemendo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayNW1uRlpXMDVCRHc"));
                startActivity(browserIntent);

                return true;
            }
        });
        cachoeira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.cachoeira);
                som.start();

            }
        });
        cachoeira.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayYjU5ZUo2b2poZzg"));
                startActivity(browserIntent);

                return true;
            }
        });
        porcaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.porcaria);
                som.start();
            }
        });
        porcaria.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayaXFMenRZN1JLSW8"));
                startActivity(browserIntent);

                return true;
            }
        });
        querocafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.querocafe);
                som.start();
            }
        });
        querocafe.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayQmx5YkdzZEZZMEE"));
                startActivity(browserIntent);

                return true;
            }
        });
        aspalavra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.aspalavra);
                som.start();
            }
        });
        aspalavra.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayME9IRURWMGVTbE0"));
                startActivity(browserIntent);

                return true;
            }
        });
        burro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.burro);
                som.start();
            }
        });
        burro.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayRjdBMWlKMEJGeTQ"));
                startActivity(browserIntent);

                return true;
            }
        });
        carlosalberto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.carlosalberto);
                som.start();
            }
        });
        carlosalberto.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayaUpNZHM5SGttRFU"));
                startActivity(browserIntent);

                return true;
            }
        });
        legal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.legal);
                som.start();
            }
        });
        legal.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayWTNfd0RjdU01aGc"));
                startActivity(browserIntent);

                return true;
            }
        });
        mintira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.mintira);
                som.start();
            }
        });
        mintira.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayVEZxYktzaWFlQ0U"));
                startActivity(browserIntent);

                return true;
            }
        });
        oqelefalou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.oqelefalou);
                som.start();
            }
        });
        oqelefalou.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayZi1BZzBYRWVnT1U"));
                startActivity(browserIntent);

                return true;
            }
        });
        mizeravi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.mizeravi);
                som.start();
            }
        });
        mizeravi.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4aybVFoU1JzblV5NEk"));
                startActivity(browserIntent);

                return true;
            }
        });
        tedououtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.tedououtra);
                som.start();
            }
        });
        tedououtra.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4aydlZxTU1iWklUT3c"));
                startActivity(browserIntent);

                return true;
            }
        });
        masoq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.masoq);
                som.start();
            }
        });
        masoq.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayVGVaS0VUTFhOUDg"));
                startActivity(browserIntent);

                return true;
            }
        });
        maisoumenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.maisoumenos);
                som.start();
            }
        });
        maisoumenos.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayMkVKWVFibUVtczA"));
                startActivity(browserIntent);

                return true;
            }
        });
        irineu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.irineu);
                som.start();
            }
        });
        irineu.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayWUY4VGVYTmhQYzQ"));
                startActivity(browserIntent);

                return true;
            }
        });
        dougras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.souodougras);
                som.start();
            }
        });
        dougras.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayN3h1czkyOERybVE"));
                startActivity(browserIntent);

                return true;
            }
        });
        fei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.fei);
                som.start();
            }
        });
        fei.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayX3RubVhURk9mWm8"));
                startActivity(browserIntent);

                return true;
            }
        });
        kevinhoacredita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.ceacredita);
                som.start();
            }
        });
        kevinhoacredita.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayZ1NOTkROODVnc1E"));
                startActivity(browserIntent);

                return true;
            }
        });
        seubuceta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.seubuceta);
                som.start();
            }
        });
        seubuceta.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayNkI2MndhOVpPOEU"));
                startActivity(browserIntent);

                return true;
            }
        });
        vamofecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _v) {
                if (som != null) {
                    if (som.isPlaying()) {
                        som.stop();
                    }
                    som.release();
                }
                som = null;
                som = MediaPlayer.create(getApplicationContext(), R.raw.vamofecha);
                som.start();
            }
        });
        vamofecha.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _v) {
                som = null;

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=0B6ow71d2y4ayRUt2b0xQRXhZeWc"));
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
            AlertDialog alertDialog = new AlertDialog.Builder(OutrosMemes.this).create();
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