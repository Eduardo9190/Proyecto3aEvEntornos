
/**
 *
 * @author Eduardo Herencias Paco
 */
public class Operaciones {

    /**
     * El método recibe dos valores int y devuelve un array (int) con todos los
     * valores entre los dos dados (ambos incluidos) en orden ascendente. Se
     * tiene en cuenta el signo y el orden de los valores para evitar
     * excepciones. Se tiene en cuenta que ambos valores puedan ser iguales. Se
     * controla el valor que indica el tamaño del array para evitar que sea
     * negativo y se lance un NegativeArraySizeException.
     *
     * @param a contiene un valor tipo int
     * @param b contiene un valor tipo int
     * @return nums, devuelve un array (int) con los valores en orden ascendente
     */
    public int[] rango(int a, int b) {
        int j = 0;
        int[] nums;
        if (Math.abs(b - a) > 1) {
            j = 1;
            nums = new int[Math.abs((b - a)) + j];
            if (a < b) {
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = a;
                    a++;
                }
            } else if (a > b) {
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = b;
                    b++;
                }
            }
        } else {
            nums = new int[0];
        }
        return nums;
    }

    /**
     * El método recibe dos valores int y devuelve la suma de todos los valores
     * entre los dos dados (ambos incluidos). Se tiene en cuenta el signo y el
     * orden de los valores para evitar excepciones Se tiene en cuenta que ambos
     * valores puedan ser iguales.
     *
     *
     * @param a contiene un valor tipo int
     * @param b contiene un valor tipo int
     * @return sum, devuelve un int
     */
    public int sumRango(int a, int b) {
        int sum = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * El método recibe un valor int y calcula si este es par o no. Se tiene en
     * cuenta que el numero pueda ser par o impar, cero o negativo Se lanzan
     * excepciones de tipo IllegalArgumentException para cero y negativo
     *
     *
     * @param a contiene un valor tipo int
     * @return boolean, devuelve true si es par, devuelve false para impar
     */
    public boolean isPar(int a) {
        boolean par = true;
        if (a <= 0) {
            throw new IllegalArgumentException();
        } else {
            if (a % 2 == 0) {
            } else {
                par = false;
            }
        }
        return par;
    }

    /**
     * El método recibe un array de valores int y devuelve un array que contiene
     * los valores positivos encontrados en el primer array. Se controla que el
     * Array pueda ser null y se lanza IllegalArgumentException Se controla que
     * el Array pueda ser empty y se devuelve un Array sin valores
     *
     * @param nums, Array de tipo int que contiene los valores a examinar
     * @return positivos, Array de tipo int que contiene solo los valores int
     * positivos
     */
    public int[] extraerPositivos(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException();
        }        
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                n++;
            }
        }

        int[] positivos = new int[n];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positivos[j] = nums[i];
                j++;
            }
        }
        return positivos;
    }
}
