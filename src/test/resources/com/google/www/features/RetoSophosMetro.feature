Feature: Validar agregar al carrito

  @Metro
  Scenario Outline: Caso exitoso agregar al carrito
    Given Estando en la pagina princial de metro
    When Ingreso a categorias y subcategoria "<subcategoria>"
    And Selecciono primer producto
    Then Valido titulo del carrito "<mensaje>"

    Examples: 
      | subcategoria | mensaje       |
      | Tecnología   | Tienes 1 item |
