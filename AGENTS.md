# Diretrizes de Desenvolvimento e Regras para Agentes de IA

Este documento contém instruções e regras mandatórias que todos os agentes de IA devem seguir ao trabalhar neste projeto (`memes-brasileiros-android`).

---

## 📱 Regras de Versionamento e Releases (Google Play Store)

Sempre que for solicitada a preparação ou liberação de uma nova versão do aplicativo para a **Google Play Store**, as seguintes regras no arquivo [`app/build.gradle.kts`](file:///d:/git-projects/memes-brasileiros-android/app/build.gradle.kts) devem ser rigorosamente aplicadas:

### 1. `versionCode` (Código da Versão)
- **Incremento obrigatório:** Sempre que for liberar uma versão nova para a Play Store, o `versionCode` **deve ser incrementado em +1** em relação ao valor anterior.
- Nunca reutilize ou diminua o `versionCode`.

### 2. `versionName` (Nome da Versão)
- **Padrão:** O `versionName` **deve seguir o padrão `ano.mes.release`** (formato `YY.M.R`):
  - **`ano`**: Dois dígitos do ano vigente (ex.: `26` para o ano de 2026).
  - **`mes`**: Número do mês corrente sem zero à esquerda (ex.: `9` para setembro).
  - **`release`**: Contador da release lançada dentro do mesmo mês, iniciando em `0` (ex.: `0` para a primeira release do mês, `1` para a segunda, etc.).

---

## 📌 Estado Atual de Referência

- **Data de referência:** Setembro de 2026
- **Configuração em [`app/build.gradle.kts`](file:///d:/git-projects/memes-brasileiros-android/app/build.gradle.kts):**
  - `versionCode = 22`
  - `versionName = "26.9.0"` (Ano: 2026, Mês: 9 - Setembro, Release: 0)

```kotlin
    defaultConfig {
        applicationId = "com.olivenbaum.memesbrasil"
        minSdk = 26
        targetSdk = 37
        versionCode = 22
        versionName = "26.9.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
```

---

## 🛡️ Checklist Obrigatório de Conteúdo e Questionário IARC (Google Play & AdMob)

Sempre que novos áudios, imagens, textos ou categorias forem adicionados ou editados no aplicativo, os agentes de IA **DEVEM OBRIGATORIAMENTE** auditar os novos conteúdos contra as perguntas oficiais do questionário de classificação de conteúdo (IARC) do Google Play Console e regras do AdMob:

### 1. Tolerância Zero (Risco Imediato de Ban / Suspensão)
- **Discurso de Ódio / Discriminação (Hate Speech):**
  - *Pergunta IARC:* Linguagem discriminatória (contra raças, religiões, gênero, orientação sexual, etc.).
  - *Regra:* **PROIBIDO**. Nunca adicionar termos homofóbicos, racistas ou discriminatórios a grupos protegidos (ex.: ofensas contra orientação sexual). No questionário IARC, esta opção deve sempre permanecer **Desmarcada / Não**.
- **Conteúdo Sexualmente Explícito:**
  - *Pergunta IARC:* Nudez, atos sexuais, comportamentos sugestivos ou sexualidade explícita.
  - *Regra:* **PROIBIDO**. Não incluir áudios pornográficos/eróticos (ex.: gemidos de material adulto) nem palavras com anatomia sexual explícita em botões. A resposta no IARC DEVE ser **Não**.

### 2. Substâncias Controladas (Drogas, Bebidas Alcoólicas e Tabaco)
- *Pergunta IARC:* *"A aplicação contém qualquer referência ou casos de consumo de drogas, bebidas alcoólicas ou tabaco?"*
- *Regra:* Manter a resposta sempre como **Não**. **Não adicionar** áudios que citem, façam apologia ou referenciem substâncias ilegais, entorpecentes ou drogas recreativas (ex.: o áudio antigo da maconha foi removido para assegurar o "Não").

### 3. Profanidade e Linguagem Chula (Proteção AdMob e IARC)
- *Perguntas IARC no Console:*
  - Profanidade ligeira: **Sim** *(Frequência: Frequentemente)*
  - Linguagem imprópria moderada: **Sim** *(Frequência: Frequentemente)*
  - Expletivos de teor sexual: **Sim** *(Frequência: Frequentemente)*
- *Regra Crítica para UI (AdMob):* **NUNCA** exibir palavrões crus nos títulos dos botões da interface. Sempre aplicar máscara com asteriscos (ex.: `p***a`, `m***a`, `c*`, `c***lho`, `f***a`). O Google AdMob desativa contas que exibam termos obscenos explícitos na UI onde anúncios são carregados.

### 4. Violência, Medo e Jogos de Azar
- *Perguntas IARC:*
  - Violência, Sangue ou Imagens Violentas: **Não**
  - Medo (sons assustadores ou aterradores): **Não**
  - Jogos de Azar reais ou simulados: **Não**
- *Regra:* Não incluir áudios com incitação à violência real ou efeitos de "jumpscare" aterrador.

### 5. Humor Ofensivo (Funções Corporais)
- *Pergunta IARC:* *"A aplicação contém funções corporais como arrotos, flatulência ou vómito utilizadas com fins humorísticos?"*
- *Regra:* Manter a resposta como **Não** (não incluir sons de flatulência, arrotos ou vômito).

### 6. Partilha de Conteúdo e Conteúdo Online
- *Perguntas IARC:*
  - Partilha de Conteúdos dos Utilizadores (rede social ou chat interno): **Não** *(o compartilhamento é externo via Intent padrão do sistema operacional)*.
  - Conteúdo Online (streaming ou download dinâmico externo ao app): **Não** *(todos os áudios e imagens ficam obrigatoriamente embutidos no APK)*.

### 7. Propriedade Intelectual e Direito de Imagem
- **Imagens:** Devem ser sempre ilustrações estilizadas / caricaturas, nunca fotos reais de estúdio ou capturas diretas de TV de celebridades.
- **Marcas de Terceiros:** Não utilizar nomes de marcas comerciais (como "WhatsApp") em nomes de áudios ou títulos na UI.

