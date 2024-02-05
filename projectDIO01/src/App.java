/* Entendendo o Desafio
 
Agora é a sua hora de brilhar e construir um perfil de destaque na DIO! Explore todos os conceitos explorados até aqui e replique (ou melhore, porque não?) este projeto prático. Para isso, crie seu próprio repositório e aumente ainda mais seu portfólio de projetos no GitHub, o qual pode fazer toda diferença em suas entrevistas técnicas 😎
 
Neste repositório, insira todos os links e arquivos necessários para seu projeto, seja um arquivo de banco de dados ou um link para o template no Figma.
 
Dica: Se o expert forneceu um repositório Github, você pode dar um "fork" no repositório dele para organizar suas alterações e evoluções mantendo uma referência direta ao código-fonte original.
 
Instruções para entrega
# 1️⃣ Desafio Classificador de nível de Herói

**O Que deve ser utilizado**

- Variáveis -
- Operadores -
- Laços de repetição
- Estruturas de decisões -

## Objetivo

Crie uma variável para armazenar o nome e a quantidade de experiência (XP) de um herói, depois utilize uma estrutura de decisão para apresentar alguma das mensagens abaixo:

Se XP for menor do que 1.000 = Ferro
Se XP for entre 1.001 e 2.000 = Bronze
Se XP for entre 2.001 e 5.000 = Prata
Se XP for entre 5.001 e 7.000 = Ouro
Se XP for entre 7.001 e 8.000 = Platina
Se XP for entre 8.001 e 9.000 = Ascendente
Se XP for entre 9.001 e 10.000= Imortal
Se XP for maior ou igual a 10.001 = Radiante

## Saída

Ao final deve se exibir uma mensagem:
"O Herói de nome **{nome}** está no nível de **{nivel}**"
 */



import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nameHero;
        int xpHero;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá heroi, qual o seu nome? ");
        nameHero = scanner.next();
        System.out.println("Qual o seu xp? ");
        xpHero = scanner.nextInt();
        String msgResult = "O Herói de nome " + nameHero + " está no nível: ";


        if(xpHero <= 1000){
            System.out.println(msgResult + "Ferro");
        }else if(xpHero >= 1001 && xpHero <= 2000){
            System.out.println(msgResult + "Bronze");
        }else if(xpHero >= 2001 && xpHero <= 5000){
            System.out.println(msgResult + "Prata");
        }else if(xpHero >= 5001 && xpHero <= 7000){
            System.out.println(msgResult + "Ouro");
        }else if(xpHero >= 7001 && xpHero <= 8000){
            System.out.println(msgResult + "Platina");
        }else if(xpHero >= 8001 && xpHero <= 9000){
            System.out.println(msgResult + "Ascendente");
        }else if(xpHero >= 9001 && xpHero <= 10000){
            System.out.println(msgResult + "Imortal");
        }else if(xpHero >= 10001){
            System.out.println(msgResult + "Radiante");
        }

        
        scanner.close();
    }
}
