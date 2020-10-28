# language: es

Característica: Consumo la aplicacion de tiempo real
  Como administrador del proyecto
  Quiero probar la API de tiempo real de Open UV
  Para ver la estabilidad de la misma.

  Esquema del escenario: Tiempo Real Open UV
    Cuando el usuario envía una petición a la API Real-time <request>
    Entonces el usuario puede ver que la estructura <structure> y el código <code> es el esperado

    Ejemplos:
      | request                                              | structure     | code |
      | 908752f6a5c799c4facdc2a1527cded9,-39.04,-77.49,,,,1  | realTime.json | 200  |
      | ,-39.04,-77.49,,,,1                                  | error.json    | 403  |
      | 908752f6a5c799c4facdc2a1527cded9,-91.00,-181.00,,,,1 | error.json    | 422  |
      | 908752f6a5c799c4facdc2a1527cded9,,,,,,1              | error.json    | 500  |