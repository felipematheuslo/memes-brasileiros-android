package com.olivenbaum.memesbrasil.data

import com.olivenbaum.memesbrasil.R

object SoundRepository {

    val categories: List<Category> = listOf(
        // === Vin Diesel ===
        Category(
            name = "Vin Diesel",
            imageResId = R.drawable.vin,
            sounds = listOf(
                SoundItem("Can hug? (1)", R.raw.canhug),
                SoundItem("Can hug? (2)", R.raw.canhug2),
                SoundItem("No", R.raw.no),
                SoundItem("No speak English", R.raw.nospeak),
                SoundItem("What?", R.raw.what),
                SoundItem("Yes", R.raw.yes),
            )
        ),
        // === Bam Bam ===
        Category(
            name = "Bam Bam",
            imageResId = R.drawable.bambam,
            sounds = listOf(
                SoundItem("Aqui é Bodybuilder", R.raw.bodybuilder),
                SoundItem("Birl", R.raw.birl),
                SoundItem("Hora do show, porra!", R.raw.horadoshow),
                SoundItem("Tá saindo da jaula o monstro", R.raw.jaula),
                SoundItem("Trapézio descendente", R.raw.trapezio),
            )
        ),
        // === Faustão ===
        Category(
            name = "Faustão",
            imageResId = R.drawable.faustao,
            sounds = listOf(
                SoundItem("Ce vai morrer", R.raw.morrer),
                SoundItem("E agora pra desligar essa merda?", R.raw.desligaressamerda),
                SoundItem("Errou!", R.raw.errou),
                SoundItem("Oh louco, meu!", R.raw.olokomeu),
                SoundItem("Tá pegando fogo, bixo!", R.raw.fogobixo),
                SoundItem("Você destruiu o meu ovo", R.raw.meuovo),
            )
        ),
        // === Away ===
        Category(
            name = "Away",
            imageResId = R.drawable.away,
            sounds = listOf(
                SoundItem("Fecha o cu pra falar comigo", R.raw.fechaocu),
                SoundItem("Filhos das puta", R.raw.filhosdaputa),
                SoundItem("Não aguenta 10 minutos de porrada comigo", R.raw.naoaguenta),
                SoundItem("Para com essa porra aí, mermão!", R.raw.paracomessaporra),
                SoundItem("Que?", R.raw.q),
            )
        ),
        // === Serjão ===
        Category(
            name = "Serjão",
            imageResId = R.drawable.serjao,
            sounds = listOf(
                SoundItem("Aqui tem coragem", R.raw.coragem),
                SoundItem("É a verdade, não minto", R.raw.naominto),
                SoundItem("Miau au", R.raw.miau),
                SoundItem("Perigoso na calça cagar", R.raw.caga),
                SoundItem("Pipoco no pé do ouvido", R.raw.pipoco),
                SoundItem("Valeu por duas ou mais", R.raw.duasoumais),
            )
        ),
        // === Songs ===
        Category(
            name = "Songs",
            imageResId = R.drawable.song,
            sounds = listOf(
                SoundItem("Backyardigans FUNK", R.raw.backyardigans),
                SoundItem("Dirigindo meu carro FUNK", R.raw.dirigindomeucarro),
                SoundItem("PROERD", R.raw.proerd),
                SoundItem("SONIM BLAINE SINIM CLEVIS", R.raw.sonim_blaine_sinim_clevis),
                SoundItem("Sweet Dreams FUNK", R.raw.sweetdreams),
                SoundItem("Winx FUNK", R.raw.winx),
            )
        ),
        // === Léo Stronda ===
        Category(
            name = "Léo Stronda",
            imageResId = R.drawable.leostronda,
            sounds = listOf(
                SoundItem("Beleza o cacete, não to bem não", R.raw.tobemnao),
                SoundItem("HAN, HEIN", R.raw.hanhein),
                SoundItem("Ih, vou chorar", R.raw.vouchorar),
                SoundItem("Monstro não chora", R.raw.naochora),
                SoundItem("Para de chorar", R.raw.paradechorar),
                SoundItem("Soco dentro da boca", R.raw.soconaboca),
                SoundItem("Vem monstro", R.raw.vemmonstro),
            )
        ),
        // === Silvio Santos ===
        Category(
            name = "Silvio Santos",
            imageResId = R.drawable.racanegra,
            sounds = listOf(
                SoundItem("É, ta bom", R.raw.ehtabom),
                SoundItem("Ma oeee", R.raw.maoe),
                SoundItem("Não consegue, né", R.raw.naoconsegue),
                SoundItem("O que? Como?", R.raw.oqcomo),
                SoundItem("Ta chorando ou tá fingindo?", R.raw.chorandooufingindo),
            )
        ),
        // === Outros Memes ===
        Category(
            name = "Outros Memes",
            imageResId = R.drawable.meme,
            sounds = listOf(
                SoundItem("Acertou, mizeravi", R.raw.mizeravi),
                SoundItem("Ah vá, é mesmo?", R.raw.ahva),
                SoundItem("Ai, ai (Choque do Lasier)", R.raw.choque),
                SoundItem("Ai meu cu", R.raw.ai_meu_cu),
                SoundItem("Bicho piruleta", R.raw.piruleta),
                SoundItem("Cachorro? Que cachorro o que!", R.raw.cachorro),
                SoundItem("Cagado de fome", R.raw.cagado),
                SoundItem("Carai Borracha, mano", R.raw.caraiborracha),
                SoundItem("Carai eu sou um merda, mermão", R.raw.souummerda),
                SoundItem("Carlos Alberto (Risada)", R.raw.carlosalberto),
                SoundItem("Ce acredita", R.raw.ceacredita),
                SoundItem("Ce é fei hein fih", R.raw.fei),
                SoundItem("Ce é louco cachoeira", R.raw.cachoeira),
                SoundItem("Ce é o bichão mesmo, hein", R.raw.bichao),
                SoundItem("Ce tem demência?", R.raw.demencia),
                SoundItem("Cepo de madeira", R.raw.cepo),
                SoundItem("Cepo bem duro", R.raw.cepobemduro),
                SoundItem("Coé rapaziada", R.raw.coe_rapaziada),
                SoundItem("Dá, que eu te dou outra!", R.raw.tedououtra),
                SoundItem("Delícia, cara!", R.raw.delicia),
                SoundItem("E ai, vamo fecha?", R.raw.vamofecha),
                SoundItem("É mas eu não vou devolver não", R.raw.devolvernao),
                SoundItem("E só", R.raw.eso),
                SoundItem("Eu não entendi o que ele falou", R.raw.oqelefalou),
                SoundItem("Eu não to louco", R.raw.naotolouco),
                SoundItem("Eu quero dormir, porra", R.raw.dormir),
                SoundItem("Eu quero que você se foda", R.raw.sefoda),
                SoundItem("Eu sou o Dougras", R.raw.souodougras),
                SoundItem("Eu sou rica!", R.raw.sourica),
                SoundItem("Eu sou rolezeira", R.raw.rolezeira),
                SoundItem("Eu sou uma foca", R.raw.souumafoca),
                SoundItem("Eu to ligado que esse bicho é meu", R.raw.ehmeu),
                SoundItem("Eu vou cair", R.raw.voucair),
                SoundItem("Fala fiote", R.raw.falafiote),
                SoundItem("Gemidão do WhatsApp", R.raw.gemendo),
                SoundItem("Hardcore (Everson Zoio)", R.raw.harcore),
                SoundItem("Irineu", R.raw.irineu),
                SoundItem("Isso aqui é uma porcaria", R.raw.porcaria),
                SoundItem("Isso é uma bixona", R.raw.bixona),
                SoundItem("Legal! Bem louco", R.raw.legal),
                SoundItem("Mais ou menos", R.raw.maisoumenos),
                SoundItem("Mas o que é isso?", R.raw.masoq),
                SoundItem("Me derrubaram aqui ó!", R.raw.mederrubaram),
                SoundItem("Meça suas palavras", R.raw.aspalavra),
                SoundItem("Meu Deus do céu, Berg!", R.raw.berg),
                SoundItem("Mentiiiira", R.raw.mintira),
                SoundItem("Miaaaaaau", R.raw.miauovo),
                SoundItem("Morre, diabo", R.raw.morrediabo),
                SoundItem("Nada a ver, irmão", R.raw.nadaver),
                SoundItem("Não interessa pra você, palhaço", R.raw.naointeressa),
                SoundItem("Neh", R.raw.ne),
                SoundItem("Nunca nem vi. Que dia foi isso?", R.raw.nuncanemvi),
                SoundItem("Ó as ideia vei (Everson Zoio)", R.raw.asideia),
                SoundItem("Olá Marilene", R.raw.olamarilene),
                SoundItem("Pesadão", R.raw.pesadao),
                SoundItem("Que merda, hein! Sabia não", R.raw.sabianao),
                SoundItem("Que viadão bonito, hein!", R.raw.viadaobonito),
                SoundItem("Quero café!", R.raw.querocafe),
                SoundItem("Seu buceta", R.raw.seubuceta),
                SoundItem("Tá uma porra", R.raw.taumaporra),
                SoundItem("Vá a merda, porra!", R.raw.vaamerda),
                SoundItem("Vai fazer o que?", R.raw.vaifazeroq),
                SoundItem("Você é burro, cara", R.raw.burro),
                SoundItem("Você que fuma maconha. Você vai morrer antes do Natal", R.raw.vocequefuma),
            )
        ),
        // === Papaco ===
        Category(
            name = "Papaco",
            imageResId = R.drawable.papaco,
            sounds = listOf(
                SoundItem("Ainda bem. Até um outro dia", R.raw.aindabem),
                SoundItem("Fala o que você quer de uma vez, caralho!", R.raw.faladeumavez),
                SoundItem("Falou comigo?", R.raw.faloucomigo),
                SoundItem("Hey, seu bunda mole!", R.raw.heyseubundamole),
                SoundItem("Não, gracinha. Falei com a puta que te pariu", R.raw.faleicomapqp),
                SoundItem("Um momento, amigo!", R.raw.ummomentoamigo),
                SoundItem("Um monte de bosta", R.raw.ummontedebosta),
                SoundItem("Você fala demais, amigo. Acabei de me aborrecer", R.raw.vcfalademais),
            )
        ),
    )

    val recentes: Category = Category(
        name = "Recentes",
        imageResId = R.drawable.cats,
        sounds = listOf(
            SoundItem("É mas eu não vou devolver não", R.raw.devolvernao),
            SoundItem("Eu to ligado que esse bicho é meu", R.raw.ehmeu),
            SoundItem("Vai fazer o que?", R.raw.vaifazeroq),
            SoundItem("Ainda bem. Até um outro dia", R.raw.aindabem),
            SoundItem("Fala o que você quer de uma vez, caralho!", R.raw.faladeumavez),
            SoundItem("Falou comigo?", R.raw.faloucomigo),
            SoundItem("Hey, seu bunda mole!", R.raw.heyseubundamole),
            SoundItem("Não, gracinha. Falei com a puta que te pariu", R.raw.faleicomapqp),
            SoundItem("Um momento, amigo!", R.raw.ummomentoamigo),
            SoundItem("Um monte de bosta", R.raw.ummontedebosta),
            SoundItem("Você fala demais, amigo. Acabei de me aborrecer", R.raw.vcfalademais),
        )
    )
}
