package reestaurante;

public class Entrada {
    public static void main(String[] args) {
        Restaurante<PedidoComida> soloComida = new Restaurante("FoodAndGo", 30, 3);
        PedidoComida pedidoComida1 = new PedidoComida(2,1);
        PedidoComida pedidoComida2 = new PedidoComida(2,1);
        soloComida.registrarPedido(pedidoComida1);

        soloComida.verPedidos();


        Restaurante<ConsumicionBarra> soloBebida = new Restaurante("DrinkBetter",23,1);
        ConsumicionBarra consumicionBarra1 = new ConsumicionBarra(4,3);
        ConsumicionBarra consumicionBarra2 = new ConsumicionBarra(4,3);
        soloBebida.registrarPedido(consumicionBarra1);

        soloBebida.verPedidos();



    }
}
