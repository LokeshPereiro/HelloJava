public class ArgsLineaComando {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Te faltan los argumentos");
            System.exit(-1);
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("Args nº " + i + ": " + args[i]);
        }
    }
}
