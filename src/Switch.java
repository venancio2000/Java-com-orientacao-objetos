public class Switch {
    public static void main(String[] args) {
        int dia = 31;
        String nomeDia;

        switch (dia){
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda";
                break;
            case 3:
                nomeDia = "Terca";
                break;
            case 4:
                nomeDia = "Quarta";
                break;
            case 5:
                nomeDia = "Quinta";
                break;
            case 6:
                nomeDia = "Sexta";
                break;
            case 7:
                nomeDia = "Sabado";
                break;
            default:
                nomeDia = "Dia invalido!";
        }
        System.out.println("O dia " + dia + " é " + nomeDia);

    }
}
