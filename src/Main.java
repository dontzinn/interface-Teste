//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClasseInterface x = new ClasseInterface();

        //Teste do metódo soma
        int teste;
        teste = x.metodo1(1,2);
        System.out.println(teste);

        //Teste do metódo mensagem
        String msg;
        msg = x.mensagem("Hello World");
        System.out.println(msg);
    }
}