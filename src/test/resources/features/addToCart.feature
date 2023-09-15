#Author: Haider Fabian Tique
#Date:  14-09-2023

@DemoBlaze
Feature: Se requiere hacer pruebas a la parte de la tienda de DemoBlaze

  @AddToCart
  Scenario Outline: Agregar producto a la cesta de compras
    Given Se ingresa a la URL de DemoBlaze
    When Se selecicona el producto a comprar
    And Se agrega el producto a la cesta de compras
    Then Se valida que el producto se agrego de forma exitosa <mensaje>
  Examples:
    | mensaje       |
    | Product added |