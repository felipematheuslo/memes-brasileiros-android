package com.olivenbaum.memesbrasil;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.Random;

public class MainActivity extends Activity {

	private FirebaseAnalytics mFirebaseAnalytics;

	private Intent change = new Intent();
	private ImageView fb;
	private ImageView twt;
	private Button btn01;
	private Button btn02;
	private Button btn03;

	private MediaPlayer som;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

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

		fb = (ImageView) findViewById(R.id.fb);
		twt = (ImageView) findViewById(R.id.twt);
		btn01 = (Button) findViewById(R.id.btn01);
		btn02 = (Button) findViewById(R.id.btn02);
		btn03 = (Button) findViewById(R.id.btn03);

		btn01.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				change.setClass(getApplicationContext(), CategoriasClass.class);
				startActivity(change);
			}
		});
		btn02.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				change.setClass(getApplicationContext(), RecentesClass.class);
				startActivity(change);
			}
		});
		btn03.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:Olivenbaum"));
				startActivity(intent);
			}
		});

		fb.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				Intent facebookIntent = openFacebook(MainActivity.this);
				startActivity(facebookIntent);
			}
		});
		twt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				try {
					Intent intent = new Intent(Intent.ACTION_VIEW,
							Uri.parse("twitter://user?screen_name=felipematheuslo"));
					startActivity(intent);

				} catch (Exception e) {
					startActivity(new Intent(Intent.ACTION_VIEW,
							Uri.parse("https://twitter.com/felipematheuslo")));
				}
			}
		});

		Random r = new Random();
		final int i1 = r.nextInt(10 - 1) + 1;
		final int i2 = r.nextInt(10 - 1) + 1;
		final int i3 = r.nextInt(10 - 1) + 1;

		if(i1==1){
			btn01.setBackgroundColor(Color.rgb(0,193,63));
		}
		if(i1==2){
			btn01.setBackgroundColor(Color.rgb(170,64,255));
		}
		if(i1==3){
			btn01.setBackgroundColor(Color.rgb(0,106,193));
		}
		if(i1==4){
			btn01.setBackgroundColor(Color.rgb(255,152,29));
		}
		if(i1==5){
			btn01.setBackgroundColor(Color.rgb(31,174,255));
		}
		if(i1==6){
			btn01.setBackgroundColor(Color.rgb(0,130,135));
		}
		if(i1==7){
			btn01.setBackgroundColor(Color.rgb(255,46,18));
		}
		if(i1==8){
			btn01.setBackgroundColor(Color.rgb(114,0,172));
		}
		if(i1==9){
			btn01.setBackgroundColor(Color.rgb(25,153,0));
		}

		if(i2==9){
			btn02.setBackgroundColor(Color.rgb(0,193,63));
		}
		if(i2==8){
			btn02.setBackgroundColor(Color.rgb(170,64,255));
		}
		if(i2==7){
			btn02.setBackgroundColor(Color.rgb(0,106,193));
		}
		if(i2==6){
			btn02.setBackgroundColor(Color.rgb(255,152,29));
		}
		if(i2==5){
			btn02.setBackgroundColor(Color.rgb(31,174,255));
		}
		if(i2==4){
			btn02.setBackgroundColor(Color.rgb(0,130,135));
		}
		if(i2==3){
			btn02.setBackgroundColor(Color.rgb(255,46,18));
		}
		if(i2==2){
			btn02.setBackgroundColor(Color.rgb(114,0,172));
		}
		if(i2==1){
			btn02.setBackgroundColor(Color.rgb(25,153,0));
		}

		if(i3==1){
			btn03.setBackgroundColor(Color.rgb(0,193,63));
		}
		if(i3==9){
			btn03.setBackgroundColor(Color.rgb(170,64,255));
		}
		if(i3==2){
			btn03.setBackgroundColor(Color.rgb(0,106,193));
		}
		if(i3==8){
			btn03.setBackgroundColor(Color.rgb(255,152,29));
		}
		if(i3==3){
			btn03.setBackgroundColor(Color.rgb(31,174,255));
		}
		if(i3==7){
			btn03.setBackgroundColor(Color.rgb(0,130,135));
		}
		if(i3==4){
			btn03.setBackgroundColor(Color.rgb(255,46,18));
		}
		if(i3==6){
			btn03.setBackgroundColor(Color.rgb(114,0,172));
		}
		if(i3==5){
			btn03.setBackgroundColor(Color.rgb(25,153,0));
		}
	}

	public static Intent openFacebook(MainActivity context) {
		try {
			context.getPackageManager()
					.getPackageInfo("com.facebook.katana", 0);
			return new Intent(Intent.ACTION_VIEW,
					Uri.parse("fb://page/126890361194610"));
		} catch (Exception e) {
			return new Intent(Intent.ACTION_VIEW,
					Uri.parse("https://www.facebook.com/olivenbaum.apps"));
		}
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
			AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
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