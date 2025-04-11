from modelos.restaurante import Restaurante

restaurante_praca = Restaurante("praça da vila", "Gourmet")
restaurante_mexicano = Restaurante("maxican food", "Mexicana")
restaurante_japones = Restaurante("japa", "Japonesa")

restaurante_praca.receber_avaliaca("Gui", 5)
restaurante_praca.receber_avaliaca("Yas", 2)
restaurante_praca.receber_avaliaca("Carol", 3)


restaurante_japones.receber_avaliaca("Davi", 3)
restaurante_japones.receber_avaliaca("Vitória", 4)

def main():
    restaurante_mexicano.alternar_estado()
    Restaurante.listar_restaurantes()

if __name__ == "__main__":
    main()