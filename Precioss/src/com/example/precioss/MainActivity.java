package com.example.precioss;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	String nombre = "";
	private EditText txtNombre;
	private EditText txtContraseña;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		txtNombre = (EditText) findViewById(R.id.editNombreId);
		txtContraseña = (EditText) findViewById(R.id.txtContraseniaId);
		
		


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void pasarActividad(View view) {
		if (String.valueOf(txtContraseña.getText()).compareTo("123") == 0) {
			Intent siguiente = new Intent(this, Secundaria.class);
			siguiente.putExtra("nombre", txtNombre.getText().toString());
			startActivity(siguiente);
		} else {
			Toast toast = Toast.makeText(getApplicationContext(),
					"Error en la contraseña", Toast.LENGTH_SHORT);
			toast.show();
		}
	}

}
