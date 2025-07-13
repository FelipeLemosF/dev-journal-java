package dev.felipe.dev_journal.enums;

/**
 * Enum com operações numéricas
 *
 * <p>
 *     Operações presentes:
 *     <ul>
 *         <li>{@link #SOMA} - somatória dos números de <code>a + b</code></li>
 *         <li>{@link #SUBTRACAO} - subtração de <code>a - b</code></li>
 *         <li>{@link #MULTIPLICACAO} - multiplicação de <code>a * b</code></li>
 *         <li>{@link #DIVISAO} - divisão de <code>a / b</code> (lança exceção se <code>b == 0</code>)</li>
 *     </ul>
 * </p>
 */
public enum Operacao {
    SOMA {
        @Override
        public int exec(int a, int b){
            return a + b;
        }
    },

    SUBTRACAO {
        @Override
        public int exec(int a, int b){
            return a - b;
        }
    },

    MULTIPLICACAO {
        @Override
        public int exec(int a, int b){
            return a * b;
        }
    },

    DIVISAO {

        @Override
        public int exec(int a, int b) {
            if (b == 0) throw new ArithmeticException("Divisão por zero");
            return a / b;
        }
    };

    public abstract int exec(int a, int b);
}
