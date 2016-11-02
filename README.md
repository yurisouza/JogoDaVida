# JogoDaVida
Desenvolvimento do algoritmo Jogo da Vida, feito em Java.

Desenvolva um algoritmo que execute 'um passo' do Jogo da Vida. 

As regras são bem simples: 
- Qualquer célula viva com menos que duas células vivas vizinhas morre, por baixa população; 
- Qualquer célula viva com mais que três células vivas vizinhas morre, por alta população; 
- Qualquer célula viva com duas ou três células vivas vizinhas permanece viva para a próxima geração; 
- Qualquer célula morta com exatamente três células vivas vizinhas se transforma em uma célula viva; 
- Leve em conta as células na diagonal 

Crie uma matriz 3 x 3 para representar aonde as células vão estar com valores variáveis em cada célula da matriz. 
Retorne o que acontece com uma célula selecionada da matriz do Exemplo: 

Dado viva = 1 e morta = 0 

Para uma matriz:    

1 0 0

0 1 0

1 0 1  

O resultado ao selecionar a célula da segunda linha e da segunda coluna deve ser: __A célula continua viva__ 

O resultado ao selecionar a célula da primeira linha e da segunda coluna deve ser: __A célula continua morta__

O resultado ao selecionar a célula da terceira linha e da segunda coluna deve ser: __A célula revive__

O resultado ao selecionar a célula da terceira linha e da terceira coluna deve ser: __A célula morre por baixa população__
