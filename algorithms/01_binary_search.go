package main //definindo o pacote em comum

import "fmt" //importando a biblioteca fmt que é responsável por formatar a saída de texto e entrada

func pesquisa_binaria(lista []int, item int) int { // recebe lista array de int, um item int, e retorna um int
	baixo := 0
	alto := len(lista) - 1
	for baixo <= alto {
		meio := (baixo + alto) / 2
		chute := lista[meio]
		if chute == item {
			return meio
		}
		if chute > item {
			alto = meio - 1
		} else {
			baixo = meio + 1
		}
	}
	return -1
}

func main() {
	fmt.Println(pesquisa_binaria([]int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 6))  // 0
}