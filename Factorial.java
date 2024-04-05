def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n - 1)

def main():
    try:
        numero = int(input("Ingresa un número entero positivo para calcular su factorial: "))
        if numero < 0:
            print("El número ingresado debe ser positivo.")
        else:
            resultado = factorial(numero)
            print("El factorial de", numero, "es:", resultado)
    except ValueError:
        print("Entrada inválida. Debes ingresar un número entero.")

if __name__ == "__main__":
    main()
