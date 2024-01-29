Feature: Como usuario de cinemark deseo registrarme e ingresar al portal

  @CrearCuenta @r
  Scenario Outline: Crear cuenta
    Given Esta en la pagina de inicio de sesion
    When me registro con los datos "<TipoPersona>","<TipoDocumento>","<Nombres>","<Apellidos>","<Genero>","<NumeroDocumento>","<FechaNacimiento>","<Celular>","<Direccion>","<CorreoElectronico>","<ConfirmarCorreo>","<Pass>","<ConfirmarPass>","<Ciudad>"
    Then valido el correcto registro

    Examples:
      |TipoPersona | TipoDocumento  | Nombres   | Apellidos  | Genero    | NumeroDocumento | FechaNacimiento | Celular    | Direccion     | CorreoElectronico    | ConfirmarCorreo      | Pass         | ConfirmarPass | Ciudad |
      | Natural    | Pasaporte      | Sebastian | Monroy     | Masculino | 79545883        | 1997-04-22      | 3125151822 | cll falsa 123 | prubas9645@gmail.com | prubas9645@gmail.com | Colombia2023 | Colombia2023  | Bogota |

  @IniciarSesion @r
  Scenario Outline: Login
    Given Esta en la pagina de inicio de sesion
    When Se introducen los datos de inicio de sesion "<Correo>", Correo "<pass>", contrasena
    Then validacion de ingreso

    Examples:
     |Correo                          | pass          |
     | cinemarkprueba123@cinemark.com | Colombia2024  |


  @ComprarPelicula @r
  Scenario Outline: Comprar pelicula
   Given Esta en la pagina de inicio de sesion
    And Se introducen los datos de inicio de sesion "<Correo>", Correo "<pass>", contrasena
   And El usuario selecciona una pelicula
   And Selecciona teatro y horario
   And Selecciona las sillas y continua
   And El usuario selecciona la comida y continua
   And Se completan los datos faltantes
   When Se paga con tarjeta de credito
   Then Se visualiza el codigo qr

    Examples:
      |Correo                          | pass          |
      | cinemarkprueba123@cinemark.com | Colombia2024  |