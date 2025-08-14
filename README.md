# Clases POO

Este es un proyecto de programación orientada a objetos en Java que contiene la clase `Automovil`.

## Descripción

El proyecto incluye:
- **Automovil.java**: Clase principal que modela un automóvil con sus atributos y métodos básicos.
- **EjemploAutomovil.java**: Clase de ejemplo que muestra cómo usar la clase Automovil.

## Características de la clase Automovil

- Atributos: fabricante, modelo, color, cilindrada, capacidadTanque
- Métodos getter y setter para todos los atributos
- Métodos para acelerar, frenar y calcular consumo
- Sobrecarga de métodos para diferentes tipos de cálculos

## Cómo usar

```java
Automovil auto = new Automovil();
auto.asignarFabricante("Toyota");
auto.asignarModelo("Corolla");
auto.asignarColor("Rojo");
System.out.println(auto.verDetalle());
```
