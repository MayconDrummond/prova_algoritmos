void main () {
    double temperatura, contador, adicao, media, soma;
    contador = 0;
    adicao = 0;
    media = 0;
    temperatura = 0;
    soma = 0;
   media = temperatura/contador;
   IO.println("Favor, não digitar 999 na primeira leitura.");
            temperatura = Double.parseDouble(IO.readln("Informe a temperatura em °C: "));
            for (soma = soma + temperatura; temperatura<999; contador ++){
    soma = soma + temperatura;
temperatura = Double.parseDouble(IO.readln("Informe a temperatura em °C: "));
adicao = adicao + contador;
IO.println("Caso deseje encerrar, digite 999.");}
if (temperatura == 999)
  media = soma/contador;
IO.println("A temperatura é igual a " + media + ".");
if (media <18)
    IO.println("Temperatura baixa: ligar aquecimento.");
if (media>=18 && media <=28)
     IO.println("Temperatura ideal.");
else{
        IO.println("Temperatura alta. Ligar ventilação");}
}