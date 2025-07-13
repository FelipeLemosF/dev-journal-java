package dev.felipe.dev_journal.enums;

/**
 * Service para mostrar exemplos de como utilizar os diferentes tipos de Enums
 */
public class EnumExemploService {

    // 1. Usa enum simples: Status
    public String verificarStatus(Status status) {
        switch (status) {
            case ATIVO:
                return "O recurso está ativo.";
            case INATIVO:
                return "O recurso está inativo.";
            case PENDENTE:
                return "O recurso está aguardando ativação.";
            default:
                throw new IllegalArgumentException("Status desconhecido: " + status);
        }
    }

    // 2. Usa enum com comportamento: Operacao
    public int calcular1(int a, int b, Operacao operacao) {
        return operacao.exec(a, b);
    }
    // OU
    public int calcular2(int a, int b) {
        return Operacao.SOMA.exec(a, b);
    }

    // 3. Usa enum com atributo + parsing: PlataformaVideo
    public String obterUrlPlataforma(String nomePlataforma) {
        PlataformaVideo plataforma = PlataformaVideo.valueOf(nomePlataforma.toUpperCase()); // RETORNA A URL COM BASE NO ENUM
        return plataforma.getUrl();
    }

    public PlataformaVideo detectarPlataformaPorUrl(String url) {
        return PlataformaVideo.fromUrl(url); // RETORNA O ENUM COM BASE NA URL
    }

}
