package br.gov.serpro.wishlist;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class NewWish extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_wish);

		Button button = (Button) findViewById(R.id.buttonSalvar);
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// Toast.makeText(NewWish.this, "Mais um desejo...",
				// Toast.LENGTH_SHORT).show();
				Toast toast = new Toast(NewWish.this);
				LayoutInflater inflater = getLayoutInflater();
				View view = inflater.inflate(R.layout.list_item, null);
				TextView text = (TextView) view
						.findViewById(R.id.list_item_textview);
				text.setText("AAAiii");
				toast.setView(view);
				toast.show();

				AlertDialog.Builder builder = new Builder(NewWish.this);
				builder.setIcon(R.drawable.ic_launcher).setMessage("Mensagem")
						.setTitle("Title").setPositiveButton("ok", null)
						.setNegativeButton("Nao", null).create().show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_new_wish, menu);
		return true;
	}
}
