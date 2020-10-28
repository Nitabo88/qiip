# language: es

Característica: Compra producto en demoblaze
  Como cliente de demoblaze
  Quiero comprar un producto que ofrece la pagina web

  Esquema del escenario: Comprar producto en demoblaze de manera exitosa.
    Dado que un cliente esta en la pagina de demoblaze
    Cuando el cliente agrega los productos <productos> de las categorías <categorias> al carro de compra
    Y hace el proceso de pago del producto
    Entonces el cliente puede ver que su compra fue efectuada

    Ejemplos:
      | productos                                   | categorias |
      | Iphone 6 32gb                               | Phones     |
      | Samsung galaxy s6,Nexus 6,HTC One M9        | Phones     |
      | Sony vaio i5                                | Laptops    |
      | Sony vaio i5,Dell i7 8gb                    | Laptops    |
      | Apple monitor 24                            | Monitors   |
      | Apple monitor 24,ASUS Full HD               | Monitors   |
      | Samsung galaxy s6,Sony vaio i5,ASUS Full HD | All        |

