import java.util.Scanner;


public class quizPrincipal {
    public static void menu(){
        
       System.out.println("!!!Quiz!!!\n");
       System.out.println("1. Inicio do jogo");
       System.out.println("0. Sair");
   }
    
    
   public static void Cfilmes(){
       System.out.println(" Inicio do Jogo!!!\n Boa sorte!!!\n");
   
       quizPerguntas.filmes();
       System.out.println(quizPerguntas.filmes.get(2));
      }
   public static void Aanimes(){
      
       quizPerguntas.animes();
       System.out.println(quizPerguntas.animes.get(0));
      }
  
   public static void Afilmes(){
      
       quizPerguntas.filmes();
       System.out.println(quizPerguntas.filmes.get(0));
      }
    
   public static void Bfilmes(){
       
       quizPerguntas.filmes();
       System.out.println(quizPerguntas.filmes.get(1));
      }
   public static void Banimes(){
      
       quizPerguntas.animes();
       System.out.println(quizPerguntas.animes.get(1));
      }
   public static void Alivros(){
      
       quizPerguntas.livros();
       System.out.println(quizPerguntas.livros.get(0));
      }
   public static void Canimes(){
      
       quizPerguntas.animes();
       System.out.println(quizPerguntas.animes.get(2));
      }

   public static void Blivros(){
      
       quizPerguntas.livros();
       System.out.println(quizPerguntas.livros.get(1));
      }
   public static void Clivros(){
      
       quizPerguntas.livros();
       System.out.println(quizPerguntas.livros.get(2));
      }

   
   public static void main(String[] args){
   int opcao;  
   Scanner qp = new Scanner(System.in);
   quizJogador jogador1 = new quizJogador();
   
   System.out.println("Digite seu nome:");
   String nome = qp.nextLine();
   jogador1.setNome(nome);
   
   System.out.println("Bem vindo(a) "+jogador1.getNome()+" !!!");
   
   
   System.out.println("Digite sua idade:");
   int idade = qp.nextInt();
   jogador1.setIdade(idade);
    if(idade >= 12){
        System.out.println("Acesso liberado!!!\n"); 
      
    do{
        
        menu();
        opcao = qp.nextInt();
       
        switch(opcao){
            
            case 1:
              
            System.out.println("Categorias:\n");
            
            System.out.println("1. Filmes");
            System.out.println("2. Animes");
            System.out.println("3. Livros");
            
            int categoria;
            
            categoria = qp.nextInt();
            
            if(categoria == 1){
            
                System.out.println("Categoria: Filmes\n");
                
            int respostaA;
           
                Afilmes();
                respostaA = qp.nextInt();  
                
                if (respostaA == 4){
                    System.out.println("Você acertou!!!\n");
                } else if(respostaA == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaA == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaA == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }
             
                
            int respostad;
           
                Bfilmes();
                respostad = qp.nextInt();  
                
                if (respostad == 3){
                    System.out.println("Você acertou!!!\n");
                } else if(respostad == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostad == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostad == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }
            
                
            int respostaf;
           
                Cfilmes();
                respostaf = qp.nextInt();  
                
                if (respostaf == 2){
                    System.out.println("Você acertou!!!\n");
                } else if(respostaf == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaf == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaf == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
                
            } else if(categoria == 2){
                
                System.out.println(" Inicio do Jogo!!!\n Boa sorte!!!\n");
                
             
                System.out.println("Categoria: Animes\n");
                
            int resposta3;
           
                Aanimes();
                resposta3 = qp.nextInt();  
                
                if (resposta3 == 1){
                    System.out.println("Você acertou!!!\n");
                } else if(resposta3 == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta3 == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta3 == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
            int resposta1;
           
                Banimes();
                resposta3 = qp.nextInt();  
                
                if (resposta3 == 4){
                    System.out.println("Você acertou!!!\n");
                } else if(resposta3 == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta3 == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta3 == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
            
            int resposta5;
           
                Canimes();
                resposta5 = qp.nextInt();  
                
                if (resposta5 == 4){
                    System.out.println("Você acertou!!!\n");
                } else if(resposta5 == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta5 == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(resposta5 == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }
    
              
            } else if(categoria == 3){
                
                System.out.println(" Inicio do Jogo!!!\n Boa sorte!!!\n");
             
                System.out.println("Categoria: Livros\n");
                
            int respostaxxxx;
           
                Alivros();
                respostaxxxx = qp.nextInt();  
                
                if (respostaxxxx == 3){
                    System.out.println("Você acertou!!!\n");
                } else if(respostaxxxx == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaxxxx == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaxxxx == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
                int respostaxxx;
           
                Blivros();
                respostaxxxx = qp.nextInt();  
                
                if (respostaxxxx == 1){
                    System.out.println("Você acertou!!!\n");
                } else if(respostaxxxx == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaxxxx == 4){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaxxxx == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }
                
            int respostaxxxxx;
           
                Clivros();
                respostaxxxxx = qp.nextInt();  
                
                if (respostaxxxxx == 4){
                    System.out.println("Você acertou!!!\n");
                } else if(respostaxxxxx == 1){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaxxxxx == 2){
                        System.out.println("Não foi dessa vez!!!\n");
                }else if(respostaxxxxx == 3){
                        System.out.println("Não foi dessa vez!!!\n");
                }
            
            }
            
           
        }
    } while(opcao !=0);
            System.out.println("Fim de Jogo!!!\n Até o próximo QUIZ!!!");
    }else {
        System.out.println("Acesso negado!!!");
    }
    }
}
