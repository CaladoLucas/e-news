package com.example.lucas.e_news

import java.util.*

class Noticias {
    var noticias = arrayOf(
            "www.maisesports.com.br/team-liquid-terceira-rodada-pro-league-r6/",
            "www.maisesports.com.br/primeiro-dia-rift-rivals-na-eu-empatam/",
            "www.maisesports.com.br/kabum-derrota-klg-taliyah-titan-criticas/",
            "www.maisesports.com.br/torneio-chines-return-of-the-legends-tera-dyrus-alex-ich-genja-dandy-e-outros-aposentados/",
            "www.maisesports.com.br/kabum-keyd-dia-1-rift-rivals/",
            "www.br.lolesports.com/noticias/brasil-se-recupera-vence-tres-no-dia-2-e-esta-na-final",
            "www.br.lolesports.com/noticias/ingressos-para-final-da-2a-etapa-2018",
            "www.br.lolesports.com/noticias/prefiro-receber-menos-e-lutar-por-titulos-diz-tierwulf",
            "www.br.lolesports.com/noticias/comunicado-suspensao-de-rafap" )

    fun aleatoriaNoticia(): String{

        val totalItensArray = noticias.size
        val numeroAleatorio = Random().nextInt( totalItensArray )

        return noticias[numeroAleatorio]
    }

}