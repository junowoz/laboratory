print(2+2)
#comment
"""comentario
    largo
"""

1+2
3-3
4*4
5/8

a = "Hola"
print(a)
#tambien hay listas, se usa [] y lo primero es 0 y lo segundo 1

list = ["HI", "Ciao"]
print(list[1])

#tambien puedo crear un diccionario, se usa {} y : ejemplo

diccionario = {"colores" : "azul"}

print(diccionario["colores"])
#tambien puedo crear un set, pero no se pone : se usa {} y se ignoran valores repetidos

diccionario = {1,2,3,4,5,5,5,5,6,6,6,6}

print(diccionario)

#condicionales

if 1==1:
    print("verdad")
#booleanos

True and False
True or False

#loops = for y while

for item in list: #porque ya tengo una lista llamada lista
    print(item)

#tambien puedo printear numeros ejemplo

for i in range(0,3):
    print(i)

#tambien tengo los whiles

x = 10
while x > 0:
    print(x)
    x -= 1 # para evitar que se haga un loop infinito

#puedo crear una excepcion, digamos no tengo un item 2 en mi list y en vez de que me salga index error puedo poner algun mensaje a gusto, por ejemplo

try:
    print(list[2])
except IndexError:
    print("no se encuentra")

#puedo crear una funcion para correr un codigo muchas veces

def funcion():
    print("hello")


funcion();funcion();funcion() # en este caso uso punto y coma

# puedo crear clases y herencias para POO
#puedo traer modulos también ejemplo
import math

print(math.pi)
