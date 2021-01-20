
# Imagine uma lista de compras. Ela possui:
-
## Itens
Quantidade de cada item
Preço por unidade/peso/pacote de cada item
Desenvolva uma função (ou método) que irá receber uma lista de compras (como a detalhada acima) e uma lista de e-mails. Aqui, cada e-mail representa uma pessoa.
-
# A função deve:
alcular a soma dos valores, ou seja, multiplicar o preço de cada item por sua quantidade e somar todos os itens
Dividir o valor de forma igual entre a quantidade de e-mails
Retornar um mapa/dicionário onde a chave será o e-mail e o valor será quanto ele deve pagar nessa conta
-
# ⚠️ IMPORTANTE
-
Quando fizer a divisão, é importante que não falte nenhum centavo! Cuidado quando tiver, por exemplo, um valor total de R$ 1,00 para ser dividido entre 3 e-mails. Isso daria uma dízima infinita. No entanto, o correto aqui é que duas pessoas fiquem com o valor 0,33 e a terceira fique com 0,34.
Para facilitar e como boa prática, não trabalhe com valores com decimais. Ou seja, ponto flutuante ou float. Use inteiros para representar os valores! Como a menor unidade na nossa moeda é o centavo, use valores inteiros em centavos. Assim, um real será representado por 100 (cem centavos é igual a um real).

