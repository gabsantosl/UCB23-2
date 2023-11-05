def ler_arquivo(nome_arquivo):
    with open(nome_arquivo, 'r') as arquivo:
        return [linha.strip().split(';') for linha in arquivo.readlines()]

def escrever_arquivo(nome_arquivo, livros):
    with open(nome_arquivo, 'w') as arquivo:
        for livro in livros:
            arquivo.write(f'{livro[0]};{livro[1]}\n')

def exibir_fila(fila):
    for livro in fila:
        print(f'{livro[0]} - {livro[1]}')

def inserir_na_fila(fila, livro):
    fila.append(livro)

def remover_da_fila(fila):
    if fila:
        return fila.pop(0)
    else:
        print("A fila está vazia")

def exibir_pilha(pilha):
    for livro in pilha:
        print(f'{livro[0]} - {livro[1]}')

def inserir_na_pilha(pilha, livro):
    pilha.append(livro)

def remover_da_pilha(pilha):
    if pilha:
        return pilha.pop()
    else:
        print("A pilha está vazia")

fila = ler_arquivo('fila_de_livros.txt')
pilha = ler_arquivo('pilha_de_livros.txt')

while True:
    print("\nMenu:")
    print("1. Exibir fila de livros")
    print("2. Inserir novo livro na fila")
    print("3. Inserir novo livro na pilha")
    print("4. Remover livro da fila")
    print("5. Remover livro da pilha")
    print("6. Sair")

    escolha = input("\nEscolha uma opção: ")

    if escolha == '1':
        exibir_fila(fila)
    elif escolha == '2':
        nome_livro = input("Digite o nome do livro: ")
        autor = input("Digite o nome do autor: ")
        novo_livro = [nome_livro, autor]
        inserir_na_fila(fila, novo_livro)
        escrever_arquivo('fila_de_livros.txt', fila)
    elif escolha == '3':
        nome_livro = input("Digite o nome do livro: ")
        autor = input("Digite o nome do autor: ")
        novo_livro = [nome_livro, autor]
        inserir_na_pilha(pilha, novo_livro)
        escrever_arquivo('pilha_de_livros.txt', pilha)
    elif escolha == '4':
        livro_removido = remover_da_fila(fila)
        if livro_removido:
            print(f'O livro {livro_removido[0]} - {livro_removido[1]} foi removido da fila')
            escrever_arquivo('fila_de_livros.txt', fila)
    elif escolha == '5':
        livro_removido = remover_da_pilha(pilha)
        if livro_removido:
            print(f'O livro {livro_removido[0]} - {livro_removido[1]} foi removido da pilha')
            escrever_arquivo('pilha_de_livros.txt', pilha)
    elif escolha == '6':
        break
    else:
        print("Opção inválida. Tente novamente.")