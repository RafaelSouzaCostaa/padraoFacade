/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padrao_facade;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Padrao_Facade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SistemaPagamento pagamento = new SistemaPagamento();
        SistemaReservaHotel reservaHotel = new SistemaReservaHotel();
        SistemaReservaPassagem reservaPassagem = new SistemaReservaPassagem();
        SistemaReservaCarro reservaCarro = new SistemaReservaCarro();

        Facade facade = new Facade(pagamento, reservaPassagem, reservaHotel, reservaCarro);

        //String msg = facade.Operacao(Pacote.PACOTE_PASSAGEM);
        //String msg  = facade.Operacao(Pacote.PACOTE_PASSAGEM_HOTEL);
        String msg  = facade.Operacao(Pacote.PACOTE_FULL);

        System.out.println(msg);
    }
}
