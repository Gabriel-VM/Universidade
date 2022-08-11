# Universidade
Códigos para um software simples de gestão dos funcionários de uma universidade.

Em uma universidade, existe um quadro de pessoal dividido em dois
grupos:

● Pessoal de Administração e Serviços (PAS): todo o pessoal que desempenha trabalhos administrativos ou de
gestão de algum tipo de serviço. Neste caso, por simplicidade, apenas vamos
considerar que existe pessoal administrativo e pessoal informático. 

● Pessoal Docente Investigador (PDI): pessoal que se dedica ao ensino e à
investigação, no qual estão os professores e os investigadores contratados
para algum projeto de investigação. 

Todo o pessoal identifica-se com o seu nome e CC, e recebe um salário mensal que
se calcula, de forma simplificada, considerando o número de horas de
trabalho por semana multiplicado pelo valor/hora da sua categoria e pelo número de
semanas por mês (4). Os dados de cada tipo de pessoal são os seguintes (as
quantidades não são reais):

Administrativo: 37 horas/semana e um valor de 7,5 euros/hora. 
Informático: 40 horas/semana e um valor de 6 euros/hora. 
Professores: 37 horas/semana com um valor de 8 euros/hora. 
Investigadores: 35 horas/semana com um valor de 7 euros/hora. 

Além do mais, os professores e os PAS têm as seguintes remunerações adicionais: 

● Professores: adiciona-se um complemento salarial em função do que se conhece
como sexénios (períodos de 6 anos avaliados positivamente) e que se podem
conceder até um máximo de 6 anos. Em concreto, adiciona-se 100 euros por mês
por sexénio reconhecido. Uma vez concedido o sexénio, o aumento do saldo
mantém-se sempre.

● PAS: num determinado mês, os PAS (tanto administrativos como informáticos)
podem acumular horas extras. Cada hora extra paga-se 6 euros/hora. As horas
extras, uma vez pagas, começam de novo no zero (por exemplo, na hora de
calcular o saldo de pessoal). 

Criei uma estrutura de classes e subclasses que representa os trabalhadores da
universidade. Nessa estrutura, existe uma superclasse comum a todos os
trabalhadores, a classe "Pessoal".

Criei uma classe "Universidade", com uma função "public static void
imprimirNominas(Pessoal[] listaPessoal)", que impre por ecrã,
para cada Pessoal incluído na listaPessoal, o nome do pessoal, a sua
categoria e o seu saldo. 

Na mesma classe Universidade, criei uma função "obterOrçamentoTotal",
que devolve o total de dinheiro que a universidade gasta em pessoal.

Para evitar usar decimais em quantidades monetárias, trabalhei com o
dinheiro em cêntimos de Euro e o converti em euros na hora de mostrá-lo
por ecrã.
