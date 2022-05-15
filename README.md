
# Exercícios módulo 02 - semana 03 - curso DEVinHouse


# Exercício 02 

Crie uma classe chamada Fatura para que uma loja de suprimentos de informática a utilize para representar uma fatura de um item vendido nela.

Uma fatura deve incluir quatro partes das informações como variáveis de instância — o número (tipo String), a descrição (tipo String), a quantidade comprada de um item (tipo int) e o preço por item (double).

Sua classe deve ter um construtor que inicializa as quatro variáveis de instância. Forneça um método set e um get para cada variável de instância.

Além disso, forneça um método chamado getValorFatura que calcula o valor da fatura (isto é, multiplica a quantidade pelo preço por item) e depois retorna esse valor como double. Se a quantidade não for positiva, ela deve ser configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como 0.0.

Escreva um aplicativo de teste chamado TestaFatura que demonstra as capacidades da classe Fatura.

# Execício 03

Ao fazer exercícios físicos, você pode utilizar um monitor de frequência cardíaca para ver se sua frequência permanece dentro de um intervalo seguro sugerido pelos seus treinadores e médicos. 
Segundo a American Heart Association (AHA), a fórmula para calcular a frequência cardíaca máxima por minuto é 220 menos a idade em anos. 
Sua frequência cardíaca alvo é um intervalo entre 50-85% da sua frequência cardíaca máxima.

Crie uma classe chamada FrequenciaCardiaca. Os atributos da classe devem incluir o nome, sobrenome e data de nascimento da pessoa. 
Sua classe deve ter um construtor que receba esses dados como parâmetros. Para cada atributo, forneça métodos set e get.

A classe também deve incluir um método que calcule e retorne a idade (em anos), um que calcule e retorne a frequência cardíaca máxima e um que calcule e retorne a frequência cardíaca alvo da pessoa.

Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe FrequenciaCardiaca e imprima as informações a partir desse objeto 
— incluindo nome, sobrenome e data de nascimento da pessoa 
— calcule e imprima a idade da pessoa (em anos), seu intervalo de frequência cardíaca máxima e sua frequência cardíaca alvo.

# Exercício 04

A digitalização dos registros de saúde pode facilitar que pacientes compartilhem seus perfis e históricos de saúde entre vários profissionais de saúde. Isso talvez aprimore a qualidade da assistência médica, ajude a evitar conflitos e prescrições erradas de medicamentos, reduza custos em ambulatórios e salve vidas. Neste exercício, você projetará uma classe PerfilDeSaude para uma pessoa. Os atributos da classe devem incluir nome, sobrenome, sexo, data de nascimento, altura (em metros) e peso (em quilogramas) da pessoa. Sua classe deve ter um construtor que receba esses dados.

Para cada atributo, analise a necessidade de fornecer métodos set e get. A classe também deve incluir métodos que calculem e retornem a idade do usuário em anos, intervalo de frequência cardíaca máxima e frequência cardíaca alvo (vide exercício 3), além de índice de massa corporal (IMC, pesquise a fórmula).

Escreva um aplicativo Java que solicite as informações da pessoa (utilize Scanner), instancie um objeto da classe PerfilDeSaude para ela e imprima as informações a partir desse objeto — incluindo nome, sobrenome, sexo, data de nascimento, altura e peso da pessoa ––, e então calcule e imprima a idade em anos, IMC, intervalo de frequência cardíaca máxima e frequência cardíaca alvo.

Observação: Essas fórmulas são estimativas fornecidas pela AHA. 
As frequências cardíacas máximas e alvo podem variar com base na saúde, capacidade física e sexo da pessoa. 
Sempre consulte um médico ou profissional de saúde qualificado antes de começar ou modificar um programa de exercícios físicos.
