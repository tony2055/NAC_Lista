package br.com.fiap.nac_lista

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import br.com.fiap.nac_lista.dao.CarrosLocalDAO
import kotlinx.android.synthetic.main.activity_lista_carros.*

class ListaCarrosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_carros)

        val carrosDao = CarrosLocalDAO()
        val carros = carrosDao.listarCarros()

        rvCarros.adapter = CarrosAdapter(carros,
                this, {
            val intent = Intent(this, CarrosActivity::class.java)
            intent.putExtra("CARRO", it)
            startActivity(intent)
        })

        rvCarros.layoutManager = LinearLayoutManager(this)
    }
}
