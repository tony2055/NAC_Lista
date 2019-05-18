package br.com.fiap.nac_lista.dao

import br.com.fiap.nac_lista.model.Carros

class CarrosLocalDAO {
    fun listarCarros() : List<Carros>{
        return listOf(
                getCivic(),
                getFiesta(),
                getCorolla()
        )
    }

    fun getCivic() : Carros{
        return Carros(
                "Honda",
                "Civic 2014",
                "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2019/201904/20190428/honda-civic-1.8-lxs-16v-flex-4p-automatico-wmimagem20063706749.jpg?s=fill&w=552&h=414&q=60"
        )
    }

    fun getFiesta() : Carros{
        return Carros(
                "Ford",
                "Fiesta 2015",
                "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2019/201903/20190326/ford-fiesta-1.6-titanium-hatch-16v-flex-4p-powershift-wmimagem14183332984.jpg?s=fill&w=552&h=414&q=60"
        )
    }

    fun getCorolla() : Carros{
        return Carros(
                "Toyota",
                "Corolla 2013",
                "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201811/20181110/toyota-corolla-2.0-xei-16v-flex-4p-automatico-wmimagem0032232015.jpg?s=fill&w=552&h=414&q=60"
        )
    }

}