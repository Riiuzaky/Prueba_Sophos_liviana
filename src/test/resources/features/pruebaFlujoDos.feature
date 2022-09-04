Feature: prueba Sophos flujo 2

  Scenario Outline: seleccionar fecha data picker
    Given dado que el usuario <firstName> debe ingresar una fecha
    When cuando el ingrese los datos <year> <month> <day> <time> en el datapicker
    Then entonces se debera observar la fecha <year> <month> <day> <time> en el datapicker

    Examples:
      | firstName  | year   | month  | day  | time    |
      | "Jonathan" | "2016" | "June" | "25" | "12:15" |

