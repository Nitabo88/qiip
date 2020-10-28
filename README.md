# qiip prueba
Automatización usando SerenityBDD con patron Screenplay.

## Ejecución casos de prueba
Correr las pruebas según el sistema operativo:
1. Bajar el driver acorde al sistema operativo y ponerlo en el path deseado
1. Ejecutar el siguiente comando en terminal según sea el sistema operativo.
    1. Windows
    ```
    gradlew clean test -Dwebdriver.chrome.driver=path del driver aggregate
    ```
    1. Linux
    ```
     ./gradlew clean test -Dwebdriver.chrome.driver=path del driver aggregate
    ```
1.Para ver el reporte ir al la siguiente ruta del proyecto 
```
target/site/serenity/index.html
```

## Reporte resumen
Para ver un reporte mas resumido ejecutar el siguiente comando en terminal:

```
gradlew reports
```

El resumen se visualizara en la siguiente ruta:
```
target/site/serenity/serenity-summary.html
```


## Componente Practico
##Pregunta
1. Vamos a realizar una integración con el API uvindex que se ocupa de ver el índice UV en tiempo
real basado en la localización cuya documentación se encuentra en la siguiente ruta:
https://www.openuv.io/uvindex
Para integrar esta API en nuestra aplicación nos preocupa la estabilidad que presenta el servicio que
nos presta el tercero y que liberen cambios que cambien la forma en que consumimos dicho API y
acudimos a usted por su conocimiento en pruebas para que proponga una estrategia que nos
permita tener tranquilidad sobre las integraciones con terceros.

```
R\= En el problema planteado estamos hablando de pruebas en microservicios. Por lo que es importante tener en cuenta la naturaleza de los mismos para plantear la estrategia de pruebas, que permita
 mayor eficacia a la hora de controlar comportamientos inesperados por parte de la api https://api.openuv.io/api/v1/uv. Por lo que la propuesta que se ejecutara sera basada en el HoneyComb testing en explicado en el
 componente teorico de la presente prueba.(Enviado en un audio). 
     1. Debemos definir  las “interacciones” entre cliente y proveedor. Es decir, qué debe responder el proveedor ante peticiones concretas del consumidor.
     2. Crearemos pruebas unitarias que “ejerciten” las interacciones anteriormente definidas.
```

###Como lo haremos?
```
La prueba se hara basada en la teoria de pruebas de contratos por lo que revisaremos la estructura y codigos de respuesta que nos da la aplicacion. En el escenario planteado se pueden hacer
multiples combinaciones. Pero en el caso de esta prueba automatizaremos los que considero mas criticos, ya que debemos garantizar que minimamente los errores controlados por el servidor, cuando el
consumidor envia una peticion y el caso de que el proceso fue exitoso. Se pueden ver los casos implementados en la siguiente ruta:

features/tiempo_real_api.feature
```

##Pregunta
1. Diseñe un script utilizando Screenplay para automatizar el flujo de compra de un producto en la
página https://www.demoblaze.com/index.html
Automatice únicamente el flujo feliz *
Indique qué otros escenarios probaría para verificar el correcto funcionamiento del flujo de compra
de productos *

```
La prueba se hara basada en lo que dice la piramide de cohn, en el caso de la presente prueba se automatizo un flujo feliz E2E ubicado en la ruta:
        features/compra_productos.feature
Ahora bien para comprar un producto, pero para garantizar que este flujo funciona adecuadamente la web requiere los siguientes tipos de prueba: Unitarias(Desarrollo), Componente, E2E, en el caso de
 esta pagina web se haria las dos ultimas por fronted, ya que no hay documentacion de servicios que la web consuma en backend, para complementar las pruebas. Las pruebas que se proponen son las
 siguientes unicamente enfocandonos en el flujo de compra:
1. Se debe verificar que las imagenes se carguen adecuadamente
2. Se debe verificar que el titulo, precio e informacion del producto concuerdan con el detalle del producto
3. Se debe verificar que el producto es agregado al carro de compras
4. Se debe verificar que la informacion mostrada en el carro de compras corresponde a la que tenia el producto previamente
5. Se debe verificar que el producto pueda ser eliminado del carro de compras y que el valor del producto eliminado se resta del total del carro
6. Se debe verificar que el Total del carro de compras corresponde a las suma de productos agregados
7. Se debe verificar que al realizar el checkout de la compra el formulario tiene la respectiva validacion de campos, por ejemplo: solo numerico de longitud 18 para tarjetas de credito.
8. Se debe verificar que al ejecutar la compra el detalle aparece corresponda a lo diligenciado y que esta informacion corresponda a la de la BD(Si se tiene acceso).
9. Se debe verificar que Pais y Ciudad sean campos tipo list estas deben estar relacionadas, no campos abiertos para tener integridad de datos en BD.
10. Se debe verificar que Mes y Año sean campos tipo list.
11. Se debe verificar que el carro de compra continua con los productos, si cancelo la ejecucion de la compra
12. Se debe verificar que el carro de compra queda vacio al ejecutarse la compra.
13. Se debe verificar que no se habilite el boton de ejecutar compra si el carro esta vacio.
14. Se debe verificar que se pueda comprar mas de un producto.

Algunas de las validaciones anteriores se hicieron en el escenario automatizado. 

features/tiempo_real_api.feature
```


