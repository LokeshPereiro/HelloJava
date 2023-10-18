public class ArrayMetodosObjString {
    public static void main(String[] args) {
        String nombre = "Jaimito_Perez";
        //System.out.println("nombre.toCharArray() = " + nombre.toCharArray());
        char[] arr = nombre.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            //System.out.println("arr[i] = " + arr[i]);
            System.out.print(arr[i] + " ");
        }

        System.out.println("nombre = " + nombre.split("i"));
        String[] arrString = nombre.split("i");
        for (int j = 0; j < arrString.length; j++) {
            System.out.println(arrString[j]);
        }

        String imgExt = "mi_imagen.png";
        String[] imgArr = imgExt.split("\\."); // un punto (.) a solas no podemos ponerlo ya que forma parte de la exp regular. También se puede hacerlo dentro de []
        for (int k = 0; k < imgArr.length; k++) {
            System.out.println(imgArr[k]);
        }
    }
}
