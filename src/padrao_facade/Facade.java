/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrao_facade;

/**
 *
 * @author Rafael de Souza Costa
 */
public class Facade {

    protected SistemaPagamento sistemaPagamento;
    protected SistemaReservaPassagem sistemaReservaPassagem;
    protected SistemaReservaHotel sistemaReservaHotel;
    protected SistemaReservaCarro sistemaReservaCarro;

    public Facade(SistemaPagamento sistemaPagamento, SistemaReservaPassagem sistemaReservaPassagem,
                  SistemaReservaHotel sistemaReservaHotel, SistemaReservaCarro sistemaReservaCarro) {
        this.sistemaPagamento = sistemaPagamento;
        this.sistemaReservaPassagem = sistemaReservaPassagem;
        this.sistemaReservaHotel = sistemaReservaHotel;
        this.sistemaReservaCarro = sistemaReservaCarro;
    }

    public String Operacao(String pacote) {
                
        if(Pacote.PACOTE_FULL.equals(pacote)){
            return "Mensagens: \n"
            + sistemaPagamento.executar()
            + sistemaReservaPassagem.executar()
            + sistemaReservaHotel.executar()
            + sistemaReservaCarro.executar();    
        }
        if(Pacote.PACOTE_PASSAGEM_HOTEL.equals(pacote)){
            return "Mensagens: \n"
            + sistemaPagamento.executar()
            + sistemaReservaPassagem.executar()
            + sistemaReservaHotel.executar();
        }
        if(Pacote.PACOTE_PASSAGEM.equals(pacote)){
            return "Mensagens: \n"
            + sistemaPagamento.executar()
            + sistemaReservaPassagem.executar();
        }
        return "Pacote não contratado!";
    }
}
