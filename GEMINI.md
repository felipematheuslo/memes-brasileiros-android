# Regras de Agente (Gemini)

Consulte o arquivo principal [AGENTS.md](file:///d:/git-projects/memes-brasileiros-android/AGENTS.md) para as diretrizes completas de desenvolvimento e versionamento deste projeto.

## Regras Críticas de Versionamento (Play Store)
- **`versionCode`**: Sempre incrementar em `+1` a cada release para a Play Store.
- **`versionName`**: Seguir estritamente o padrão `ano.mes.release` (formato `YY.M.R`, ex: `26.9.0` para setembro/2026, release 0).
- **Arquivo alvo:** [`app/build.gradle.kts`](file:///d:/git-projects/memes-brasileiros-android/app/build.gradle.kts)
