import Euclides_Inversos
import random

print("\n\n-------- SISTEMA CRIPTOGRÁFICO RSA --------\n")

#Lista de Primos
primos = [283, 293, 307, 311, 313, 317, 331, 337, 347, 349,
353, 359, 367, 373, 379, 383, 389, 397, 401, 409,
419, 421, 431, 433, 439, 443, 449, 457, 461, 463,
467, 479, 487, 491, 499,503, 509, 521, 523, 541,
547, 557, 563, 569, 571, 577, 587, 593, 599, 601,
607, 613, 617, 619, 631, 641, 643, 647, 653, 659,
661, 673, 677, 683, 691, 701, 709, 719, 727, 733,
739, 743, 751, 757, 761, 769, 773, 787, 797, 809,
811, 821, 823, 827, 829, 839, 853, 857, 859, 863,
877, 881, 883, 887, 907, 911, 919, 929, 937, 941,
947, 953, 967, 971, 977, 983, 991, 997,1009, 1013,
1823, 1831, 1847, 1861, 1867, 1871, 1873, 1877, 1879, 1889,
1901, 1907, 1913, 1931, 1933, 1949, 1951, 1973, 1979, 1987,]

#Diccionario
diccionario = {
    "00": " ", 
    "01": "a", 
    "02": "b", 
    "03": "c",
    "04": "d", 
    "05": "e", 
    "06": "f", 
    "07": "g", 
    "08": "h", 
    "09": "i", 
    "10": "j", 
    "11": "k", 
    "12": "l", 
    "13": "m", 
    "14": "n", 
    "15": "ñ", 
    "16": "o", 
    "17": "p", 
    "18": "q", 
    "19": "r", 
    "20": "s", 
    "21": "t", 
    "22": "u", 
    "23": "v", 
    "24": "w", 
    "25": "x", 
    "26": "y", 
    "27": "z"
}

#p y q los escoge de la lista de primos 
# p = random.choice(primos)
p = 5
print("-- p: --")
print(p)

#Elimina la p que escogio para que no se pueda repetir la q
# primos.remove(p)

# q = random.choice(primos)
# primos.remove(q)
q=7
print("\n-- q: --")
print(q)

#n
n = p * q

#phi de n
phi = (p-1)*(q-1)
print("\n-- phi(n): --")
print(phi)

#e
e = int(input("\n--> INGRESE e (menor que phi(n) y primo relativo de phi(n)): "))

#d
d = Euclides_Inversos.inver(phi, e)

#Clave Pública
public_key = (n,e)

#Clave Privada
private_key = (n,d)

#Pedir mensaje
mensaje = input("\n--> INGRESE el mensaje: ")

#Encriptar
encriptar = []
for i in mensaje:
    for k,v in diccionario.items():
        if (v == i):
            k = int(k)
            expo_modular = (k ** e) % n
            expo_modular = str(expo_modular)
            if (len(expo_modular) == 1):
                expo_modular = '0' + expo_modular

            elif(len(expo_modular)%2) == 1:
                expo_modular = '0' + expo_modular
            
            encriptar.append(expo_modular)

c = ''
for x in encriptar:
    c = c +x + ""

#OUTPUT
print("\nCipher:")
print(c)

#Desencriptar
des = ''
cadenas  = []

for j in range(0, len(c), 2):
    cadenas.append(des[j:j+2])

for search in encriptar:
    if search.startswith("0"):
        search.replace("0", '')
    search = int(search)
    desencript = (search ** d) % n
    desencript = str(desencript)

    if len(desencript) == 1:
        desencript = "0" + des
    
    men = ""
    men = men + desencript

next_l = []
for t in range(0, len(men), 2):
    next_l.append(men[t:t+2])

desencriptado = ''
for s in next_l:
    for k,v in diccionario.items():
        if i == k:
            desencriptado = desencriptado + v


#OUTPUT
print(desencriptado)




