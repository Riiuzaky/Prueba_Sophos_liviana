Feature: prueba Sophos flujo 3

  Scenario Outline: manejo alerts
    Given dado que el usuario <nombre> debe usar los alerts
    When cuando el use los botones e ingrese el <nombre>  en el alert correspondiente
    Then entonces se cierran los alerts y se muestra el mensaje de envio correcto

    Examples:
      | nombre     |
      | "Jonathan" |