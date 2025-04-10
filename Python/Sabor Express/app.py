restaurantes = [{"nome": "Praça", "categoria": "Japonesa", "ativo": False},
                {"nome": "Pizza Suprema", "categoria": "Italiana", "ativo": True},
                {"nome": "Cantina", "categoria": "Fast-Food", "ativo": False}]

def exibir_nome_do_programa():
    print("""
░██████╗░█████╗░██████╗░░█████╗░██████╗░  ███████╗██╗░░██╗██████╗░██████╗░███████╗░██████╗░██████╗
██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔══██╗  ██╔════╝╚██╗██╔╝██╔══██╗██╔══██╗██╔════╝██╔════╝██╔════╝
╚█████╗░███████║██████╦╝██║░░██║██████╔╝  █████╗░░░╚███╔╝░██████╔╝██████╔╝█████╗░░╚█████╗░╚█████╗░
░╚═══██╗██╔══██║██╔══██╗██║░░██║██╔══██╗  ██╔══╝░░░██╔██╗░██╔═══╝░██╔══██╗██╔══╝░░░╚═══██╗░╚═══██╗
██████╔╝██║░░██║██████╦╝╚█████╔╝██║░░██║  ███████╗██╔╝╚██╗██║░░░░░██║░░██║███████╗██████╔╝██████╔╝
╚═════╝░╚═╝░░╚═╝╚═════╝░░╚════╝░╚═╝░░╚═╝  ╚══════╝╚═╝░░╚═╝╚═╝░░░░░╚═╝░░╚═╝╚══════╝╚═════╝░╚═════╝░""")

def exibir_opcoes():
    print("1. Cadastrar restaurante")
    print("2. Listar restaurantes")
    print("3. Ativar restaurante")
    print("4. Sair\n")

def voltar_ao_menu_principal():
    input("\nDigite qualquer tecla para voltar ao menu principal\n")
    main()

def finalizar_app():
    print("Encerrando o app")

def opcao_invalida():
    print("Opção inválida\n")
    voltar_ao_menu_principal()

def exibir_subtitulo(texto):
    linha = "*" * (len(texto) + 4)
    print(linha)
    print(texto)
    print(linha)
    print()

def cadastrar_novo_restaurante():
    exibir_subtitulo("Cadastro de restaurante")
    nome_restaurante = input("Digite o nome do restaurante: ")
    categoria = input(f"Digite a categoria do restaurante {nome_restaurante}: ")
    dados_restaurante = {"nome": nome_restaurante, "categoria": categoria, "ativo": False}
    restaurantes.append(dados_restaurante)
    print(f"Restaurante {nome_restaurante} for cadastrado com sucesso!")
    voltar_ao_menu_principal()

def listar_restaurantes():
    exibir_subtitulo("Listando todos os restaurantes")
    print(f"{"Nome do restaurante".ljust(22)} | {"Categoria".ljust(20)} | {"Status"}")
    for restaurante in restaurantes:
        nome_restaurante = restaurante["nome"]
        categoria = restaurante["categoria"]
        ativo = "Ativado" if restaurante["ativo"] else "Desativado"
        print(f"- {nome_restaurante.ljust(20)} | {categoria.ljust(20)} | {ativo}")
    voltar_ao_menu_principal()

def alternar_estado_restaurante():
    exibir_subtitulo("Alternando estado do restaurante")
    nome_restaurante = input("Digite o nome do restaurante que deseja alternar o estado: ")
    restaurante_encontrado = False
    for restaurante in restaurantes:
        if nome_restaurante == restaurante["nome"]:
            restaurante_encontrado = True
            restaurante["ativo"] = not restaurante["ativo"]
            mensagem = f"O restaurante {nome_restaurante} foi ativado com sucesso!" if restaurante["ativo"] else f"O Restaurante {nome_restaurante} foi desativado com sucesso!"
            print(mensagem)

    if not restaurante_encontrado:
        print("Restaurante não encontrado")

    voltar_ao_menu_principal()


def escolher_opcoes():
    try:
        opcao_escolhida = int(input("Escolha uma opção: "))
        # opcao_escolhida = int(opcao_escolhida)

        if opcao_escolhida == 1:
            cadastrar_novo_restaurante()
        elif opcao_escolhida == 2:
            listar_restaurantes()
        elif opcao_escolhida == 3:
            alternar_estado_restaurante()
        elif opcao_escolhida == 4:
            finalizar_app()
        else:
            opcao_invalida()
    except:
        opcao_invalida()

def main():
    exibir_nome_do_programa()
    exibir_opcoes()
    escolher_opcoes()

if __name__ == "__main__":
    main()