# Simulador de Granjeros y Clientes

## Descripción del Proyecto

Una empresa de alimentación nos ha contactado para desarrollar una aplicación que simule la realidad de granjeros. Los granjeros tienen un huerto local en el que pueden plantar distintos tipos de verduras para su venta a clientes en un restaurante vegano.

## Objetivo

Implementar una clase hilo que actúe como consumidor y otra que haga de productor. Estos hilos deben acceder a un recurso compartido en el que depositar o recoger los productos elaborados, teniendo en cuenta que estas acciones son secciones críticas.

## Ejemplo de Simulación

- Dos granjeros, Paco y Ramón, pueden plantar cada uno diez verduras.
- El huerto es común y el tiempo máximo de crecimiento es común para ambos.
- Cuando una verdura de Paco crece, la llevará al restaurante, donde habrá tres clientes: Faustino (consumirá cinco verduras), Mr. Gentleman (consumirá diez) y Loquendo (consumirá otras cinco).
- Solo uno podrá consumir la verdura de Paco, los demás deberán esperar.
- Cuando Paco o Ramón generen otra verdura y la lleven al restaurante, notificarán a los clientes que estén esperando, y así sucesivamente, hasta que todos hayan terminado de producir y consumir.
- Si Paco o Ramón llevan una verdura y el almacén está lleno, deben esperar a que algún cliente consuma una verdura. Cuando un cliente consuma una verdura, notificará a los granjeros de que hay hueco disponible en el almacén.

## Requisitos Funcionales

### Para el Granjero

- Debe haber un hilo que simule a un granjero y plante una verdura.
- Cada granjero sabe qué cantidad de verduras debe plantar.
- Un granjero puede plantar cualquiera de las siguientes verduras: lettuce, cabbage, onion, spinach, potato, celery, asparagus, radish, broccoli, artichoke, tomato, cucumber, eggplant, carrot y green bean.
- Cada verdura es única y tendrá un ritmo de crecimiento diferente e impredecible. El tiempo máximo de crecimiento es igual para todos.
- Cuando la verdura crezca, el granjero la llevará al restaurante.
- El restaurante tiene una capacidad de almacenamiento configurable y limitada. Si el almacén está lleno, el granjero debe esperar a que se consuma alguna verdura.

### Para el Cliente

- Debe haber un hilo que simule a un cliente y consuma una verdura.
- Cada cliente sabe qué cantidad de verduras va a consumir.
- Un cliente solo podrá consumir las verduras disponibles en el almacén del restaurante. Si no hubiera verduras disponibles, el cliente esperará hasta abastecimiento.
- El tiempo máximo de consumición de verduras es propio de cada cliente y variará con cada verdura.

## Ejercicio Práctico

Para la realización de esta práctica, es necesaria la implementación de hilos con recursos compartidos, efectuando esperas según convenga. El resultado del ejercicio práctico estará en la rama principal del repositorio.

## Integrantes

- Juan Sebastian Paez Delgado
- Juan Diego Paez Delgado

## Repositorio

- [Enlace al Repositorio](https://github.com/JSebastianPaezSalesianoDev/PGV-simulador-productor-consumidor.git)
