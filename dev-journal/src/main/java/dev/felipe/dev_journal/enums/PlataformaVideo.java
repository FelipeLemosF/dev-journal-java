package dev.felipe.dev_journal.enums;

/**
 * Enum que representa plataformas de vídeo com suas respectivas URLs base.
 *
 * <p>Cada valor possui uma URL associada que pode ser usada para redirecionamento,
 * integração externa ou exibição ao usuário.</p>
 *
 * <p>Plataformas disponíveis:
 * <ul>
 *   <li>{@link #YOUTUBE} - https://youtube.com</li>
 *   <li>{@link #VIMEO} - https://vimeo.com</li>
 *   <li>{@link #TIKTOK} - https://tiktok.com</li>
 * </ul>
 *
 * Esse eu fiz para entender melhor como funcionam os enums com valor
 */

public enum PlataformaVideo {
    YOUTUBE("https://youtube.com"),
    VIMEO("https://vimeo.com"),
    TIKTOK("https://tiktok.com");

    private final String url;

    PlataformaVideo(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public static PlataformaVideo fromUrl(String url) {
        for (PlataformaVideo p : values()) {
            if (p.url.equalsIgnoreCase(url)) {
                return p;
            }
        }
        throw new IllegalArgumentException("URL inválida: " + url);
    }

    @Override
    public String toString() {
        return this.name() + " (" + url + ")";
    }
}