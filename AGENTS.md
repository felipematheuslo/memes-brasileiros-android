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
