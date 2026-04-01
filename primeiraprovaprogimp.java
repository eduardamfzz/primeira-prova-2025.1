public class primeiraprovaprogimp {

    // a)
    public static int uniao(int[] a, int tamA, int[] b, int tamB, int[] u) {
        int tamU = 0;

        for (int i = 0; i < tamA; i++) {
            boolean repetido = false;
            for (int j = 0; j < tamU; j++) {
                if (u[j] == a[i]) {
                    repetido = true;
                }
            }
            if (!repetido) {
                u[tamU] = a[i];
                tamU++;
            }
        }

        for (int i = 0; i < tamB; i++) {
            boolean repetido = false;
            for (int j = 0; j < tamU; j++) {
                if (u[j] == b[i]) {
                    repetido = true;
                }
            }
            if (!repetido) {
                u[tamU] = b[i];
                tamU++;
            }
        }

        return tamU;
    }

    // b)
    public static void ordenar(int[] v, int n) {
        for (int i = 1; i < n; i++) {
            int chave = v[i];
            int j = i - 1;
            while (j >= 0 && v[j] > chave) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = chave;
        }
    }

    // c)
    public static int gerarVetorSemRepeticao(int[] v, int tamV, int[] vsr) {
        int tamVSR = 0;

        for (int i = 0; i < tamV; i++) {
            boolean repetido = false;
            for (int j = 0; j < tamVSR; j++) {
                if (vsr[j] == v[i]) {
                    repetido = true;
                }
            }
            if (!repetido) {
                vsr[tamVSR] = v[i];
                tamVSR++;
            }
        }

        return tamVSR;
    }

    // d)
    public static void rotacionar(int[] v, int tam, int k) {
        if (k < 0) {
            k = tam + (k % tam);
        }

        for (int i = 0; i < k; i++) {
            int primeiro = v[0];
            for (int j = 0; j < tam - 1; j++) {
                v[j] = v[j + 1];
            }
            v[tam - 1] = primeiro;
        }
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};
        int[] u = new int[10];
        int tamU = uniao(a, 4, b, 4, u);
        for (int i = 0; i < tamU; i++) System.out.print(u[i] + " ");
        System.out.println();

        int[] v1 = {5, 3, 8, 1, 9, 2};
        ordenar(v1, 6);
        for (int i = 0; i < 6; i++) System.out.print(v1[i] + " ");
        System.out.println();

        int[] v2 = {5, 2, 5, 3, 8, 3, 8, 2};
        int[] vsr = new int[8];
        int tamVSR = gerarVetorSemRepeticao(v2, 8, vsr);
        for (int i = 0; i < tamVSR; i++) System.out.print(vsr[i] + " ");
        System.out.println();

        int[] v3 = {1, 2, 3, 4, 5};
        rotacionar(v3, 5, 2);
        for (int i = 0; i < 5; i++) System.out.print(v3[i] + " ");
        System.out.println();

        int[] v4 = {1, 2, 3, 4, 5};
        rotacionar(v4, 5, -1);
        for (int i = 0; i < 5; i++) System.out.print(v4[i] + " ");
        System.out.println();
    }
}
