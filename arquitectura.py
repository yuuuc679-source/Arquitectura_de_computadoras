print("parte 1")
def bin8(n):
    return format(n & 0xFF, '08b')

n = 179
print("Original:",(n))

def rotar_izquierda(n, bits):
    return ((n << bits) | (n >> (8 - bits))) & 0xFF
def rotar_derecha(n, bits):
    return ((n >> bits) | (n << (8 - bits))) & 0xFF


print("Original:", bin8(n))

print("\nRotación izquierda 1:\n", bin8(rotar_izquierda(n,1)))
print("\nRotación izquierda 2:\n", bin8(rotar_izquierda(n,2)))

print("\nRotación derecha 1:\n", bin8(rotar_derecha(n,1)))

print("\nparte 2")

print("Original:",(n))
print("Número original")

print(bin8(n))

print("\nDesplazamiento lógico izquierda 1")
print(bin8(n << 1))

print("\nDesplazamiento lógico izquierda 2")
print(bin8(n << 2))

print("\nDesplazamiento lógico derecha 1")
print(bin8(n >> 1))

print("\nparte 3")

print("Número decimal:", n)
print("Binario:", bin8(n))

print("\nShift aritmético derecha 1")
print(bin8(n >> 1))

print("\nShift aritmético derecha 2")
print(bin8(n >> 2))
