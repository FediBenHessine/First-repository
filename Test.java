public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calculatrice = new Calculatrice();
        double a, b;
        String operation;
        double resultat;

        System.out.println("Entrez le premier nombre :");
        a = scanner.nextDouble();

        System.out.println("Entrez le deuxième nombre :");
        b = scanner.nextDouble();

        System.out.println("Entrez l'opération à effectuer (+, -, *, /) :");
        operation = scanner.next();

        switch (operation) {
            case "+":
                resultat = calculatrice.addition(a, b);
                break;
            case "-":
                resultat = calculatrice.soustraction(a, b);
                break;
            case "*":
                resultat = calculatrice.multiplication(a, b);
                break;
            case "/":
                try {
                    resultat = calculatrice.division(a, b);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Opération invalide.");
                return;
        }

        System.out.println("Résultat : " + resultat);
    }
}
