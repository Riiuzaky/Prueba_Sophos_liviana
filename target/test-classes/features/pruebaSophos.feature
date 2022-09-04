Feature: prueba Sophos flujo 1

  Scenario Outline: agregar registro en la tabla
    Given dado que el usuario <firstName> debe registrar los datos en la compania
    When cuando el ingrese los datos <firstName> <lastName> <email> <age> <salary> <departament> en el formulario
    Then entonces se debera observar sus datos <firstName> <lastName> <email> <age> <salary> <departament> en la tabla

    Examples:
      | firstName  | lastName | email                | age  | salary    | departament |
      | "Jonathan" | "cruz"   | "jonathan@gmail.com" | "24" | "4500000" | "QA"        |


  Scenario Outline: eliminar registro en la tabla
    Given dado que el usuario <firstName> debe registrar los datos en la compania
    When cuando el encuentre el registro con los datos <firstName> <lastName> en la tabla
    Then entonces no se debera observar sus datos <firstName> <lastName> en la tabla

    Examples:
      | firstName | lastName |
      | "Kierra"  | "Gentry" |