# language: es
@ADD_TO_CART_DEMO
Característica: Carro de compras

  @ADD_PRODUCT_TO_CART
  Esquema del escenario: Agregar producto al carro de compras
    Dado Que el usuario ingresa a Ali Express
    Cuando Ingresa en la barra de busqueda el producto a buscar
      | producto   |
      | <producto> |
    Y Selecciona agregar el primer producto
    Cuando Verifica el precio de la precompra
      | precio   |
      | <precio> |
    Y Termina de agregar el producto
    E Ingresa al carro de compras
    Entonces Verifica el precio de la compra
      | precio   |
      | <precio> |



    Ejemplos:
      | producto        | precio          |
      | Nintendo switch | COP2.101.998,29 |















