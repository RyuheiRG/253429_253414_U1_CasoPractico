# U1_CasoPractico — USO DE ARREGLOS DE OBJETOS

**Materia:** Estructura de Datos  
**Unidad 1:** Caso práctico: Uso de arreglos de objetos  
**Integrantes:** 253429 – Ricardo Reyes Gómez | 253414 - Erick de Jesus Nafate Nafate  
**Lenguaje:** Java  

## Descripción

En una sala de cine se exibe un tablero con la información de las **cinco
películas** proyectadas para el fin de semana. De cada película se detalla el
**título**, el **género**, la **duración en minutos** y el **director**, incluyendo
su **nombre** y su **país de origen**.

Los espectadores pueden consultar el listado completo de las películas y, si
alguna resulta de su interés, consultar sus detalles.

Este programa implementa dicho tablero mediante una interfaz de consola.

## Requisitos

- JDK 8 o superior
- Compilador/IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

## Compilación y ejecución

```bash
javac Main.java
java ED_253429_253414_U1_CasoPractico.Main
```

## Uso del programa

1. Al iniciar se muestra el listado completo de las 5 películas (título y número de opción).
2. El sistema pregunta si desea ver los detalles de alguna película (**1 = Sí / 2 = No**).
3. Si responde **1**, se ingresa el número de la película y se muestran:
   - Título
   - Género
   - Duración (en minutos)
   - Director
   - Nacionalidad del director
4. Si responde **2**, el programa se despide y finaliza.
5. Las entradas no numéricas o fuera de rango se validan y se solicitan nuevamente.

### Ejemplo de salida

```
--------------------------------
Bienvenido a nuestro cine!
--------------------------------
Cartelera de películas:
--------------------------------
1. Título: Donnie Darko
--------------------------------
2. Título: Inception
...
--------------------------------
Desea ver los detalles de alguna pelicula? (1 = Si / 2 = No)
1
Ingrese el número de la película que desea ver: 2
--------------------------------
Detalles de la película:
Título: Inception
Género: Ciencia ficción, Acción, Thriller
Duración: 148 minutos
Director: Christopher Nolan
Nacionalidad del director: Reino Unido / Estados Unidos
```

## Estructura del proyecto

```
ED_253429_253414_U1_CasoPractico/
└── Main.java
```

## Requisitos funcionales cubiertos

- ✅ **Arreglo de objetos obligatorio**: `Pelicula[]` dentro de la clase `Cartelera`.
- ✅ Cinco películas cargadas con título, género, duración y director.
- ✅ El director incluye nombre y país de origen (clase `Director`).
- ✅ Listado completo de películas.
- ✅ Consulta de detalles de una película seleccionada.
- ✅ Validación de entrada del usuario.
