package com.example.precioss;

import org.w3c.dom.Text;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Secundaria extends Activity {
	EditText txtNombre, txtContraseña;
	EditText producto;
	private TextView saludo, stock1, stock2, stock3, stock4, N1, N2, N3, N4,
			Saldo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_secundaria);
		txtNombre = (EditText) findViewById(R.id.editNombreId);
		txtContraseña = (EditText) findViewById(R.id.txtContraseniaId);
		Bundle extras = getIntent().getExtras();
		String nombre = extras.getString("nombre");
		saludo = (TextView) findViewById(R.id.lblSaludo);
		saludo.setText("Hola " + nombre + ", selecciona el producto.");
		producto = (EditText) findViewById(R.id.edtProductoId);

		stock1 = (TextView) findViewById(R.id.txtStock1Id);
		stock2 = (TextView) findViewById(R.id.txtStock2Id);
		stock3 = (TextView) findViewById(R.id.txtStock3Id);
		stock4 = (TextView) findViewById(R.id.txtStock4Id);

		double numero1 = 10;
		double numero2 = 15;
		double numero3 = 5;
		double numero4 = 5;

		double saldo = 1000;

		N1 = (TextView) findViewById(R.id.txtSN1Id);
		N1.setText("" + numero1);
		N2 = (TextView) findViewById(R.id.txtSN2Id);
		N2.setText("" + numero2);
		N3 = (TextView) findViewById(R.id.txtSN3Id);
		N3.setText("" + numero3);
		N4 = (TextView) findViewById(R.id.txtSN4Id);
		N4.setText("" + numero4);

		Saldo = (TextView) findViewById(R.id.txtSaldoId);
		Saldo.setText("Saldo: " + saldo);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void pasarOtraActividad(View view) {
		Intent siguiente = new Intent(this, Productos.class);
		startActivity(siguiente);
	}

	public void mostrar(View view) {

		String productos = producto.getText().toString();
		int valor = Integer.parseInt(productos);

		if (valor == 1) {

			TextView numero = (TextView) findViewById(R.id.editCompletarId);
			double numeros = Double.parseDouble(numero.getText().toString());

			TextView numeroM = (TextView) findViewById(R.id.editModificarPrecioId);
			double numeromod = Double.parseDouble(numeroM.getText().toString());

			TextView precio = (TextView) findViewById(R.id.txtPrecioId);
			double a = (400 + numeromod);
			precio.setText("El precio del producto es: " + a);

			double operacion = ((10.5 * a / 100) + a) * numeros;
			double operaciondiezsolo = (10.5 * a / 100) * numeros;
			double operacionveintesolo = (21 * a / 100) * numeros;
			double operacionveinte = ((21 * a / 100) + a) * numeros;

			TextView diez = (TextView) findViewById(R.id.txtDiezId);
			diez.setText("Con el aumento del 10,5% : " + operacion);

			TextView veinte = (TextView) findViewById(R.id.txtVeinteId);
			veinte.setText("Con el aumento del 21% : " + operacionveinte);

			TextView diezsolo = (TextView) findViewById(R.id.txtDiezsoloId);
			diezsolo.setText("El 10,5% es : " + operaciondiezsolo);

			TextView veintesolo = (TextView) findViewById(R.id.txtVeintesoloId);
			veintesolo.setText("El 21% es: " + operacionveintesolo);
			
			

		}
		if (valor == 2) {

			TextView numero = (TextView) findViewById(R.id.editCompletarId);
			double numeros = Double.parseDouble(numero.getText().toString());

			TextView numeroM = (TextView) findViewById(R.id.editModificarPrecioId);
			double numeromod = Double.parseDouble(numeroM.getText().toString());

			TextView precio = (TextView) findViewById(R.id.txtPrecioId);
			double b = (500 + numeromod);
			precio.setText("El precio del producto es: " + b);

			double operacion = ((10.5 * b / 100) + b) * numeros;
			double operaciondiezsolo = (10.5 * b / 100) * numeros;
			double operacionveintesolo = (21 * b / 100) * numeros;
			double operacionveinte = ((21 * b / 100) + b) * numeros;

			TextView diez = (TextView) findViewById(R.id.txtDiezId);
			diez.setText("Con el aumento del 10,5% : " + operacion);

			TextView veinte = (TextView) findViewById(R.id.txtVeinteId);
			veinte.setText("Con el aumento del 21% : " + operacionveinte);

			TextView diezsolo = (TextView) findViewById(R.id.txtDiezsoloId);
			diezsolo.setText("El 10,5% es : " + operaciondiezsolo);

			TextView veintesolo = (TextView) findViewById(R.id.txtVeintesoloId);
			veintesolo.setText("El 21% es: " + operacionveintesolo);

		}
		if (valor == 3) {

			TextView numero = (TextView) findViewById(R.id.editCompletarId);
			double numeros = Double.parseDouble(numero.getText().toString());

			TextView numeroM = (TextView) findViewById(R.id.editModificarPrecioId);
			double numeromod = Double.parseDouble(numeroM.getText().toString());

			TextView precio = (TextView) findViewById(R.id.txtPrecioId);
			double c = (600 + numeromod);
			precio.setText("El precio del producto es: " + c);

			double operacion = ((10.5 * c / 100) + c) * numeros;
			double operaciondiezsolo = (10.5 * c / 100) * numeros;
			double operacionveintesolo = (21 * c / 100) * numeros;
			double operacionveinte = ((21 * c / 100) + c) * numeros;

			TextView diez = (TextView) findViewById(R.id.txtDiezId);
			diez.setText("Con el aumento del 10,5% : " + operacion);

			TextView veinte = (TextView) findViewById(R.id.txtVeinteId);
			veinte.setText("Con el aumento del 21% : " + operacionveinte);

			TextView diezsolo = (TextView) findViewById(R.id.txtDiezsoloId);
			diezsolo.setText("El 10,5% es : " + operaciondiezsolo);

			TextView veintesolo = (TextView) findViewById(R.id.txtVeintesoloId);
			veintesolo.setText("El 21% es: " + operacionveintesolo);

		}
		if (valor == 4) {

			TextView numero = (TextView) findViewById(R.id.editCompletarId);
			double numeros = Double.parseDouble(numero.getText().toString());

			TextView numeroM = (TextView) findViewById(R.id.editModificarPrecioId);
			double numeromod = Double.parseDouble(numeroM.getText().toString());

			TextView precio = (TextView) findViewById(R.id.txtPrecioId);
			double d = (700 + numeromod);
			precio.setText("El precio del producto es: " + d);

			double operacion = ((10.5 * d / 100) + d) * numeros;
			double operaciondiezsolo = (10.5 * d / 100) * numeros;
			double operacionveintesolo = (21 * d / 100) * numeros;
			double operacionveinte = ((21 * d / 100) + d) * numeros;

			TextView diez = (TextView) findViewById(R.id.txtDiezId);
			diez.setText("Con el aumento del 10,5% : " + operacion);

			TextView veinte = (TextView) findViewById(R.id.txtVeinteId);
			veinte.setText("Con el aumento del 21% : " + operacionveinte);

			TextView diezsolo = (TextView) findViewById(R.id.txtDiezsoloId);
			diezsolo.setText("El 10,5% es : " + operaciondiezsolo);

			TextView veintesolo = (TextView) findViewById(R.id.txtVeintesoloId);
			veintesolo.setText("El 21% es: " + operacionveintesolo);

		}
		if (valor >= 5) {
			Toast toast = Toast.makeText(getApplicationContext(),
					"El producto no existe. Verificar en lista de productos",
					Toast.LENGTH_SHORT);
			toast.show();
		}

	}

	public void Comprar(View view) {

		String productos = producto.getText().toString();
		Log.d("Marcos", "Producto es igual a = " + productos);
		int valor = Integer.parseInt(productos);

		if (valor == 1) {

			TextView numero = (TextView) findViewById(R.id.editCompletarId);
			double numeros = Double.parseDouble(numero.getText().toString());

			TextView numeroA = (TextView) findViewById(R.id.txtSN1Id);
			double numero1 = Double.parseDouble(numeroA.getText().toString());
			N1.setText("" + (numero1 + numeros));

			TextView numeroM = (TextView) findViewById(R.id.editModificarPrecioId);
			double numeromod = Double.parseDouble(numeroM.getText().toString());
			TextView precio = (TextView) findViewById(R.id.txtPrecioId);
			double a = (400 + numeromod);
			precio.setText("El precio del producto es: " + a);

			double operacion = ((10.5 * a / 100) + a) * numeros;
			double saldo = 1000;

			Saldo.setText("Saldo: " + (saldo - operacion));
		}
		if (valor == 2) {
			TextView numero = (TextView) findViewById(R.id.editCompletarId);
			double numeros = Double.parseDouble(numero.getText().toString());
			TextView numeroA = (TextView) findViewById(R.id.txtSN2Id);
			double numero1 = Double.parseDouble(numeroA.getText().toString());
			N2.setText("" + (numero1 + numeros));

			TextView numeroM = (TextView) findViewById(R.id.editModificarPrecioId);
			double numeromod = Double.parseDouble(numeroM.getText().toString());
			TextView precio = (TextView) findViewById(R.id.txtPrecioId);
			double b = (500 + numeromod);
			precio.setText("El precio del producto es: " + b);

			double operacion = ((10.5 * b / 100) + b) * numeros;
			double saldo = 1000;

			Saldo.setText("Saldo: " + (saldo - operacion));
		}

		if (valor == 3) {
			TextView numero = (TextView) findViewById(R.id.editCompletarId);
			double numeros = Double.parseDouble(numero.getText().toString());
			TextView numeroA = (TextView) findViewById(R.id.txtSN3Id);
			double numero1 = Double.parseDouble(numeroA.getText().toString());
			N3.setText("" + (numero1 + numeros));

			TextView numeroM = (TextView) findViewById(R.id.editModificarPrecioId);
			double numeromod = Double.parseDouble(numeroM.getText().toString());
			TextView precio = (TextView) findViewById(R.id.txtPrecioId);
			double c = (600 + numeromod);
			precio.setText("El precio del producto es: " + c);

			double operacion = ((10.5 * c / 100) + c) * numeros;
			double saldo = 1000;

			Saldo.setText("Saldo: " + (saldo - operacion));
		}

		if (valor == 4) {
			TextView numero = (TextView) findViewById(R.id.editCompletarId);
			double numeros = Double.parseDouble(numero.getText().toString());
			TextView numeroA = (TextView) findViewById(R.id.txtSN4Id);
			double numero1 = Double.parseDouble(numeroA.getText().toString());
			N4.setText("" + (numero1 + numeros));

			TextView numeroM = (TextView) findViewById(R.id.editModificarPrecioId);
			double numeromod = Double.parseDouble(numeroM.getText().toString());
			TextView precio = (TextView) findViewById(R.id.txtPrecioId);
			double d = (700 + numeromod);
			precio.setText("El precio del producto es: " + d);

			double operacion = ((10.5 * d / 100) + d) * numeros;
			double saldo = 1000;

			Saldo.setText("Saldo: " + (saldo - operacion));
		}

	}

	public void Vender(View view) {

		String productos = producto.getText().toString();
		int valor = Integer.parseInt(productos);

		if (valor == 1) {
			TextView numero = (TextView) findViewById(R.id.editCompletarId);
			double numeros = Double.parseDouble(numero.getText().toString());
			TextView numeroA = (TextView) findViewById(R.id.txtSN1Id);
			double numero1 = Double.parseDouble(numeroA.getText().toString());
			N1.setText("" + (numero1 - numeros));
			TextView numeroM = (TextView) findViewById(R.id.editModificarPrecioId);
			double numeromod = Double.parseDouble(numeroM.getText().toString());
			TextView precio = (TextView) findViewById(R.id.txtPrecioId);
			double a = (400 + numeromod);
			precio.setText("El precio del producto es: " + a);

			double operacion = ((10.5 * a / 100) + a) * numeros;
			double operacionveinte = ((21 * a / 100) + a) * numeros;
			double saldo = 1000;

			Saldo.setText("Saldo: " + (saldo + operacionveinte + operacion));

		}
		if (valor == 2) {
			TextView numero = (TextView) findViewById(R.id.editCompletarId);
			double numeros = Double.parseDouble(numero.getText().toString());
			TextView numeroA = (TextView) findViewById(R.id.txtSN2Id);
			double numero1 = Double.parseDouble(numeroA.getText().toString());
			N2.setText("" + (numero1 - numeros));

			TextView numeroM = (TextView) findViewById(R.id.editModificarPrecioId);
			double numeromod = Double.parseDouble(numeroM.getText().toString());
			TextView precio = (TextView) findViewById(R.id.txtPrecioId);
			double b = (500 + numeromod);
			precio.setText("El precio del producto es: " + b);

			double operacion = ((10.5 * b / 100) + b) * numeros;
			double operacionveinte = ((21 * b / 100) + b) * numeros;
			double saldo = 1000;

			Saldo.setText("Saldo: " + (saldo + operacionveinte + operacion));

		}

		if (valor == 3) {
			TextView numero = (TextView) findViewById(R.id.editCompletarId);
			double numeros = Double.parseDouble(numero.getText().toString());
			TextView numeroA = (TextView) findViewById(R.id.txtSN3Id);
			double numero1 = Double.parseDouble(numeroA.getText().toString());
			N3.setText("" + (numero1 - numeros));
			;
			TextView numeroM = (TextView) findViewById(R.id.editModificarPrecioId);
			double numeromod = Double.parseDouble(numeroM.getText().toString());
			TextView precio = (TextView) findViewById(R.id.txtPrecioId);
			double c = (600 + numeromod);
			precio.setText("El precio del producto es: " + c);

			double operacion = ((10.5 * c / 100) + c) * numeros;
			double operacionveinte = ((21 * c / 100) + c) * numeros;
			double saldo = 1000;

			Saldo.setText("Saldo: " + (saldo + operacionveinte + operacion));
		}

		if (valor == 4) {
			TextView numero = (TextView) findViewById(R.id.editCompletarId);
			double numeros = Double.parseDouble(numero.getText().toString());

			TextView numeroA = (TextView) findViewById(R.id.txtSN4Id);
			double numero1 = Double.parseDouble(numeroA.getText().toString());
			N4.setText("" + (numero1 - numeros));

			TextView numeroM = (TextView) findViewById(R.id.editModificarPrecioId);
			double numeromod = Double.parseDouble(numeroM.getText().toString());

			TextView precio = (TextView) findViewById(R.id.txtPrecioId);
			double d = (700 + numeromod);
			precio.setText("El precio del producto es: " + d);

			double operacion = ((10.5 * d / 100) + d) * numeros;
			double operacionveinte = ((21 * d / 100) + d) * numeros;
			double saldo = 1000;

			Saldo.setText("Saldo: " + (saldo + operacionveinte + operacion));
		}

	}

}
