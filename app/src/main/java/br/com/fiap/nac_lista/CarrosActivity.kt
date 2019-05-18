package br.com.fiap.nac_lista

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.fiap.nac_lista.model.Carros
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_carros.*
import kotlinx.android.synthetic.main.activity_lista_carros.*
import kotlinx.android.synthetic.main.carros_item.view.*

class CarrosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carros)

        val carros = intent.extras.getParcelable<Carros>("CARRO")
        Picasso.get()
                .load(carros.imagem)
                .into(ivDetalheFoto)
        tvMarcaDetalhe.text = carros.marca
        tvModeloDetalhe.text = carros.modelo
    }
}
